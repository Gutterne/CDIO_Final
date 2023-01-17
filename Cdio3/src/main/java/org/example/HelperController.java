package org.example;

import Fields.*;
import gui_codebehind.GUI_Center;
import gui_fields.*;
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
    public Audio audio = new Audio();
    private Player[] playerArray;
    private GUI_Player[] playArray;
    private GUI_Field []board2;
    private GUI_Field [] reversalBoard;

    private int[] buyableFields;

    private int[] chancecards = new int[0];

    private Chance chance ;
    boolean boardCondition;

    private Board BOARD_SIZE;
    private ChanceActions chanceAct;

    private int currentPlayerPosition;

    private JPanel centerPanel = new JPanel();

    boolean extraturn=false;

    private int fields;





    public HelperController(Player[] playerArray, GUI_Player[] playArray,GUI gui
            ,GUI_Field[] board2,GUI_Field[] reversalBoard, boolean reverseCondition) {
        this.gui = gui;
        this.playArray=playArray;
        this.playerArray=playerArray;
        holder=new Holder();
        board3= new Board();

        reverseCondition = boardCondition;
        this.reversalBoard =reversalBoard;
        this.board2=board2;
        chanceAct= new ChanceActions();
    }

    public void GameRunner(){
        for(int dm=0;dm<playerArray.length;dm++) {
            gui.addPlayer(playArray[dm]);
            board2[0].setCar(playArray[dm],true);
        }

        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                currentPlayerPosition=playerArray[i].getPositition();
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                int pos = movePlayer(playerArray[i], playArray[i], RollTheDice());
                checkExtraTurn(playerArray[i], playArray[i]);
                LandPlayer(playerArray[i], playArray[i], pos);

                LandPlayer(playerArray[i],playArray[i],pos);



                passerStart(playerArray[i],pos);
                updatePlayerMoney();

            }
        }
    }
    public int RollTheDice(){
       holder.sum();
       int p1 = holder.getSum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        audio.DiceSound();
        return p1;
    }
    public int movePlayer(Player player711,GUI_Player Play12, int DiceSum){
        player711.setPositition(player711.getPositition() + DiceSum);
        int m = player711.getPositition() % 40;
if(boardCondition == false) {
    board2[(player711.getPositition() - holder.getSum()) % 40].setCar(Play12,false);
    board2[m].setCar(Play12, true);
}
if(boardCondition == true) {
    reversalBoard[(player711.getPositition() - holder.getSum()) % 40].removeAllCars();
    reversalBoard[m].setCar(Play12, true);
}

        return m;
    }
    public void LandPlayer(Player player721,GUI_Player play20,int am) {


        Field playerFieldReverse = board3.fieldlist[am];
        Field playerField1 = board3.fieldListReverse[am];

        if(boardCondition == false) {
            playerField1 = playerField1;
        }
        else  {
            playerField1 = playerFieldReverse;
            board2 = reversalBoard;
    }
        if (playerField1 instanceof BuyableField) {
            if (!playerField1.isOwned()) {
                String chosenButton = gui.getUserButtonPressed(
                        "Du har landet på " + playerField1.getFieldName() + "" +
                                ". Vil du købe den?",
                        "Ja", "Nej"
                );
                if (chosenButton.equals("Ja")) {
                    ((BuyableField) playerField1).landOndField(player721, true);
                    if (board2[am] instanceof GUI_Street) {
                        ((GUI_Street) board2[am]).setBorder(play20.getPrimaryColor());
                    }
                }
                else {
                        ((BuyableField) playerField1).landOndField(player721, true);
                    }
                }
                    else {
                        if(!player721.getOwnerlist(am+1)){
                            gui.showMessage("Du ejer ikke feltet,Betal for leje.");
                            ((BuyableField) playerField1).landOndField(player721, false);
                        }
                     else {
                         gui.showMessage("Du har landet på et felt du ejer.");
                        }

                }


        } else if (playerField1 instanceof Brewery) {
            if (!playerField1.isOwned()) {
                String chosenButtonBrewery = gui.getUserButtonPressed(
                        "Du har landet på " + playerField1.getFieldName() + "" +
                                ". Vil du købe dette bryggeri?",
                        "Ja", "Nej"
                );
                if (chosenButtonBrewery.equals("Ja")) {
                    ((Brewery) playerField1).landOndField(player721, true);
                    ((GUI_Brewery) board2[am]).setBorder(play20.getPrimaryColor());
                } else {
                    ((Brewery) playerField1).landOndField(player721, false);
                }
            } else {
                gui.showMessage("Du ejer allerede bryggeriet");

            }
        } else if (playerField1 instanceof Ferry) {
            if (!playerField1.isOwned()) {
                String chosenButtonFerry = gui.getUserButtonPressed(
                        "Du har landet på " + playerField1.getFieldName() + "" +
                                ". Vil du købe denne superFærge",
                        "Ja", "Nej"
                );
                if (chosenButtonFerry.equals("Ja")) {
                    ((Ferry) playerField1).landOndField(player721, true);
                    ((GUI_Shipping) board2[am]).setBorder(play20.getPrimaryColor());
                } else {
                    ((Ferry) playerField1).landOndField(player721, false);
                }
            } else {
                gui.showMessage("Du ejer allerede denne færge");

            }
        } else if (playerField1 instanceof Chance) {

            System.out.println("Chance Land");
            gui.displayChanceCard(((Chance) playerField1).getChancecards());
            String chosen = gui.getUserButtonPressed(
                    "",
                    "Ok"
            );

            chanceAct.chancePulls(player721,play20,board2,((Chance) playerField1).getCardsNumber());
            gui.displayChanceCard("");
            String path = Attrs.getImagePath("GUI_Field.Image.Luck");
            GUI_Center.label[0].setIcon(new ImageIcon(this.getClass().getResource(path)));
            centerPanel.setBackground(GUI_Board.BASECOLOR);

        }

        else if(playerField1 instanceof Metro){
            gui.showMessage("Du har landt ved Metro-Stoppet, du tar nu metroen til næste stop!");
            board2[player721.getPositition()  % 40].removeAllCars();
            ((Metro)playerField1).landOndField(player721);
            board2[player721.getPositition() %40].setCar(play20, true);;
        }

        else if (playerField1 instanceof Hardprison){

            gui.showMessage("Du skal gå til fængsel og modtage ikke 4000");
            gui.showMessage("Du har betalt 1000 kr. for at få love at kaster teninge næste gange ");
            board2[player721.getPositition()  % 40].removeAllCars();
            ((Hardprison)playerField1).landOndField(player721);
            board2[player721.getPositition()%40].setCar(play20, true);
              }
              else {
                playerField1.landOndField(player721);
            }



        }


    public void passerStart(Player player72,int amn){
        if(currentPlayerPosition % 40>player72.getPositition() % 40 && !(board3.fieldlist[amn] instanceof Hardprison) && !(board3.fieldlist[amn] instanceof Chance) ) {
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

    public void checkExtraTurn(Player player, GUI_Player play) {
        if (holder.getExtraTurn()) {
            gui.showMessage(player.getName() + " fik ekstra tur! Kast igen:");
            System.out.println(player.getName() + "ekstra Tur");
            int pos = movePlayer(player, play, RollTheDice());
            LandPlayer(player, play, pos);
            updatePlayerMoney();
        }
    }

}