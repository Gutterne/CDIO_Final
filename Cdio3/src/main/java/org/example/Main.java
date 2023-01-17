package org.example;
//This class is the entry point for the program, as it contains the main method
//which is executed when the program starts.
//It creates an instance of the GameController class and calls the play() method on it to start the game.
public class Main {
    public static void main(String[] args) {

        GameController gameController = new GameController();


        gameController.play();

    }
}
