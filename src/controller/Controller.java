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

    private Deck deck, discarded;

    private Dealer dealer;
    private Player player;
    private double bet, balance;
    private Statistics stats = new Statistics();

    /**
     * Creates a new instance of the Controller class. Initializes the dealer
     * and player, the deck and discarded decks, and the bet and balance of the
     * player. The deck is also populated and shuffled.
     */
    public Controller() {
        // create new dealer and player
        dealer = new Dealer();
        player = new Player();

        balance = player.getBalance();
        bet = 100.0;

        // create new populated deck
        deck = new Deck();
        deck.populate();
        deck.shuffle();

        // create new empty deck
        discarded = new Deck();
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

        // if we run out of cards
        dealer.getHand().discardHandToDeck(discarded);
        player.getHand().discardHandToDeck(discarded);

        // make sure deck has at least 4 cards left
        if (deck.cardsLeft() < 4) {
            deck.reloadDeckFromDiscard(discarded);
        }

        // give the dealer 2 cards
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        // give the player 2 cards
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

    }

    /**
     * Checks who wins the game and returns a message indicating the result.
     * Increments game statistics for wins, losses, and pushes.
     *
     * @return a message indicating the result of the game
     */
    public String checkWhoWins() {

        // check if dealer has blackjack
        if (dealer.hasBlackjack()) {
            dealer.printHand(); // show full hand

            if (player.hasBlackjack()) {
                stats.incrementPushes();
                return "You both have 21 - Push";
            } else {
                balance -= bet;
                player.setBalance(balance);
                stats.incrementLosses();
                dealer.printHand();
                return "Dealer has BlackJack - You lose";
            }
        }

        // check if player has blackjack
        if (player.hasBlackjack()) {
            balance += bet * 1.5;
            player.setBalance(balance);
            stats.incrementWins();
            return "You have BlackJack - You win";
        }

        // check whether player busted
        if (player.getHand().calculateValue() > 21) {
            balance -= bet;
            player.setBalance(balance);
            stats.incrementLosses();
            return "Busted";
        }

        // dealer's turn
        dealer.printHand();
        while (dealer.getHand().calculateValue() < 17) {
            dealer.hit(deck, discarded);
        }

        // check who wins
        if (dealer.getHand().calculateValue() > 21) {
            balance += bet;
            player.setBalance(balance);
            stats.incrementWins();
            return "Dealer busts - You win";
        }

        if (dealer.getHand().calculateValue() > player.getHand().calculateValue() && dealer.getHand().calculateValue() <= 21) {
            balance -= bet;
            player.setBalance(balance);
            stats.incrementLosses();
            return "You lose";
        }

        if (player.getHand().calculateValue() > dealer.getHand().calculateValue()) {
            balance += bet;
            player.setBalance(balance);
            stats.incrementWins();
            return "You win";
        }

        if (player.getHand().calculateValue() == dealer.getHand().calculateValue()) {
            stats.incrementPushes();
            return "Push";
        }

        return "Something went wrong";
    }

    /**
     * Hits the player with a card.
     */
    public void hitPlayer() {
        player.hit(deck, discarded);
    }

    /**
     *
     * @return player hand
     */
    public String displayPlayerHand() {
        return player.printHand();
    }

    /**
     *
     * @return the value of the player's hand
     */
    public String displayPlayerHandValue() {
        return Integer.toString(player.getHand().calculateValue());
    }

    /**
     *
     * @return dealer hand
     */
    public String displayDealerHand() {
        return dealer.printHand();
    }

    /**
     *
     * @return value of dealer's hand
     */
    public String displayDealerHandValue() {
        return Integer.toString(dealer.getHand().calculateValue());
    }

    /**
     *
     * @return dealer's first card
     */
    public String displayDealerFirstCard() {
        return dealer.printFirstHand();
    }

    /**
     *
     * @return value of the first card
     */
    public String displayDealerFirstCardValue() {
        return dealer.printFirstCardValue();
    }

}
