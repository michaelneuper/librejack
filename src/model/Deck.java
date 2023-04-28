package model;

import java.util.ArrayList;
import java.util.Random;

import model.Card.Rank;
import model.Card.Suit;

/**
 * <p>
 * Holds multiple cards and performs operations such as shuffling the deck.</p>
 * <p>
 * This class is responsible for creating a deck, populating it with 52 cards,
 * shuffling the deck, adding cards to the deck, removing a card from the deck,
 * checking if the deck has any cards left, emptying the deck, and returning the
 * deck's current size.</p>
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Deck {

    private ArrayList<Card> deck; // creates a "deck" of card objects

    /**
     *
     * Deck constructor
     */
    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    /**
     *
     * Populates empty deck with 52 cards by looping over each rank and value.
     */
    public void populate() {
        for (Suit cardSuit : Suit.values()) {
            for (Rank cardRank : Rank.values()) {
                // adds a new card to the deck
                this.deck.add(new Card(cardSuit, cardRank));
            }
        }
    }

    /**
     * Shuffles deck using a temporary deck for storing cards in random order.
     */
    public void shuffle() {
        ArrayList<Card> shufDeck = new ArrayList<Card>(); // temporary deck for storing cards in random order

        Random random = new Random();
        int randomCardIndex = 0;

        while (deck.size() > 0) {
            // generate random index
            randomCardIndex = random.nextInt(this.deck.size());
            shufDeck.add(this.deck.get(randomCardIndex)); // add card to random index of temporary deck
            this.deck.remove(randomCardIndex); // remove card from original deck
        }
        this.deck = shufDeck;
    }

    /**
     * Adds a card to the deck.
     *
     * @param inCard card the be added
     */
    public void addCard(Card inCard) {
        this.deck.add(inCard);
    }

    /**
     * Takes copy of first card from deck and removes card from deck.
     *
     * @return the card that was removed
     */
    public Card takeCard() {
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);

        return cardToTake;
    }

    /**
     * Makes sure the deck we're hitting from has cards in it.
     *
     * @return true if the deck has cards in or false if the deck is empty
     */
    public boolean hasCards() {
        return deck.size() > 0;
    }

    /**
     * Removes all Card objects from the deck.
     */
    public void emptyDeck() {
        deck.clear();
    }

    /**
     * Adds arraylist of cards to deck.
     *
     * @param cards arraylist of cards to be added to deck
     */
    public void addCards(ArrayList<Card> cards) {
        deck.addAll(cards);
    }

    /**
     * Returns arraylist containing all the cards in the deck.
     *
     * @return deck arraylist with the cards
     */
    public ArrayList<Card> getCards() {
        return deck;
    }

    /**
     * Take all cards from discarded deck and place them in this deck, shuffled.
     * Clear the old deck.
     *
     * @param discard the deck cards are coming from
     */
    public void reloadDeckFromDiscard(Deck discard) {
        this.addCards(discard.getCards());
        this.shuffle();
        discard.emptyDeck();
        System.out.println("Ran out of cards, creating new deck from discard pile & shuffling deck"); // TODO: change to message dialog
    }

    /**
     * @return number of cards left in the deck.
     */
    public int cardsLeft() {
        return deck.size();
    }

    /**
     * Returns a String representation of the Deck object. The String contains a
     * list of all the cards in the deck, with each card on a new line.
     *
     * @return a String representation of the Deck object
     */
    @Override
    public String toString() {
        String ret = ""; // holds the string to return
        for (Card card : deck) {
            ret += card;
            ret += "\n";
        }
        return ret;
    }
    
}
