package org.example;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class SettingsController {
    private  Player player1,player2,player3,player4;
    private  int cash;
    private GUI gui;
    private  GUI_Player[] playArray;
    private  Player [] playerArray;
    private int x;
    public SettingsController(int x){
        this.x = x;
    }

    public   void provideSettings(){
        if (x == 2) {
            cash = 20;
        } else if (x == 3) {
            cash = 18;
        } else
            cash = 16;

        GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play1 = new GUI_Player("Player1", cash, car1);


        GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play2 = new GUI_Player("Player2", cash, car2);


        GUI_Car car3 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play3 = new GUI_Player("Player3", cash, car3);


        GUI_Car car4 = new GUI_Car(Color.GREEN, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play4 = new GUI_Player("Player4", cash, car4);


        player1 = new Player("Player1", cash);
        player2 = new Player("Player2", cash);
        player3 = new Player("Player3", cash);
        player4 = new Player("Player4", cash);

        playerArray = new Player[]{player1, player2, player3, player4};
        playArray = new GUI_Player[]{play1, play2, play3, play4};
        if (x == 2) {
            playerArray = new Player[]{player1, player2};
            playArray = new GUI_Player[]{play1, play2};
            setPlayerArray(playerArray);
            setPlayArray( playArray );

        } else if (x == 3) {
            playerArray = new Player[]{player1, player2, player3};
            playArray = new GUI_Player[]{play1, play2, play3};
            setPlayerArray(playerArray);
            setPlayArray( playArray );
        } else {
            setPlayerArray(playerArray);
            setPlayArray( playArray );
        }
    }

    public GUI_Player[] getPlayArray() {
        return playArray;
    }

    private void setPlayArray(GUI_Player[] playArray) {
        this.playArray = playArray;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    private void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
}
