package model;

import java.util.ArrayList;
import java.util.Random;

import model.Card.Rank;
import model.Card.Suit;

/**
 * Holds multiple cards and 
 * performs operations such as shuffling the deck
 * @author Michael
 */
public class Deck {
    
    private ArrayList<Card> deck; // creates a "deck" of card objects
  
   /**
    * Deck constructor
    */
    public Deck() {
        this.deck = new ArrayList<Card>();
    }
   
   /**
    * Method that populates an empty deck with 52 cards
    * by looping over each rank and value
    */
    public void populate() {
        for(Suit cardSuit : Suit.values()) {
            for (Rank cardRank : Rank.values()) {
                // adds a new card to the deck
                this.deck.add(new Card(cardSuit, cardRank));
            }
        }
    }
    
    /**
    * Method that shuffles the deck
    */
    public void shuffle() {
        ArrayList<Card> shufDeck = new ArrayList<Card>(); // temporary deck for storing cards in random order

        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.deck.size();
        for(int i = 0; i < originalSize; i++) {
            // Generate random index
            /* 
                Formula for generating random number:
                = random.nextInt((max - min) + 1) + min
                = random.nextInt(((deckSize - 1) - 0) + 1) + 0
            */
            randomCardIndex = random.nextInt(this.deck.size());
            shufDeck.add(this.deck.get(randomCardIndex)); // add card to random index of temporary deck
            this.deck.remove(randomCardIndex); // remove card from original deck
        }

        this.deck = shufDeck;
    }

//    /**
//     * Method to draw card from one deck to another
//     * @param comingFromDeck deck the card comes from
//     */
//    public void draw(Deck comingFromDeck) {
//        this.deck.add(comingFromDeck.getCard(0));
//        comingFromDeck.removeCard(0);
//    }
//
//    /**
//     * Method to remove a card from the deck
//     * @param i index of card to be removed
//     */
//    public void removeCard(int i) {
//        this.deck.remove(i);
//    }
//
//    /**
//     * Method to return the value of a card at a paticular index
//     * @param i index of card to be returned
//     * @return card at index i
//     */
//    public Card getCard(int i) {
//        return this.deck.get(i);
//    }

   /**
    * Method to add a card to the deck
    * @param inCard the card the be added
    */
    public void addCard(Card inCard) {
        this.deck.add(inCard);
    }

//    /**
//     * Method to take a copy of the first card from the deck,
//     * remove the card from the deck
//     * and return the card
//     * @return card 
//     */
//    public Card takeCard() {
//        Card cardToTake = new Card(deck.get(0));
//        deck.remove(0);
//        return cardToTake;
//    }

    public String toString() {
        
        String ret = ""; // holds the string to return

        for(Card card: deck){
            ret += card;
            ret += "\n";
        }

        return ret;
    }
}