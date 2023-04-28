package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <p>
 * Represents a player in a blackjack game. A player has a name and a hand of
 * cards. They can take actions such as hitting, standing, and doubling down.
 * They can also make bets and receive payouts.</p>
 *
 * <p>
 * This class extends the {@link Person} class, which contains shared methods
 * and properties between players and dealers.</p>
 *
 * @see Person
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Player extends Person {

    private double balance; // player's balance
    private final String BALANCE_FILE = "db/balance.txt"; // file to store the player's balance

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
