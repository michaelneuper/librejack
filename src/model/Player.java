package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Handles player specific operations, such as deciding to hit or stand.
 * 
 * @author Michael
 */
public class Player extends Person {
    
    private double balance; // TODO: make public
    Scanner input = new Scanner(System.in);

    /**
     * Creates a new player
     */
    public Player() {
        super.setName("Player");
    }
    
    public double getBalance(String inFile) {
        try {
            Scanner scFile = new Scanner(new File(inFile));
            this.balance = scFile.nextDouble();
            scFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error:\n" + e);
        }

        return this.balance;
    }

    public void setBalance(String inFile, double balance) {
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(inFile), false);
            outFile.print(balance);
            outFile.close();
        } catch (IOException e) {
            System.out.println("Error:\n" + e);
        }

//        this.balance = balance; // TODO: is neccesary?
    }

}
