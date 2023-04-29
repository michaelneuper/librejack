package controller;

import javax.swing.JOptionPane;
import model.Dealer;
import model.Deck;
import model.Player;
import model.Statistics;

/**
 * <p>
 * The Controller class is responsible for handling most of the game logic for a
 * Blackjack game.</p>
 * <p>
 * It creates a new instance of the Dealer and Player classes, initializes the
 * deck with a new shuffled and populated Deck object, and keeps track of the
 * bet and balance of the player. It also keeps track of game statistics using a
 * Statistics object.</p>
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Controller {

    private final Deck DECK;
    private final Deck DISCARDED;

    private final Dealer DEALER;
    private final Player PLAYER;
    private final Statistics STATS;

    private double bet, balance;
    private boolean hasPlayed;

    /**
     * Creates a new instance of the Controller class. Initializes the dealer
     * and player, the deck and discarded decks, and the bet and balance of the
     * player. The deck is also populated and shuffled.
     */
    public Controller() {
        this.STATS = new Statistics();

        // create new dealer and player
        DEALER = new Dealer();
        PLAYER = new Player();

        balance = PLAYER.getBalance();
        bet = 100.0;

        // create new populated deck
        DECK = new Deck();
        DECK.populate();
        DECK.shuffle();

        // create new empty deck
        DISCARDED = new Deck();
    }

    /**
     * Gets the current player's bet.
     *
     * @return the current player's bet
     */
    public double getBet() {
        return bet;
    }

    /**
     * Sets the current player's bet. If it is greater than the total balance,
     * an error is displayed.
     *
     * @param bet the bet amount
     */
    public void setBet(double bet) {
        if (bet < balance) {
            this.bet = bet;
        } else { // in case they try to make a bet bigger than their balance
            JOptionPane.showMessageDialog(null, "You don't have that much money");
        }
    }

    /**
     * Gets the current player's balance.
     *
     * @return the current player's balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the current player's balance.
     *
     * @param balance player's balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * <p>
     * Starts a new round of the game.</p>
     * <p>
     * Discards the dealer and player hands to the discarded deck if there are
     * no cards left, and reloads the deck from the discarded deck if there are
     * fewer than four cards left. Deals two cards to the dealer and two cards
     * to the player.</p>
     */
    public void startRound() {

        hasPlayed = false;

        // if we run out of cards
        DEALER.getHand().discardHandToDeck(DISCARDED);
        PLAYER.getHand().discardHandToDeck(DISCARDED);

        // make sure deck has at least 4 cards left
        if (DECK.cardsLeft() < 4) {
            DECK.reloadDeckFromDiscard(DISCARDED);
        }

        // give the dealer 2 cards
        DEALER.getHand().takeCardFromDeck(DECK);
        DEALER.getHand().takeCardFromDeck(DECK);

        // give the player 2 cards
        PLAYER.getHand().takeCardFromDeck(DECK);
        PLAYER.getHand().takeCardFromDeck(DECK);

    }

    /**
     * Checks who wins the game and returns a message indicating the result.
     * Increments game statistics for wins, losses, and pushes.
     *
     * @return a message indicating the result of the game
     */
    public String checkWhoWins() {
        if (hasPlayed) {
            JOptionPane.showMessageDialog(null, "Press deal before you can hit or stand again");
            return "Press Deal";
        }

        // check whether player has enough money
        if (bet > PLAYER.getBalance()) {
            JOptionPane.showMessageDialog(null, "You don't have enough money");
            return null;
        }

        // check if dealer has blackjack
        if (DEALER.hasBlackjack()) {
            DEALER.printHand(); // show full hand
            hasPlayed = true;

            if (PLAYER.hasBlackjack()) {
                STATS.incrementPushes();
                return "PUSHED!";
            } else {
                balance -= bet;
                PLAYER.setBalance(balance);
                STATS.incrementLosses();
                DEALER.printHand();
                return "LOST!";
            }
        }

        // check if player has blackjack
        if (PLAYER.hasBlackjack()) {
            balance += bet * 1.5;
            PLAYER.setBalance(balance);
            STATS.incrementWins();
            hasPlayed = true;
            return "WON!";
        }

        // check whether player busted
        if (PLAYER.getHand().calculateValue() > 21) {
            balance -= bet;
            PLAYER.setBalance(balance);
            STATS.incrementLosses();
            hasPlayed = true;
            return "BUSTED!";
        }

        // dealer's turn
        DEALER.printHand();
        while (DEALER.getHand().calculateValue() < 17) {
            DEALER.hit(DECK, DISCARDED);
        }

        // check who wins
        if (DEALER.getHand().calculateValue() > 21) {
            balance += bet;
            PLAYER.setBalance(balance);
            STATS.incrementWins();
            hasPlayed = true;
            return "WON!";
        }

        if (DEALER.getHand().calculateValue() > PLAYER.getHand().calculateValue()
                && DEALER.getHand().calculateValue() <= 21) {
            balance -= bet;
            PLAYER.setBalance(balance);
            STATS.incrementLosses();
            hasPlayed = true;
            return "LOST!";
        }

        if (PLAYER.getHand().calculateValue() > DEALER.getHand().calculateValue()) {
            balance += bet;
            PLAYER.setBalance(balance);
            STATS.incrementWins();
            hasPlayed = true;
            return "WON!";
        }

        if (PLAYER.getHand().calculateValue() == DEALER.getHand().calculateValue()) {
            STATS.incrementPushes();
            hasPlayed = true;
            return "PUSHED!";
        }

        return null;
    }

    /**
     * Hits the player with a card.
     */
    public void hitPlayer() {
        PLAYER.hit(DECK, DISCARDED);
    }

    /**
     *
     * @return player hand
     */
    public String displayPlayerHand() {
        return PLAYER.printHand();
    }

    /**
     *
     * @return the value of the player's hand
     */
    public String displayPlayerHandValue() {
        return Integer.toString(PLAYER.getHand().calculateValue());
    }

    /**
     *
     * @return dealer hand
     */
    public String displayDealerHand() {
        return DEALER.printHand();
    }

    /**
     *
     * @return value of dealer's hand
     */
    public String displayDealerHandValue() {
        return Integer.toString(DEALER.getHand().calculateValue());
    }

    /**
     *
     * @return dealer's first card
     */
    public String displayDealerFirstCard() {
        return DEALER.printFirstHand();
    }

    /**
     *
     * @return value of the first card
     */
    public String displayDealerFirstCardValue() {
        return DEALER.printFirstCardValue();
    }

}
