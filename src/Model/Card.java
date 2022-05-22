package model;

/**
 * 
 * @author michael
 */
public class Card {
     
    enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES,
    }
    
    enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE,
    }
    
    Suit suit;
    Rank rank;

    /**
     * Card constructor
     * @param suit Card suit
     * @param rank Card rank
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
}