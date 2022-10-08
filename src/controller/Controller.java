package controller;

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
    private int wins, losses, pushes;

    /**
     * Controller Constructor:
     * Initialises score to 0
     */
    public Controller() {

        wins = 0;
        losses = 0;
        pushes = 0;

        deck = new Deck(); // creates new populated deck
        deck.populate();
        deck.shuffle();

        discarded = new Deck(); // creates new empty deck

        dealer = new Dealer();
        player = new Player();

        startRound();
    }

    /**
     * Handles logic for each round
     */
    private void startRound() {

        // if we run out of cards
        if(wins > 0 || losses > 0 || pushes > 0) {
            System.out.println("\nStarting next round...\nWins: " + wins + "\nLosses: " + losses + "\nPushes: " + pushes);
            dealer.getHand().discardHandToDeck(discarded);
            player.getHand().discardHandToDeck(discarded);
            
            // make sure deck has at least 4 cards left
            if(deck.cardsLeft() < 4) {
                deck.reloadDeckFromDiscard(discarded);
            }
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
                ++losses;
                startRound();
            }
        }

        // check if player has blackjack
        if(player.hasBlackjack()) {
            System.out.println("You have BlackJack. You win.");
            ++wins;
            startRound();
        }
        
        player.makeDecision(deck, discarded);

        // check whether they busted
        if(player.getHand().calculateValue() > 21) {
            System.out.println("Busted");
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
            ++wins;
        }

        if(dealer.getHand().calculateValue() > player.getHand().calculateValue()) {
            System.out.println("You lose");
            ++losses;
        }

        if(player.getHand().calculateValue() > dealer.getHand().calculateValue()) {
            System.out.println("You win");
            ++wins;
        }
        
        if(player.getHand().calculateValue() == dealer.getHand().calculateValue()) {
            System.out.println("Push");
            ++pushes;
        }
        
        // start a new round
        startRound();
        
    }

}
