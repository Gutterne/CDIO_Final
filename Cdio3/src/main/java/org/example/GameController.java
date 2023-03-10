package org.example;

import gui_fields.GUI_Field;
import gui_main.GUI;

public class GameController {
    private SettingsController set;
    private HelperController helper;

    private GUI gui;
    private GUI gui2;

    static Audio audio = new Audio();



    private GameBoard[] board;
    private GameBoard [] board4;
    private GUI_Field[] board1,board2,reverseBoard1,reverseBoard2;
    private GameBoard gameBoard;
    int plate;

    public GameController(){
        board1 = new GUI_Field[40]; board2 = new GUI_Field[40];reverseBoard1 = new GUI_Field[40];reverseBoard2 = new GUI_Field[40];
        board1 = GameBoard.makeFields();
        reverseBoard1 = GameBoard.reverseField();
        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board1[i];
        }

        for(int j = 0; j < reverseBoard2.length; ++j) {
            reverseBoard2[j] = reverseBoard1[j];

        }
        gui = new GUI(board2);


    }

    public void play() {
        int x = Integer.parseInt(gui.getUserSelection("Hvor mange spillere skal spille?",  "3", "4", "5", "6"));
        set = new SettingsController(x);
        set.provideSettings();
        String chosenButton = gui.getUserButtonPressed(
                "Vælg Jeres Matadorplade" + "" +
                        "",
                "Standard Matador", "Omvendt Matadorplade"
        );
        if (chosenButton.equals("Standard Matador")) {
            audio.run();
            HelperController help = new HelperController(set.getPlayerArray(), set.getPlayArray(), gui, board2,reverseBoard2,false,1);
            help.GameRunner();
        }
        if (chosenButton.equals("Omvendt Matadorplade")) {
            plate = 2;
            gui.close();
            gui = new GUI(reverseBoard2);
            //gui2 = new GUI(reverseBoard2);
            //HelperController help = new HelperController(set.getPlayerArray(), set.getPlayArray(), gui2, reverseBoard2,board2,true);
            audio.run();
            HelperController help = new HelperController(set.getPlayerArray(), set.getPlayArray(), gui, reverseBoard2,board2,true,plate);
            help.GameRunner();
        }
    }

}