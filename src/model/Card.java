package model;

/**
 * Represents a standard playing card and handles card operations.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Card {

    // TODO: change name to image
    /**
     * Represents the four possible suits in a standard playing card deck.
     */
    public enum Suit {

        CLUBS("Clubs"),
        DIAMONDS("Diamonds"),
        HEARTS("Hearts"),
        SPADES("Spades");

        public String suitName;

        /**
         * Creates a new Suit object with the specified name.
         *
         * @param suitName the name of the suit
         */
        Suit(String suitName) {
            this.suitName = suitName;
        }

        /**
         * Returns the name of the suit as a string.
         *
         * @return the name of the suit
         */
        @Override
        public String toString() {
            return suitName;
        }
    }

    /**
     * Represents the thirteen possible ranks in a standard playing card deck.
     *
     * Each rank has a name and a value.
     */
    public enum Rank {

        TWO("Two", 2),
        THREE("Three", 3),
        FOUR("Four", 4),
        FIVE("Five", 5),
        SIX("Six", 6),
        SEVEN("Seven", 7),
        EIGHT("Eight", 8),
        NINE("Nine", 9),
        TEN("Ten", 10),
        JACK("Jack", 10),
        QUEEN("Queen", 10),
        KING("King", 10),
        ACE("Ace", 11);

        String rankName;
        public int rankValue;

        /**
         * Creates a new Rank object with the specified name and value.
         *
         * @param rankName the name of the rank
         * @param rankValue the value of the rank
         */
        Rank(String rankName, int rankValue) {
            this.rankName = rankName;
            this.rankValue = rankValue;
        }

        /**
         * Returns the name of the rank as a string.
         *
         * @return the name of the rank
         */
        @Override
        public String toString() {
            return rankName;
        }
    }

    private Suit suit;
    private Rank rank;

    /**
     * Creates a new Card object with the specified suit and rank.
     *
     * @param suit Card suit
     * @param rank Card rank
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Creates a new Card object as a copy of another Card object.
     *
     * @param card card to be added
     */
    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    /**
     * Gets the value of the card.
     *
     * @return The value of the card.
     */
    public int getValue() {
        return this.rank.rankValue;
    }

    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return The rank of the card.
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Returns a file representation of a card in the form "ace_of_spades.png"
     *
     * @return file representation of a card
     */
    public String getFilename() {
        return rank.toString().toLowerCase() + "_of_" + suit.toString().toLowerCase() + ".png";
    }

    /**
     * Returns a String representation of the Card object, including the rank
     * and suit of the card, as well as its value in parentheses.
     *
     * @return a String representation of the Card object
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

}
