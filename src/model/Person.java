package model;

import controller.Hand;

/**
 * <p>
 * Parent class of the Player and Dealer Objects.</p>
 * <p>
 * Contains information about a person in a blackjack game, such as their name
 * and hand.</p>
 * 
 * @see Player
 * @see Dealer
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public abstract class Person {

    private Hand hand;
    private String name;

    /**
     * Creates a person with an empty hand and no name.
     */
    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    /**
     * Returns the hand of the person.
     *
     * @return the hand of the person
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Sets the hand of the person.
     *
     * @param hand the hand to set
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks if the person has blackjack.
     *
     * @return true if the person has a blackjack, false otherwise
     */
    public boolean hasBlackjack() {
        return this.getHand().calculateValue() == 21;
    }

    /**
     * Prints a formatted version of the person's hand.
     *
     * @return a formatted string representing the person's hand
     */
    public String printHand() {
        return this.hand + "";
    }
    
    public String printFilePath(int i) {
        return hand.getCardFilePath(i);
    }

    /**
     * Draws a card from the deck and adds it to the person's hand. If the deck
     * has no cards, the deck is reloaded from the discard pile.
     *
     * @param deck the deck to draw from
     * @param discard the discard pile to reload from if the deck is empty
     */
    public void hit(Deck deck, Deck discard) {
        if (!deck.hasCards()) {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
    }
    
}
