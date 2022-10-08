package model;

import java.util.Scanner;

/**
 * Handles player specific operations, such as deciding to hit or stand.
 * 
 * @author Michael
 */
public class Player extends Person {

    Scanner input = new Scanner(System.in);

    /**
     * Creates a new player
     */
    public Player() {
        super.setName("Player");
    }
    
    /**
     *  Allows the player to decide to hit or stand
     * @param deck deck to draw from
     * @param discard deck to discard to
     */
    public void makeDecision(Deck deck, Deck discard) {
        
        int decision = 0;
        boolean getNum = true;

        while(getNum) {
            try {
                System.out.println("Would you like to Hit[1] or Stand[2]");
                decision = input.nextInt();
                getNum = false;

            } catch (Exception e) {
                System.out.println("Invalid");
                input.next();
            }
        }
        
        // if they decide to hit
        if (decision == 1) {

            this.hit(deck, discard); // hit the deck and discard

            if(this.getHand().calculateValue() > 20) {
                return; // return if they have blackjack or busted
            } else {
                this.makeDecision(deck, discard); // allow them to hit or stand if they don't have 21 or blackjack
            }
        } else {
            System.out.println("You stand."); // assume they stand if they hit a number other than 1
        }
    }

    // Deck playerDeck = new Deck(); // empty deck for the player
    // // private double balance;
    // // try {
    // // Scanner scFile = new Scanner(new File("db/balance.txt"));
    // // balance = scFile.nextDouble();
    // // } catch (FileNotFoundException e) {
    // // System.out.println(e);
    // // }
    // double balance = 100.00d;

    // Scanner betAmount = new Scanner(System.in);
}