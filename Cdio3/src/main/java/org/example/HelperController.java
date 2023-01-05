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
    private int[] buyableFields;

    public HelperController(Player[] playerArray, GUI_Player[] playArray,GUI gui,GUI_Field[] board2){
        this.gui = gui;
        this.playArray=playArray;
        this.playerArray=playerArray;
        holder=new Holder();
        board3= new Board();
        this.board2=board2;
        buyableFields = new int[] {1,3,5,6,8,9,11,12,13,14,15,16,18,19,21,23,24,25,
        26,27,28,29,31,32,34,35,37,39};
    }

    public void GameRunner(){
        for(int dm=0;dm<playerArray.length;dm++)
            gui.addPlayer(playArray[dm]);
        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                int position= movePlayer(playerArray[i],playArray[i] ,RollTheDice());
                LandPlayer(playerArray[i],position);
                updatePlayerMoney();
            }
        }
    }
    public int RollTheDice(){
       holder.sum();
       int p1 = holder.getSum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        return p1;
    }
    public int movePlayer(Player player711,GUI_Player Play12, int DiceSum){
        player711.setPositition(player711.getPositition() + DiceSum);
        int m = player711.getPositition() % 24;
        board2[(player711.getPositition() - holder.getSum()) % 24].removeAllCars();
        board2[m].setCar(Play12, true);
        return m;
    }
    public void LandPlayer(Player player721, int position23){
        Field playerField1 = board3.fieldlist[position23];
for(int p2:buyableFields){

}
        playerField1.landOndField(player721);
    }

    public void updatePlayerMoney(){
        for(int f = 0;f<playerArray.length;f++) {
            playArray[f].setBalance(playerArray[f].myWallet.getMoney());
        }
    }


}