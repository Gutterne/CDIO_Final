package org.example;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class SettingsController {
    private  Player player1,player2,player3,player4,player5,player6;
    private  int cash;
    private GUI gui;
    private  GUI_Player[] playArray;
    private  Player [] playerArray;
    private int x;
    public SettingsController(int x){
        this.x = x;
    }

    public void provideSettings(){
       /*Player start amount
        If-else statement constructed like this, incase we choose to change the criteria of start money to be dependant
        on the amount of players. */

                //monopoly CDIO_Final startamount is set to 30k
        if (x == 6||x==5) {
            cash = 30000;
        } else if (x == 4||x==3) {
            cash = 30000;
        } else if (x==2||x==1){
            cash = 30000;
        } else {
            cash=30000;
        }

        GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play1 = new GUI_Player("Player1", cash, car1);


        GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play2 = new GUI_Player("Player2", cash, car2);


        GUI_Car car3 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play3 = new GUI_Player("Player3", cash, car3);


        GUI_Car car4 = new GUI_Car(Color.GREEN, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play4 = new GUI_Player("Player4", cash, car4);

        GUI_Car car5 = new GUI_Car(Color.MAGENTA,Color.BLACK,GUI_Car.Type.CAR,GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
        GUI_Player play5 = new GUI_Player("Player5", cash, car5);

        GUI_Car car6 = new GUI_Car(Color.WHITE,Color.BLACK,GUI_Car.Type.CAR,GUI_Car.Pattern.HORIZONTAL_LINE);
        GUI_Player play6 = new GUI_Player("Player6", cash, car6);


        player1 = new Player("Player1", cash);
        player2 = new Player("Player2", cash);
        player3 = new Player("Player3", cash);
        player4 = new Player("Player4", cash);
        player5 = new Player("Player5", cash);
        player6 = new Player("Player6", cash);

        playerArray = new Player[]{player1, player2, player3, player4,player5,player6};
        playArray = new GUI_Player[]{play1, play2, play3, play4,play5,play6};
        if (x == 2) {
            playerArray = new Player[]{player1, player2};
            playArray = new GUI_Player[]{play1, play2};
            setPlayerArray(playerArray);
            setPlayArray( playArray );

        } else if (x == 3) {
            playerArray = new Player[]{player1, player2, player3};
            playArray = new GUI_Player[]{play1, play2, play3};
            setPlayerArray(playerArray);
            setPlayArray(playArray);
        }else if (x==4) {
            playerArray = new Player[]{player1, player2, player3,player4};
            playArray = new GUI_Player[]{play1, play2, play3,play4};
        }else if (x==5) {
            playerArray = new Player[]{player1, player2, player3,player4,player5};
            playArray = new GUI_Player[]{play1, play2, play3,play4,play5};
        } else {
            setPlayerArray(playerArray);
            setPlayArray(playArray );
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
