package org.example;

import Fields.*;
import gui_codebehind.GUI_Center;
import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_resources.Attrs;
import javax.swing.JPanel;


import javax.swing.*;

import static gui_tests.TestRunExampleGame.sleep;

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

    private int[] chancecards = new int[0];

    private Chance chance ;
    private int currentPlayerPosition;

    private JPanel centerPanel = new JPanel();





    public HelperController(Player[] playerArray, GUI_Player[] playArray,GUI gui
            ,GUI_Field[] board2) {
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
        for(int dm=0;dm<playerArray.length;dm++) {
            gui.addPlayer(playArray[dm]);
            board2[playerArray[dm].getPositition()].setCar(playArray[dm], true);
        }
        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                currentPlayerPosition=playerArray[i].getPositition();
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                movePlayer(playerArray[i],playArray[i],RollTheDice(),i);
                LandPlayer(playerArray[i],playerArray[i].getPositition()%40);
                passerStart(playerArray[i],playerArray[i].getPositition()%40);
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
    public void movePlayer(Player player711,GUI_Player Play12, int DiceSum,int i){

        player711.setPositition((player711.getPositition() + DiceSum) );
        int[] carsOnfiled= new int[playerArray.length];



        for (int numOfCars=0;numOfCars<playerArray.length;numOfCars++){

            if(board2[(player711.getPositition() - holder.getSum()) % 40].hasCar(playArray[numOfCars]))
                carsOnfiled[numOfCars]=1;
        }
        board2[((player711.getPositition() - holder.getSum()) + 40) % 40].removeAllCars();
        board2[player711.getPositition()%40].setCar(Play12, true);

        for (int numOfCars2=0;numOfCars2<playerArray.length;numOfCars2++){
            if(carsOnfiled[numOfCars2]==1 && numOfCars2!=i){
                board2[(player711.getPositition() - holder.getSum()) % 40].setCar(playArray[numOfCars2],true);
            }

        }
    }




    public void LandPlayer(Player player721,int am) {
        Field playerField1 = board3.fieldlist[am];
        if (playerField1 instanceof BuyableField) {
            if (!playerField1.isOwned()) {
                String chosenButton = gui.getUserButtonPressed(
                        "Du har landet på " + playerField1.getFieldName() + "" +
                                ". Vil du købe den?",
                        "Ja", "Nej"
                );
                if (chosenButton.equals("Ja")) {
                    ((BuyableField) playerField1).landOndField(player721, true);
                } else {
                    ((BuyableField) playerField1).landOndField(player721, false);
                }
            } else {
                gui.showMessage("Du har landet på et felt du ejer.");

            }

        }
             /* else if (playerField1 instanceof Chance){
               gui.displayChanceCard("_My message_")
               gui.showMessage("Du har landet på chance felt.");
               gui.showMessage(((Chance) playerField1).getChancecards());
        } */

        else if (playerField1 instanceof Chance) {
            gui.displayChanceCard(((Chance) playerField1).getChancecards());
           String chosen = gui.getUserButtonPressed(
                    "",
                    "Ok"
            );
            gui.displayChanceCard("");
            String path = Attrs.getImagePath("GUI_Field.Image.Luck");

            //GUI_Center.label[0].setText("");
            GUI_Center.label[0].setIcon(new ImageIcon(this.getClass().getResource(path)));
            centerPanel.setBackground(GUI_Board.BASECOLOR);

        }
        else {
            playerField1.landOndField(player721);
        }



        }


    public void passerStart(Player player72,int amn){
        if(currentPlayerPosition % 40>player72.getPositition() % 40 ) {
            if(!(board3.fieldlist[amn] instanceof Start))
                gui.showMessage("Du har passeret start.");
            board3.fieldlist[0].landOndField(player72);
        }

    }



    public void updatePlayerMoney(){
        for(int f = 0;f<playerArray.length;f++) {
            playArray[f].setBalance(playerArray[f].myWallet.getMoney());
        }
    }


}