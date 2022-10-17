package view;

import controller.Controller;

/**
 * @author Michael
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to LIBREJACK!");
        
        new TitleScreen().setVisible(true);

        Controller librejack = new Controller();
        librejack.startRound();
    }
}
