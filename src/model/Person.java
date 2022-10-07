package model;

import controller.Hand;

/**
 * Parent class of the Player and Dealer Objects
 * 
 * @author Michael
 */
public abstract class Person {

    private Hand hand;
    private String name;

    /**
     * Creates a person
     */
    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to check if a person has blackjack
     * 
     * @return true (if player has a blackjack)
     * @return false (if player does not have a blackjack)
     */
    public boolean hasBlackjack() {
        return this.getHand().calculateValue() == 21;
    }
    
    /**
     * Prints a formatted version of the person's hand
     */
    public void printHand() {
        System.out.println(this.name + "'s hand:\n" + this.hand + "[" + this.hand.calculateValue() + "]");
    }
    
    public void hit(Deck deck, Deck discard) {
        // TODO
    }

}
