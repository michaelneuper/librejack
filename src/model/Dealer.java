package model;

/**
 * Handles dealer specific operations, such as drawing cards to 16 and standing on 17 or above.
 * 
 * @author Michael
 */
public class Dealer extends Person {

    /**
     * Creates a new dealer
     */
    public Dealer() {
        super.setName("Dealer");
    }

    public String printFirstHand() {
        return "" + super.getHand().getCard(0);
    }
}
