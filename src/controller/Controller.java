package controller;

import javax.swing.JOptionPane;
import model.Dealer;
import model.Deck;
import model.Player;
import model.Statistics;

/**
 * Handles most of the game logic.
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
     * Controller Constructor: Initializes score to 0.
     */
    public Controller() {

        balance = 1000.0;
        bet = 100.0;

        // create new populated deck
        deck = new Deck();
        deck.populate();
        deck.shuffle();

        // create new empty deck
        discarded = new Deck();

        // create new dealer and player
        dealer = new Dealer();
        player = new Player();
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        if (bet < balance) {
            this.bet = bet;
        } else { // in case they try to make a bet bigger than their balance
            JOptionPane.showMessageDialog(null, "You don't have that much money");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Handles logic for each round.
     *
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

    public String checkWhoWins() {

        // check if dealer has blackjack
        if (dealer.hasBlackjack()) {
            dealer.printHand(); // show full hand

            if (player.hasBlackjack()) {
                stats.incrementPushes();
                return "You both have 21 - Push";
            } else {
                balance -= bet;
                stats.incrementLosses();
                dealer.printHand();
                return "Dealer has BlackJack - You lose";
            }
        }

        // check if player has blackjack
        if (player.hasBlackjack()) {
            balance += bet * 1.5;
            stats.incrementWins();
            return "You have BlackJack - You win";
        }

        // check whether player busted
        if (player.getHand().calculateValue() > 21) {
            balance -= bet;
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
            stats.incrementWins();
            return "Dealer busts - You win";
        }

        if (dealer.getHand().calculateValue() > player.getHand().calculateValue() && dealer.getHand().calculateValue() <= 21) {
            balance -= bet;
            stats.incrementLosses();
            return "You lose";
        }

        if (player.getHand().calculateValue() > dealer.getHand().calculateValue()) {
            balance += bet;
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
