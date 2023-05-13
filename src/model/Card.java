package model;

/**
 * Represents a standard playing card and handles card operations.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Card {

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
         * Constructs a new {@link Suit} object with the specified name.
         *
         * @param suitName the name of the suit
         */
        Suit(String suitName) {
            this.suitName = suitName;
        }

        /**
         * Returns the name of the {@link Suit} as a string.
         *
         * @return the name of the {@link Suit}
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
         * Constructs a new {@link Rank} object with the specified name and
         * value.
         *
         * @param rankName the name of the rank
         * @param rankValue the value of the rank
         */
        Rank(String rankName, int rankValue) {
            this.rankName = rankName;
            this.rankValue = rankValue;
        }

        /**
         * Returns the name of the {@link Rank} as a string.
         *
         * @return the name of the {@link Rank}
         */
        @Override
        public String toString() {
            return rankName;
        }
    }

    private Suit suit;
    private Rank rank;

    /**
     * Constructs a new {@link Card} object with the specified {@link Suit} and
     * {@link Rank}.
     *
     * @param suit {@link Card} {@link Suit}
     * @param rank {@link Card} {@link Rank}
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Constructs a new {@link Card} object as a copy of another {@link Card}
     * object.
     *
     * @param card card to be added
     */
    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    /**
     * Gets the value of the {@link Card} from its {@link Rank}.
     *
     * @return the value of the {@link Card}
     */
    public int getValue() {
        return this.rank.rankValue;
    }

    /**
     * Gets the {@link Suit} of the {@link Card}.
     *
     * @return the {@link Suit} of the {@link Card}
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Gets the {@link Rank} of the {@link Card}.
     *
     * @return the {@link Rank} of the {@link Card}
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Returns a file representation of a {@link Card} in the form
     * {@code "ace_of_spades.png"}
     *
     * @return file representation of a {@link Card}
     */
    public String getFilename() {
        return rank.toString().toLowerCase() + "_of_" + suit.toString().toLowerCase() + ".png";
    }

    /**
     * Returns a {@code String} representation of the {@link Card} object,
     * including the {@link Rank} and {@link Suit} of the {@link Card}.
     *
     * @return a {@code String} representation of the {@link Card} object
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

}
