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

    /**
     *  Allows the player to decide to hit or stand
     * 
     * @param deck deck to draw from
     * @param discard deck to discard to
     */
    public void makeDecision(Deck deck, Deck discard) {
        
        int decision = 1; // default decision is to stand
        boolean doubleDown = false;
        // 0 = stand
        // 1 = hit
        // 2 = double

        if(doubleDown) {
            // TODO: add message dialog saying they can't hit
            return; // don't allow them to hit again if they double
        }

        if(this.getHand().calculateValue() > 20) {
            return; // return if they have blackjack or busted
        }

        switch(decision) {
            case 0 : // stand
//                this.makeDecision(deck, discard);
                return;
            case 1 : // hit
                this.hit(deck, discard); // hit deck and discard
                break;
            case 2 : // double
                // TODO: double bet in gui
                doubleDown = true;
                this.hit(deck, discard);
                break;
            
        }
        
        //        boolean getNum = true;

//        while(getNum) {
//            try {
//                System.out.println("Would you like to Hit[1] or Stand[2]");
//                decision = input.nextInt();
//                getNum = false;

//            } catch (Exception e) {
//                System.out.println("Error:\n" + e);
//                input.next();
//            }
//        }
        
        // if they decide to hit
//        if (decision == 1) { // TODO: add option to double
//
//            this.hit(deck, discard); // hit the deck and discard
//
//            if(this.getHand().calculateValue() > 20) {
//                return; // return if they have blackjack or busted
//            } else {
//                this.makeDecision(deck, discard); // allow them to hit or stand if they don't have 21 or blackjack
//            }
//        } else {
//            System.out.println("You stand."); // assume they stand if they hit a number other than 1
//        }
    }

}
