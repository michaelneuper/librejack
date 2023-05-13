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
     * Constructs a new empty {@code Hand} object.
     */
    public Hand() {
        HAND = new ArrayList<>();
    }

    /**
     * Adds a {@link Card} from the {@link Deck} to the {@link Hand}.
     *
     * @param deck deck to take {@link Card}from
     */
    public void takeCardFromDeck(Deck deck) {
        HAND.add(deck.takeCard());
    }

    /**
     * Calculates the value of a {@link Hand}.
     *
     * @return the value of a {@link Hand}
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
     * Gets the {@link Card} at a specific index.
     *
     * @param i the index of the {@link Card} or get
     * @return the {@link Card} at index i
     */
    public Card getCard(int i) {
        return HAND.get(i);
    }

    /**
     * Gets the relative file path of a {@link Card}.
     * 
     * @param i index of the {@link Card}in {@link Hand}
     * @return file path of a {@link Card} at a specific index, if the index is out of
     * range, a blank card is returned
     */
    public String getCardFilePath(int i) {
        try {
            return "/assets/cards/" + HAND.get(i).getFilename();
        } catch (IndexOutOfBoundsException e) {
            return "/assets/cards/back.png"; // returns a blank card
        }
    }

    /**
     * Discards the current {@link Hand} and adds its cards to the specified discard
     * {@link Deck}.
     *
     * @param discardDeck the deck to which the current {@link Hand}'s {@link Card} will be
     * added
     */
    public void discardHandToDeck(Deck discardDeck) {
        discardDeck.addCards(HAND); // copy cards from discardDeck
        HAND.clear(); // clear the hand
    }

    /**
     * Returns a {@code String} representation of the current {@link Hand}.
     *
     * @return a {@code String} representation of the current {@link Hand}
     */
    @Override
    public String toString() {

        String ret = ""; // holds string to return
        for (Card card : HAND) {
            ret += card + " \n ";
        }

        return ret;
    }

}
