package org.example;

import gui_fields.GUI_Field;
import gui_main.GUI;

public class GameController {
    private SettingsController set;
    private HelperController helper;
    private  String inputText= "";
    private  String Textdata;
    private GUI gui;
    private GUI gui2;
    public int boardInteger;
    static Audio audio = new Audio();

    private GameBoard[] board;
    private GameBoard [] board4;
    private GUI_Field[] board1,board2,reverseBoard1,reverseBoard2;
    private GameBoard gameBoard;

    public GameController(){
        board1 = new GUI_Field[40]; board2 = new GUI_Field[40];
        board1 = GameBoard.makeFields(1);
        //reverseBoard1 = GameBoard.reverseField();
        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board1[i];
        }
        gui = new GUI(board2);


    }

    public void play() {
        int x = Integer.parseInt(gui.getUserSelection("Hvor mange spillere skal spille?", "2", "3", "4", "5", "6"));
        set = new SettingsController(x);
        set.provideSettings();
        String chosenButton = gui.getUserButtonPressed(
                "Vælg Jeres Matadorplade" + "" +
                        "",
                "Standard Matador", "Omvendt Matadorplade"
        );
        if (chosenButton.equals("Standard Matador")) {

            boardInteger =1;
            board1 = GameBoard.makeFields(1);

            audio.run();
            HelperController help = new HelperController(set.getPlayerArray(), set.getPlayArray(), gui, board2,false,1);
            help.GameRunner();
        }
        if (chosenButton.equals("Omvendt Matadorplade")) {
            board1 = GameBoard.makeFields(2);
            for(int i = 0; i < board2.length; ++i) {
                board2[i] = board1[i];
            }
            boardInteger = 2;

            //boardP.fieldGiver(boardInteger);

            gui.close();

            //gui = new GUI(reverseBoard2);
            gui = new GUI(board2);


            //gui2 = new GUI(reverseBoard2);
            //HelperController help = new HelperController(set.getPlayerArray(), set.getPlayArray(), gui2, reverseBoard2,board2,true);
            audio.run();
            HelperController help = new HelperController(set.getPlayerArray(), set.getPlayArray(), gui,board2,true,2);
            help.GameRunner();
        }
    }

}