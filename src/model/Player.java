package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Represents a player in a Blackjack game.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Player extends Person {

    private double balance; // Player's balance
    private final String BALANCE_FILE = "db/balance.txt"; // File to store the player's balance
    private Scanner input = new Scanner(System.in);

    /**
     * Creates a new player with a default name of "Player".
     */
    public Player() {
        super.setName("Player");
    }

    /**
     * Gets the player's current balance from a file.
     *
     * @return balance the player's current balance
     */
    public double getBalance() {
        try {
            Scanner scFile = new Scanner(new File(BALANCE_FILE));
            this.balance = scFile.nextDouble();
            scFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + BALANCE_FILE + " not found.");
        }

        return this.balance;
    }

    /**
     * Sets the player's balance and stores it in a file.
     *
     * @param balance the new balance to set
     */
    public void setBalance(double balance) {
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(BALANCE_FILE), false);
            outFile.print(balance);
            outFile.close();
        } catch (IOException e) {
            System.out.println("Error writing to " + BALANCE_FILE);
        }

        this.balance = balance;
    }
}
