package model;

/**
 * Represents a dealer in a card game and handles dealer-specific operations.
 *
 * <p>
 * This class extends the {@link Person} class, which contains shared methods
 * and properties between players and dealers.</p>
 *
 * @see Person
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Dealer extends Person {

    /**
     * Creates a new dealer with the default name "Dealer".
     */
    public Dealer() {
        super.setName("Dealer");
    }

    /**
     * Returns a string representation of the dealer's first card in their hand.
     *
     * @return the first card in the dealer's hand as a String
     */
    public String printFirstHand() {
        return "" + super.getHand().getCard(0);
    }

    /**
     * Returns a string representation of the value of the dealer's first card
     * in their hand.
     *
     * @return the value of the first card in the dealer's hand as a String
     */
    public String printFirstCardValue() {
        return "" + super.getHand().getCard(0).getValue();
    }
    
}
