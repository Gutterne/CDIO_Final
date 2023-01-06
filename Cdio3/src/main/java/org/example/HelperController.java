package org.example;

import Fields.Field;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
public class HelperController {
    private boolean playing = true;
    private int p1;
    private Board board3;
    private Holder holder;
    private GUI gui;

    private Player[] playerArray;
    private GUI_Player[] playArray;
    private GUI_Field []board2;

    public HelperController(Player[] playerArray, GUI_Player[] playArray,GUI gui,GUI_Field[] board2){
        this.gui = gui;
        this.playArray=playArray;
        this.playerArray=playerArray;
        holder=new Holder();
        board3= new Board();
        this.board2=board2;
    }

    public void GameRunner(){
        for(int dm=0;dm<playerArray.length;dm++)
            gui.addPlayer(playArray[dm]);
        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                p1 = holder.sum();
                playerArray[i].setPositition(playerArray[i].getPositition() + p1);
                gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
                int m = playerArray[i].getPositition() % 40;

                board2[(playerArray[i].getPositition() - holder.getSum()) % 40].removeAllCars();

                board2[m].setCar(playArray[i], true);

                Field playerField1 = board3.fieldlist[m];
                playerField1.landOndField(playerArray[i]);

                for(int f = 0;f<playerArray.length;f++) {
                    playArray[f].setBalance(playerArray[f].myWallet.getMoney());
                }

            }
        }
    }

}