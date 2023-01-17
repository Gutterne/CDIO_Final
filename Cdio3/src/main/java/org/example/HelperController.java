package org.example;

import Fields.*;
import gui_codebehind.GUI_Center;
import gui_fields.*;
import gui_main.GUI;
import gui_resources.Attrs;
import javax.swing.JPanel;


import javax.swing.*;

import java.awt.*;

import static gui_tests.TestRunExampleGame.sleep;

public class HelperController {
    private boolean playing = true;
    private Board board3;
    private Holder holder;
    private ColourSet colourSet;
    private GUI gui;
    private Player[] playerArray;
    private GUI_Player[] playArray;
    private GUI_Field []board2;

    private int[] chancecards = new int[0];


    private String textdata;
    private int currentPlayerPosition;

    private JPanel centerPanel = new JPanel();

    boolean extraturn=false;





    public HelperController(Player[] playerArray, GUI_Player[] playArray,GUI gui
            ,GUI_Field[] board2) {
        this.gui = gui;
        this.playArray=playArray;
        this.playerArray=playerArray;
        holder=new Holder();
        board3= new Board();
        this.board2=board2;
        colourSet= new ColourSet();

    }

    public void GameRunner(){
        for(int dm=0;dm<playerArray.length;dm++)
            gui.addPlayer(playArray[dm]);
        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                currentPlayerPosition=playerArray[i].getPositition();
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                int posit = movePlayer(playerArray[i],playArray[i],RollTheDice());

                LandPlayer(playerArray[i],playArray[i],posit);



                passerStart(playerArray[i],posit);
                updatePlayerMoney();
                showOptions(playerArray[i]);
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
        int m = player711.getPositition() % 40;
        board2[(player711.getPositition() - holder.getSum()) % 40].setCar(Play12,false);
        board2[m].setCar(Play12, true);
        return m;
    }
    public void LandPlayer(Player player721,GUI_Player play20,int am) {


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
            gui.displayChanceCard("");
            String path = Attrs.getImagePath("GUI_Field.Image.Luck");
            GUI_Center.label[0].setIcon(new ImageIcon(this.getClass().getResource(path)));
            centerPanel.setBackground(GUI_Board.BASECOLOR);

        }

           else   if(playerField1 instanceof Metro){
            gui.showMessage("Du har landt ved Metro-Stoppet, du tar nu metroen til næste stop!");

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
        if(currentPlayerPosition % 40>player72.getPositition() % 40 && !(board3.fieldlist[amn] instanceof Hardprison) ) {
            if(!(board3.fieldlist[amn] instanceof Start))
                gui.showMessage("Du har passeret start.");
            board3.fieldlist[0].landOndField(player72);
        }

    }
public void showOptions(Player play12) {
    textdata = gui.getUserSelection("Her er din muligheder som felt ejer.", "Spil videre"
            , "Sælg et felt en spiller", "Sælg et felt til banken","Køb et hus","Køb et hotel");
    //kode for sælge til bank
    if (textdata.equals("Sælg et felt til banken")) {



        int feltNumber = gui.getUserInteger("Skrive det feltnumere på det du ænsker at sælge.(Please, ik bruge bogstaver!)");
        if (play12.getOwnerlist(feltNumber) && board3.fieldlist[feltNumber - 1] instanceof BuyableField
                && board2[feltNumber - 1] instanceof GUI_Street) {
            play12.myWallet.setSquareMoney(((BuyableField) board3.fieldlist[feltNumber - 1]).getPrice2() / 2);
            play12.myWallet.UpdateMoney();
            play12.setOwnerlist(feltNumber, false);
            ((BuyableField) board3.fieldlist[feltNumber - 1]).sellHouse(null);
            ((GUI_Street) board2[feltNumber - 1]).setBorder(Color.BLACK);

        }

    } else if (textdata.equals("Sælg et felt en spiller")) {
        int feltNumber = gui.getUserInteger("Skriv det feltnumere på det du ænsker at sælge .(Please, ik bruge bogstaver!)");

        int playerNumber = gui.getUserInteger("Skriv hvem du ønsker at sælge til .(Et tal fra 3-6)");
        if (play12.getOwnerlist(feltNumber) && board3.fieldlist[feltNumber - 1] instanceof BuyableField
                && board2[feltNumber - 1] instanceof GUI_Street) {
            String chosenButtomkober = gui.getUserButtonPressed(
                    "Player" + playerNumber + "vil du købe feltet",
                    "Ja", "Nej");
            if (chosenButtomkober.equals("Ja")) {

                play12.myWallet.setSquareMoney(((BuyableField) board3.fieldlist[feltNumber - 1]).getPrice2());
                play12.myWallet.UpdateMoney();
                playerArray[playerNumber - 1].myWallet.setSquareMoney(-((BuyableField) board3.fieldlist[feltNumber - 1]).getPrice2());
                playerArray[playerNumber - 1].myWallet.UpdateMoney();
                play12.setOwnerlist(feltNumber, false);
                playerArray[playerNumber - 1].setOwnerlist(feltNumber);
                ((BuyableField) board3.fieldlist[feltNumber - 1]).sellHouse(playerArray[playerNumber - 1]);
                ((GUI_Street) board2[feltNumber - 1]).setBorder(playArray[playerNumber - 1].getPrimaryColor());


            }


        }
    }

    else if (textdata.equals("Køb et hus")){
        int feltNumber = gui.getUserInteger("Skriv det feltnummer, du ønsker at bygge hus på .(Please, ik bruge bogstaver!");
if(colourSet.checkFullColor(play12,board3.fieldlist,feltNumber) && board3.fieldlist[feltNumber-1] instanceof BuyableField && board2[feltNumber-1] instanceof GUI_Street){
    ((BuyableField) board3.fieldlist[feltNumber-1]).addHouse(1);
    ((GUI_Street) board2[feltNumber-1]).setHouses(1);


}

    }}
    public void updatePlayerMoney(){
        for(int f = 0;f<playerArray.length;f++) {
            playArray[f].setBalance(playerArray[f].myWallet.getMoney());
        }
    }

















    public void dropDown(Player play12){
     // kode for en slags dropliste.
     String [] str= new String[play12.ownerlist.length];
     for(int i=0;i<play12.ownerlist.length;i++){
         if(play12.ownerlist[i]){
             str[i]=Integer.toString(i);
         }
     }

     String textdata2 = gui.getUserSelection("Her er din muligheder som felt ejer.", "Spil videre"
             , "Sælg et felt til en anden spiller", "Sælg et felt til banken");
 }

}