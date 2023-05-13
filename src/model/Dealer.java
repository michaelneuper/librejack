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
     * Constructs a new {@link Dealer} with the default name "Dealer".
     */
    public Dealer() {
        super.setName("Dealer");
    }

    /**
     * Returns a {@code String} representation of the dealer's first
     * {@link Card} in their {@link controller.Hand}.
     *
     * @return the first card in the dealer's {@link controller.Hand} as a
     * {@code String}
     */
    public String printFirstHand() {
        return "" + super.getHand().getCard(0);
    }

    /**
     * Returns a {@code String} representation of the value of the dealer's
     * first {@link Card} in their {@link controller.Hand}.
     *
     * @return the value of the first {@link Card} in the dealer's
     * {@link controller.Hand} as a {@code String}
     */
    public String printFirstCardValue() {
        return "" + super.getHand().getCard(0).getValue();
    }

}
