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
    private double bet, balance;
    private int wins, losses, pushes;
    

    /**
     * Controller Constructor:
     * Initializes score to 0
     */
    public Controller() {

        wins = 0;
        losses = 0;
        pushes = 0;
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
        if(bet < balance) {
            this.bet = bet;
        } else { // in case they try to make a bet bigger than their balance
            System.out.println("You don't have that much money"); // TODO: change to message dialog
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Handles logic for each round
     * 
     */
    public void startRound() {

        // if we run out of cards
        dealer.getHand().discardHandToDeck(discarded);
        player.getHand().discardHandToDeck(discarded);
            
        // make sure deck has at least 4 cards left
        if(deck.cardsLeft() < 4) {
            deck.reloadDeckFromDiscard(discarded);
        }

        // give the dealer 2 cards
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        // give the player 2 cards
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

//        // print their hands
//        dealer.printFirstHand();
//        player.printHand();
        
        // TODO: move
        player.makeDecision(deck, discarded); 

    }

    public String checkWhoWins() {
        
        // check if dealer has blackjack
        if (dealer.hasBlackjack()) {
            dealer.printHand(); // show full hand

            if (player.hasBlackjack()) {
                ++pushes;
                return "You both have 21 - Push";
            } else {
                balance -= bet;
                ++losses;
                dealer.printHand();
                return "Dealer has BlackJack. You lose.";
            }
        }

        // check if player has blackjack
        if(player.hasBlackjack()) {
            System.out.println("You have BlackJack. You win.");
            balance += bet * 1.5;
            ++wins;
            startRound();
        }

        // check whether player busted
        if(player.getHand().calculateValue() > 21) {
            balance -= bet;
            ++losses;
            return "Busted";
        }
        
        // dealer's turn
        dealer.printHand();
        while(dealer.getHand().calculateValue() < 17) {
            dealer.hit(deck, discarded);
        }
        
        // check who wins
        if(dealer.getHand().calculateValue() > 21) {
            balance += bet;
            ++wins;
            return "Dealer busts";
        }
        
        if(dealer.getHand().calculateValue() > player.getHand().calculateValue() && dealer.getHand().calculateValue() <= 21) {
            balance -= bet;
            ++losses;
            return "You lose";
        }

        if(player.getHand().calculateValue() > dealer.getHand().calculateValue()) {
            balance += bet;
            ++wins;
            return "You win";
        }
        
        if(player.getHand().calculateValue() == dealer.getHand().calculateValue()) {
            ++pushes;
            return "Push";
        }
        
        return "Something went wrong";
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
     * @return dealer hand
     */
    public String displayDealerHand() {
        return dealer.printHand();
    }

}
