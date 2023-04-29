package controller;

import java.util.ArrayList;

import model.Card;
import model.Deck;

/**
 * Contains methods to calculate the value of a hand, take cards from a deck and
 * discard the hand to a deck.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Hand {

    private final ArrayList<Card> HAND;

    /**
     * Creates a new empty Hand object.
     */
    public Hand() {
        HAND = new ArrayList<>();
    }

    /**
     * Adds a card from the deck to the hand.
     *
     * @param deck deck to take card from
     */
    public void takeCardFromDeck(Deck deck) {
        HAND.add(deck.takeCard());
    }

    /**
     * Calculates the value of a hand.
     *
     * @return value value of the hand
     */
    public int calculateValue() {
        int value = 0; // current total value
        int aceCount = 0; // number of aces

        for (Card card : HAND) {
            value += card.getValue(); // add card value to hand

            // count number of aces
            if (card.getValue() == 11) {
                ++aceCount;
            }
        }

        // for the scenario where we have multiple aces
        // go back and set each ace to 1 until get back under 21, if possible
        if (value > 21 && aceCount > 0) {
            while (aceCount > 0 && value > 21) {
                --aceCount;
                value -= 10;
            }
        }

        return value;
    }

    /**
     * Gets the card at a specific index.
     *
     * @param i the index of the card or get
     * @return the card at index i
     */
    public Card getCard(int i) {
        return HAND.get(i);
    }

    /**
     * Discards the current hand and adds its cards to the specified discard
     * deck.
     *
     * @param discardDeck the deck to which the current hand's cards will be
     * added
     */
    public void discardHandToDeck(Deck discardDeck) {
        discardDeck.addCards(HAND); // copy cards from discardDeck
        HAND.clear(); // clear the hand
    }

    /**
     * Returns a string representation of the current hand.
     *
     * @return a string representation of the current hand
     */
    @Override
    public String toString() {

        String ret = ""; // holds string to return
        for (Card card : HAND) {
            ret += card + " \n "; // TODO fix newline not displaying in GUI
        }

        return ret;
    }

}
