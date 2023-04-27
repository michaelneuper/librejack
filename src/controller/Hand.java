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

    private ArrayList<Card> hand;

    /**
     * Hand Constructor: Creates empty hand
     */
    public Hand() {
        hand = new ArrayList<Card>();
    }

    /**
     * Adds a card from the deck to the hand
     *
     * @param deck deck to take card from
     */
    public void takeCardFromDeck(Deck deck) {
        hand.add(deck.takeCard());
    }

    /**
     * Method to calculate the value of a hand
     *
     * @return value value of the hand
     */
    public int calculateValue() {

        int value = 0; // current total value
        int aceCount = 0; // number of aces

        for (Card card : hand) {
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

    public Card getCard(int i) {
        return hand.get(i);
    }

    /**
     * Discards hand to deck
     *
     * @param discardDeck
     */
    public void discardHandToDeck(Deck discardDeck) {
        discardDeck.addCards(hand); // copy cards from discardDeck
        hand.clear(); // clear the hand
    }

    @Override
    public String toString() {

        String ret = ""; // holds string to return
        for (Card card : hand) {
            ret += card + " - ";
        }

        return ret;
    }
}
