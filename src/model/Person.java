package model;

import controller.Hand;

/**
 * <p>
 * Parent class of the Player and Dealer Objects.</p>
 * <p>
 * Contains information about a person in a blackjack game, such as their name
 * and hand.</p>
 *
 * @see Player
 * @see Dealer
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public abstract class Person {

    private Hand hand;
    private String name;

    /**
     * Constructs a {@link Person} object with an empty {@link Hand} and no
     * name.
     */
    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    /**
     * Returns the {@link Hand} of the {@link Person}.
     *
     * @return the {@link Hand} of the {@link Person}
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Sets the {@link Hand} of the {@link Person}.
     *
     * @param hand the {@link Hand} to set
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    /**
     * Returns the name of the {@link Person}.
     *
     * @return the name of the {@link Person}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the {@link Person}.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks if a {@link Person} has blackjack.
     *
     * @return {@code true} if the {@link java.util.ArrayList} has a blackjack,
     * {@code false} otherwise
     */
    public boolean hasBlackjack() {
        return this.getHand().calculateValue() == 21;
    }

    /**
     * Prints a formatted version of the person's {@link Hand}.
     *
     * @return a formatted {@code String} representing the person's {@link Hand}
     */
    public String printHand() {
        return this.hand + "";
    }

    /**
     * Prints the file path of a {@link Card} at a given index
     *
     * @param i index of the {@link Card}
     * @return file path of the {@link Card} at index {@code i}
     */
    public String printFilePath(int i) {
        return hand.getCardFilePath(i);
    }

    /**
     * Draws a {@link Card} from the {@link Deck} and adds it to the person's
     * {@link Hand}. If the {@link Deck} has no cards, the {@link Deck} is
     * reloaded from the discard pile.
     *
     * @param deck the {@link Deck} to draw from
     * @param discard the discard pile to reload from if the {@link Deck} is
     * empty
     */
    public void hit(Deck deck, Deck discard) {
        if (!deck.hasCards()) {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
    }

}
