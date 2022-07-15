package controller;

import java.util.ArrayList;

import model.Card;
import model.Deck;

/**
 * Contains methods to calculate the value of a hand, take cards from a deck and discard the hand to a deck.
 * @author michael
 */
public class Hand {
    
    private ArrayList<Card> hand;

    /**
     * Hand constructor
     */
    public Hand() {
        hand = new ArrayList<Card>();
    }
    
    public void takeCardFromDeck(Deck deck) {
        hand.add(deck.takeCard());
    }
}
