package org.example;

import Fields.BuyableField;
import Fields.Field;
import Fields.Start;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
public class HelperController {
    private boolean playing = true;
    private Board board3;
    private Holder holder;
    private GUI gui;
    private Player[] playerArray;
    private GUI_Player[] playArray;
    private GUI_Field []board2;

    public HelperController(Player[] playerArray, GUI_Player[] playArray,GUI gui
            ,GUI_Field[] board2) {
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
                int posit = movePlayer(playerArray[i],playArray[i],RollTheDice());
                LandPlayer(playerArray[i],posit);
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
        player711.setPositition(player711.getPositition()+DiceSum);
        int m = player711.getPositition() % 40;
        board2[(player711.getPositition() - holder.getSum()) % 40].removeAllCars();
        gui.setDice(holder.die1.getFacevalue(),holder.die2.getFacevalue());
        board2[m].setCar(Play12, true);
        return m;
    }

    public void LandPlayer(Player player721,int am){
        Field playerField1 = board3.fieldlist[am];
        if(playerField1 instanceof BuyableField){
            if(!playerField1.isOwned()) {
                String chosenButton = gui.getUserButtonPressed(
                        "Du har landet på " + playerField1.getFieldName() + "" +
                                ". Vil du købe den?",
                        "Ja", "Nej"
                );
                if(chosenButton.equals("Ja")){
                    ((BuyableField) playerField1).landOndField(player721,true);
                }
                else{
                    ((BuyableField) playerField1).landOndField(player721,false);
                }
            }
            else {
                if(!player721.getOwnerlist(am+1)){
                    gui.showMessage("Ew! Du ejer ikke feltet.Betal for leje.");
                    ((BuyableField) playerField1).landOndField(player721,false);}

                else{
                    gui.showMessage("Du har landet på et felt du ejer.");
                    ((BuyableField) playerField1).landOndField(player721,false);}

            }

        }
        else{
            playerField1.landOndField(player721);
        }
    }







    public void updatePlayerMoney(){
        for(int f = 0;f<playerArray.length;f++) {
            playArray[f].setBalance(playerArray[f].myWallet.getMoney());
        }
    }


}