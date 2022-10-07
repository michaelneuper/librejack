package view;

import controller.Controller;
import model.Card;
import model.Card.Rank;
import model.Card.Suit;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Welcome to LIBREJACK!");
        
        Controller blackjack = new Controller();

        Card testCard = new Card(Suit.CLUBS, Rank.ACE);

        System.out.println(testCard);
    }
    
}