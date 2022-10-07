package view;

import controller.Controller;
import model.Card;
import model.Deck;
import model.Card.Rank;
import model.Card.Suit;

/**
 * @author Michael
 */
public class Main {
    
    public static void main(String[] args) {

        System.out.println("Welcome to LIBREJACK!");
        
        Controller blackjack = new Controller();

        //Make some cards and a deck
        Deck testDeck = new Deck();
        Card aCard = new Card(Suit.CLUBS, Rank.QUEEN);
        Card bCard = new Card(Suit.DIAMONDS,Rank.ACE);
        Card cCard = new Card(Suit.SPADES, Rank.SIX);
        //Add the cards to the deck
        testDeck.addCard(aCard);
        testDeck.addCard(bCard);
        testDeck.addCard(cCard);
        //Print out the deck
        System.out.println(testDeck);
        }
    
}