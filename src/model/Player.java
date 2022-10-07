package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Handles player specific operations, such as deciding to hit or stand.
 * 
 * @author Michael
 */
public class Player extends Person {

    /**
     * Creates a new player
     */
    public Player() {
        super.setName("Player");
    }
    
    public void makeDecision() {
        // TODO
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