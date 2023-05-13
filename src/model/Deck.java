package model;

import java.util.ArrayList;
import java.util.Random;

import model.Card.Rank;
import model.Card.Suit;

/**
 * <p>
 * Holds multiple {@link Card} objects and performs operations such as shuffling
 * the deck.</p>
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
     * Constructs a new empty {@link Deck} object.
     */
    public Deck() {
        this.deck = new ArrayList<>();
    }

    /**
     * Populates empty {@link Deck} with 52 {@link Card} objects by looping over
     * each {@link Rank} and the value of its {@link Suit}.
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
     * Shuffles {@link Deck} using a temporary {@link Deck} for storing cards in
     * random order.
     */
    public void shuffle() {
        ArrayList<Card> shufDeck = new ArrayList<>(); // temporary deck for storing cards in random order

        Random random = new Random();
        int randomCardIndex = 0;

        while (!deck.isEmpty()) {
            // generate random index
            randomCardIndex = random.nextInt(this.deck.size());
            shufDeck.add(this.deck.get(randomCardIndex)); // add card to random index of temporary deck
            this.deck.remove(randomCardIndex); // remove card from original deck
        }

        this.deck = shufDeck;
    }

    /**
     * Adds a {@link Card} to the {@link Deck}.
     *
     * @param inCard the {@link Card} the be added to the deck
     */
    public void addCard(Card inCard) {
        this.deck.add(inCard);
    }

    /**
     * Takes copy of first {@link Card} from the {@link Deck} and removes it.
     *
     * @return the {@link Card} that was removed
     */
    public Card takeCard() {
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);

        return cardToTake;
    }

    /**
     * Checks whether the {@link Deck} to hit is populated with {@link Card}
     * objects.
     *
     * @return {@code true} if the {@link Deck} has {@link Card}s in,
     * {@code false} otherwise
     */
    public boolean hasCards() {
        return !deck.isEmpty();
    }

    /**
     * Removes all {@link Card} objects from the {@link Deck}.
     */
    public void emptyDeck() {
        deck.clear();
    }

    /**
     * Adds an {@link ArrayList} of {@link Card} objects to the {@link Deck}.
     *
     * @param cards the {@link ArrayList} of {@link Card} objects to be added to
     * {@link Deck}
     */
    public void addCards(ArrayList<Card> cards) {
        deck.addAll(cards);
    }

    /**
     * Returns an {@link ArrayList} containing all the {@link Card} objects in
     * the {@link Deck}.
     *
     * @return the {@link ArrayList} with the cards in the {@link Deck}
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
