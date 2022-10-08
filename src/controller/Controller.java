package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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

        readStats("db/stats.txt");

        deck = new Deck(); // creates new populated deck
        deck.populate();
        deck.shuffle();

        discarded = new Deck(); // creates new empty deck

        dealer = new Dealer();
        player = new Player();
    }

    /**
     * Handles logic for each round
     */
    public void startRound() {

        // if we run out of cards
        if (wins > 0 || losses > 0 || pushes > 0) {
            System.out.println("\nStarting next round...\nWins: " + wins + "\nLosses: " + losses + "\nPushes: " + pushes);
            dealer.getHand().discardHandToDeck(discarded);
            player.getHand().discardHandToDeck(discarded);

            // make sure deck has at least 4 cards left
            if (deck.cardsLeft() < 4) {
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
        if (player.hasBlackjack()) {
            System.out.println("You have BlackJack. You win.");
            ++wins;
            startRound();
        }

        player.makeDecision(deck, discarded);

        // check whether they busted
        if (player.getHand().calculateValue() > 21) {
            System.out.println("Busted");
            ++losses;
            startRound();
        }

        // dealer's turn
        dealer.printHand();
        while (dealer.getHand().calculateValue() < 17) {
            dealer.hit(deck, discarded);
        }

        // check who wins
        if (dealer.getHand().calculateValue() > 21) {
            System.out.println("Dealer busts");
            ++wins;
        }

        if (dealer.getHand().calculateValue() > player.getHand().calculateValue()) {
            System.out.println("You lose");
            ++losses;
        }

        if (player.getHand().calculateValue() > dealer.getHand().calculateValue()) {
            System.out.println("You win");
            ++wins;
        }

        if (player.getHand().calculateValue() == dealer.getHand().calculateValue()) {
            System.out.println("Push");
            ++pushes;
        }

        // start a new round
        writeStats("db/stats.txt");
        startRound();

    }

    /**
     * Reads wins, losses and pushes from file
     * 
     * @param inFile file to be read from
     */
    public void readStats(String inFile) {
        try {

            Scanner scFile = new Scanner(new File(inFile));
            int wins = this.wins;
            int losses = this.losses;
            int pushes = this.pushes;

            while (scFile.hasNext()) {
                Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter(":");

                wins = scLine.nextInt();
                losses = scLine.nextInt();
                pushes = scLine.nextInt();

                scLine.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error:\n" + e);
        }
    }

    /**
     * Writes wins, losses and pushes to file
     * 
     * @param inFile file to be written to
     */
    public void writeStats(String inFile) {
        try {
            for (int i = 0; i < 3; i++) {

                if (i == 0) {
                    PrintWriter outFile = new PrintWriter(new FileWriter(inFile, false));
                    outFile.print("wins:" + this.wins);
                    outFile.close();
                }

                if (i == 1) {
                    PrintWriter outFile = new PrintWriter(new FileWriter(inFile, true));
                    outFile.print("losses:" + this.losses);
                    outFile.close();
                }

                if (i == 1) {
                    PrintWriter outFile = new PrintWriter(new FileWriter(inFile, true));
                    outFile.print("pushes:" + this.pushes);
                    outFile.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Error:\n" + e);
        }
    }

}
