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