package org.example;

import gui_fields.GUI_Field;
import gui_main.GUI;

public class GameController {
    private SettingsController set;
    private HelperController helper;
    private  String inputText= "";
    private  String Textdata;
    private GUI gui;
    private GameBoard[] board;
    private GameBoard [] board4;
    private GUI_Field[] board1,board2;
    private GameBoard gameBoard;

    public GameController(){
        board1 = new GUI_Field[40]; board2 = new GUI_Field[40];
        board1 = GameBoard.makeFields();
        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board1[i];
        }
        gameBoard = new GameBoard(board4);
        gui = new GUI(board2);
    }

    public void play() {

        Textdata = "" + gui.getUserString(inputText);
        int x = Integer.parseInt(Textdata);
        set = new SettingsController(x);
        set.provideSettings();
        HelperController help = new HelperController(set.getPlayerArray(),set.getPlayArray(),gui,board2);
        help.GameRunner();
    }
}