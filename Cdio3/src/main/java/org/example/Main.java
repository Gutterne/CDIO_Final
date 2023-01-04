package org.example;

public class Main {
    public static void main(String[] args) {

//Test

        GameController gameController = new GameController();
        /**
         * Referer til game.play() som er et true loop, der sørger for at spillet løber indtil der er vundet.
         */

        try {

            gameController.play();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


