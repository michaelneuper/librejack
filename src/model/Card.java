package model;

/**
 * Represents a card and handles card operations
 * @author michael
 */
public class Card {
     
    // TODO change name to image
    public enum Suit {

        CLUBS("Clubs"),
        DIAMONDS("Diamonds"),
        HEARTS("Hearts"),
        SPADES("Spades");

        public String suitName;

        Suit(String suitName) {
            this.suitName = suitName;
        }

        public String toString() {
            return suitName;
        }
    }
    
    public enum Rank {
        
        TWO("Two", 2),
        THREE("Three", 3),
        FOUR("Four",4),
        FIVE("Five",5),
        SIX("Six",6),
        SEVEN("Seven",7),
        EIGHT("Eight",8),
        NINE("Nine",9),
        TEN("Ten",10),
        JACK("Jack",10),
        QUEEN("Queen",10),
        KING("King",10),
        ACE("Ace", 11);
    
        String rankName;
        public int rankValue;
    
        Rank(String rankName, int rankValue){
            this.rankName = rankName;
            this.rankValue = rankValue;
        }
    
        public String toString(){
            return rankName;
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

    // public Card(Card card) {
    //     this.suit = card.getSuit();
    //     this.rank = card.getRank();
    // }
   
    // /**
    //  * Rank value getter method
    //  * @return card rank value
    //  */
    // public int getValue() {
    //     return this.rank.rankValue;
    // }
    
    // public Suit getSuit() {
    //     return suit;
    // }

    // public Rank getRank() {
    //     return rank;
    // }

    // @Override
    // public String toString() {
    //     return this.suit.toString() + "-" + this.rank.toString();
    // }
}