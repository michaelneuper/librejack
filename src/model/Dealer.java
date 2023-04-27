package model;

/**
 * Handles dealer specific operations, such as drawing cards to 16 and standing
 * on 17 or above.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
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

    public String printFirstCardValue() {
        return "" + super.getHand().getCard(0).getValue();
    }
}
