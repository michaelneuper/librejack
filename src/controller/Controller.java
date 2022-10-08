package controller;

import javax.swing.JOptionPane;

import model.Dealer;
import model.Deck;
import model.Player;

/**
 * Handles most of the game logic
 * 
 * @author Michael
 */
public class Controller {

    private Deck deck, discarded;

    private Dealer dealer;
    private Player player;
    private double bet, balance;
    private int wins, losses, pushes;
    

    /**
     * Controller Constructor:
     * Initialises score to 0
     */
    public Controller() {

        wins = 0;
        losses = 0;
        pushes = 0;
        balance = 1000.0;

        deck = new Deck(); // creates new populated deck
        deck.populate();
        deck.shuffle();

        discarded = new Deck(); // creates new empty deck

        dealer = new Dealer();
        player = new Player();
    }

    /**
     * Handles logic for each roun
     * 
     */
    public void startRound() {

        // if we run out of cards
        if(wins > 0 || losses > 0 || pushes > 0) { // TODO: change code :)
            System.out.println("\nStarting next round...\nWins: " + wins + "\nLosses: " + losses + "\nPushes: " + pushes + "\nBalance: " + balance);
            dealer.getHand().discardHandToDeck(discarded);
            player.getHand().discardHandToDeck(discarded);
            
            // make sure deck has at least 4 cards left
            if(deck.cardsLeft() < 4) {
                deck.reloadDeckFromDiscard(discarded);
            }
       }

        // ask the player what their bet is  
        bet = Double.parseDouble(JOptionPane.showInputDialog("Enter a bet amount"));

        if(bet > balance) { // in case the player tries to bet more than they have
            System.out.println("You don't have that much money! Please try again");
            bet = Double.parseDouble(JOptionPane.showInputDialog("Enter a bet amount"));
        }

        // give the dealer 2 cards
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        // give the player 2 cards
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        // print their hands
        dealer.printFirstHand();
        player.printHand();

        // check if dealer has blackjack
        if (dealer.hasBlackjack()) {
            dealer.printHand(); // show full hand

            if (player.hasBlackjack()) {

                System.out.println("You both have 21 - Push");
                ++pushes;
                startRound();

            } else {

                System.out.println("Dealer has BlackJack. You lose.");
                dealer.printHand();
                balance -= bet;
                ++losses;
                startRound();
            }
        }

        // check if player has blackjack
        if(player.hasBlackjack()) {
            System.out.println("You have BlackJack. You win.");
            balance += bet * 1.5;
            ++wins;
            startRound();
        }
        
        player.makeDecision(deck, discarded);

        checkWhoWins();

        // start a new round
        startRound();
    }

    private void checkWhoWins() {

        // check whether player busted
        if(player.getHand().calculateValue() > 21) {
            System.out.println("Busted");
            balance -= bet;
            ++losses;
            startRound();
        }
        
        // dealer's turn
        dealer.printHand();
        while(dealer.getHand().calculateValue() < 17) {
            dealer.hit(deck, discarded);
        }
        
        // check who wins
        if(dealer.getHand().calculateValue() > 21) {
            System.out.println("Dealer busts");
            balance += bet;
        }
        
        if(dealer.getHand().calculateValue() > player.getHand().calculateValue() && dealer.getHand().calculateValue() <= 21) {
            System.out.println("You lose");
            balance -= bet;
            ++losses;
        }

        if(dealer.getHand().calculateValue() > player.getHand().calculateValue()) {
            System.out.println("You lose");
            balance -= bet;
            ++losses;
        }

        if(player.getHand().calculateValue() > dealer.getHand().calculateValue()) {
            System.out.println("You win");
            balance += bet;
            ++wins;
        }
        
        if(player.getHand().calculateValue() == dealer.getHand().calculateValue()) {
            System.out.println("Push");
            ++pushes;
        }
    }

}
