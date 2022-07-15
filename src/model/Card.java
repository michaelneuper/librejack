package model;

/**
 * Represents a card and handles card operations
 * @author michael
 */
public class Card {
     
    // TODO change name to image
    enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES,
    }
    
    enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(10),
        QUEEN(10),
        KING(10),
        ACE(11);

        int rankValue;
        Rank(int rankValue) {
            this.rankValue = rankValue;
        }
    }
    
    private Suit suit;
    private Rank rank;

    /**
     * Card constructor
     * @param suit Card suit
     * @param rank Card rank
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }
   
    /**
     * Rank value getter method
     * @return card rank value
     */
    public int getValue() {
        return this.rank.rankValue;
    }
    
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return this.suit.toString() + "-" + this.rank.toString();
    }
}