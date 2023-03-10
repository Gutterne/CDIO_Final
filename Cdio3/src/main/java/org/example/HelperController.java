package org.example; // This line declares the package that the class "HelperController" belongs to.

import Fields.*;
import Fields.Metro.Metro;
import gui_codebehind.GUI_Center;
import gui_fields.*;
import gui_main.GUI;
import gui_resources.Attrs;
import javax.swing.JPanel;
import javax.swing.*;

import java.awt.*;

import static gui_tests.TestRunExampleGame.sleep;


public class HelperController {
    //directory of variables
    private boolean playing = true;
    private int p1; // p1 - an integer used to store the sum of the dice roll
    private Board board3;
    private Holder holder;

    private GUI gui;
    public Audio audio = new Audio();
    private Player[] playerArray;
    private GUI_Player[] playArray;
    private GUI_Field [] board2t;
    private GUI_Field [] reversalBoard;
    private int[] buyableFields;

    private int[] chancecards = new int[0];
    private Chance chance ;
    boolean boardCondition;
    private Board BOARD_SIZE;
    private ChanceActions chanceAct;
    private int currentPlayerPosition; // currentPlayerPosition - an integer representing the current position of the player on the game board

    private String textdata;


    private JPanel centerPanel = new JPanel(); // centerPanel - a JPanel object
    boolean extraturn=false; // extraturn - a boolean representing if a player has an extra turn or not
    private int fields;
    Field playerField1;


int plade;
    // HelperController class
// This class is responsible for controlling the flow of the game. It contains methods for moving players,
// checking for extra turns, updating player money, and running the game.
    public HelperController(Player[] playerArray, GUI_Player[] playArray,GUI gui
            ,GUI_Field[] board2,GUI_Field[] reversalBoard, boolean reverseCondition,int plate) {
        this.gui = gui; // gui - an instance of the GUI class
        this.playArray=playArray; // playArray - an array of GUI_Player objects
        this.playerArray=playerArray; // playerArray - an array of Player objects
        holder=new Holder(); // holder - an instance of the Holder class
        board3= new Board(); // board3 - an instance of the Board class
        boardCondition = reverseCondition;
        this.reversalBoard =reversalBoard;
        this.board2t = board2;

        if(reverseCondition ==true){
            this.reversalBoard =board2t;
        }
        if(reverseCondition == false){
            this.board2t =board2;
        }
   // reversalBoard - an array of GUI_Field objects representing the reversed game board
       // board2 - an array of GUI_Field objects representing the game board
        chanceAct= new ChanceActions();  // chanceAct - an instance of the ChanceActions class
    }

// This method is responsible for running the game. It contains a loop that iterates through the playerArray and
// performs various actions for each player,
// such as moving the player, checking for extra turns, landing the player on a field, and updating player money.
    public void GameRunner(){


        for(int dm=0;dm<playerArray.length;dm++) {
            gui.addPlayer(playArray[dm]);
            board2t[0].setCar(playArray[dm],true);
        }
// playing - a boolean that keeps track of whether the game is still in progress or not
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
    // This method rolls the dice and returns the sum of the roll. It also updates
    // the GUI with the rolled values and plays a sound effect.
    public int RollTheDice(){
       holder.sum();
       int p1 = holder.getSum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        audio.DiceSound();
        return p1;
    }
    // This method takes in a Player object, a GUI_Player object, and the sum of a dice roll as parameters.
    // It updates the player's position on the game board and updates the GUI to reflect the player's new position.
    public int movePlayer(Player player711,GUI_Player Play12, int DiceSum){
        player711.setPositition(player711.getPositition() + DiceSum);
        int m = player711.getPositition() % 40;
        board2t[(player711.getPositition() - holder.getSum()) % 40].setCar(Play12,false);
        board2t[m].setCar(Play12, true);
if(boardCondition == false) {
    board2t[(player711.getPositition() - holder.getSum()) % 40].setCar(Play12,false);
    board2t[m].setCar(Play12, true);
}
if(boardCondition ==true) {
    board2t = reversalBoard;
    reversalBoard[(player711.getPositition() - holder.getSum()) % 40].removeAllCars();
    reversalBoard[m].setCar(Play12, true);
}
        return m;
    }
    // This method takes in a Player object, a GUI_Player object, and an integer as parameters.
    // It checks the field the player has landed on and performs the appropriate action.
    public void LandPlayer(Player player721,GUI_Player play20,int am) {

/*
        Field playerFieldReverse = board3.fieldListReverse[am];
        Field playerField1 = board3.fieldlist[am];
        if (plade == 2) {
            playerField1 = board3.fieldListReverse[am];
            board2t = reversalBoard;
        }else{
          playerField1 = board3.fieldlist[am];
*/
        Field playerFieldReverse = board3.fieldListReverse[am];
        Field playerField1 = board3.fieldlist[am];

        if(boardCondition == false) {
            playerField1 = playerField1;
        }
        else {
            playerField1 = playerFieldReverse;
        }

        if (playerField1 instanceof BuyableField) {
            if (!playerField1.isOwned()) {
                String chosenButton = gui.getUserButtonPressed(
                        "Du har landet p?? " + playerField1.getFieldName() + "" +
                                ". Vil du k??be den?",
                        "Ja", "Nej"
                );
                if (chosenButton.equals("Ja")) {
                    ((BuyableField) playerField1).landOndField(player721, true);
                    if (board2t[am] instanceof GUI_Street) {
                        ((GUI_Street) board2t[am]).setBorder(play20.getPrimaryColor());
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
                         gui.showMessage("Du har landet p?? et felt du ejer.");
                        }

                }


        } else if (playerField1 instanceof Brewery) {
            if (!playerField1.isOwned()) {
                String chosenButtonBrewery = gui.getUserButtonPressed(
                        "Du har landet p?? " + playerField1.getFieldName() + "" +
                                ". Vil du k??be dette bryggeri?",
                        "Ja", "Nej"
                );
                if (chosenButtonBrewery.equals("Ja")) {
                    ((Brewery) playerField1).landOndField(player721, true);
                    ((GUI_Brewery) board2t[am]).setBorder(play20.getPrimaryColor());
                } else {
                    ((Brewery) playerField1).landOndField(player721, false);
                }
            } else {
                gui.showMessage("Du ejer allerede bryggeriet");

            }
        } else if (playerField1 instanceof Ferry) {
            if (!playerField1.isOwned()) {
                String chosenButtonFerry = gui.getUserButtonPressed(
                        "Du har landet p?? " + playerField1.getFieldName() + "" +
                                ". Vil du k??be denne superF??rge",
                        "Ja", "Nej"
                );
                if (chosenButtonFerry.equals("Ja")) {
                    ((Ferry) playerField1).landOndField(player721, true);
                    ((GUI_Shipping) board2t[am]).setBorder(play20.getPrimaryColor());
                } else {
                    ((Ferry) playerField1).landOndField(player721, false);
                }
            } else {
                gui.showMessage("Du ejer allerede denne f??rge");

            }
        } else if (playerField1 instanceof Chance) {

            System.out.println("Chance Land");
            audio.ChanceSound(); // audio clip for "pr??v lykken" - clip of a lucky ring bell noise.
            gui.displayChanceCard(((Chance) playerField1).getChancecards());
            String chosen = gui.getUserButtonPressed(
                    "",
                    "Ok"
            );

            chanceAct.chancePulls(player721,play20, board2t,((Chance) playerField1).getCardsNumber());
            gui.displayChanceCard("");
            String path = Attrs.getImagePath("GUI_Field.Image.Luck");
            GUI_Center.label[0].setIcon(new ImageIcon(this.getClass().getResource(path)));
            centerPanel.setBackground(GUI_Board.BASECOLOR);

        }

        else if(playerField1 instanceof Metro){

                audio.MetroSound(); // Audio sound - metro audio file says DSB clip "N??ste Stop"
                gui.showMessage("Du har landt ved Metro-Stoppet, du tar nu metroen til n??ste stop!");
                board2t[player721.getPositition()  % 40].removeAllCars();
                ((Metro)playerField1).landOndField(player721);
                board2t[player721.getPositition() %40].setCar(play20, true);
        }

        else if (playerField1 instanceof Hardprison){

            gui.showMessage("Du skal g?? til f??ngsel og modtage ikke 4000");
            audio.JailSound(); // Audio sound for jail
            gui.showMessage("Du har betalt 1000 kr. for at f?? love at kaster teninge n??ste gange ");
            board2t[player721.getPositition()  % 40].removeAllCars();
            ((Hardprison)playerField1).landOndField(player721);
            board2t[player721.getPositition()%40].setCar(play20, true);
              }
              else {
                playerField1.landOndField(player721);
            }



        }

    // This method checks if the player landed on the start field, or passed it. and grants him the start money if it is the case.
    public void passerStart(Player player72,int amn){
        if(currentPlayerPosition % 40>player72.getPositition() % 40 && !(board3.fieldlist[amn] instanceof Hardprison) ) {
            if(!(board3.fieldlist[amn] instanceof Start))
                //audio.StartSound(); // audio file for passing start - voice clip of a short lucky bell
                gui.showMessage("Du har passeret start.");
            board3.fieldlist[0].landOndField(player72);
        }

    }
public void showOptions(Player play12) {
    textdata = gui.getUserSelection("Her er din muligheder som felt ejer.", "Spil videre"
            , "S??lg et felt en spiller", "S??lg et felt til banken","K??b et hus","K??b et hotel");
    //kode for s??lge til bank
    if (textdata.equals("S??lg et felt til banken")) {



        int feltNumber = gui.getUserInteger("Skrive det feltnumere p?? det du ??nsker at s??lge.(Please, ik bruge bogstaver!)");
        if (play12.getOwnerlist(feltNumber) && board3.fieldlist[feltNumber - 1] instanceof BuyableField
                && board2t[feltNumber - 1] instanceof GUI_Street) {
            play12.myWallet.setSquareMoney(((BuyableField) board3.fieldlist[feltNumber - 1]).getCost() / 2);
            play12.myWallet.UpdateMoney();
            play12.setOwnerlist(feltNumber, false);
            ((BuyableField) board3.fieldlist[feltNumber - 1]).sellHouse(null);
            ((GUI_Street) board2t[feltNumber - 1]).setBorder(Color.BLACK);

        }

    } else if (textdata.equals("S??lg et felt en spiller")) {
        int feltNumber = gui.getUserInteger("Skriv det feltnumere p?? det du ??nsker at s??lge .(Please, ik bruge bogstaver!)");

        int playerNumber = gui.getUserInteger("Skriv hvem du ??nsker at s??lge til .(Et tal fra 3-6)");
        if (play12.getOwnerlist(feltNumber) && board3.fieldlist[feltNumber - 1] instanceof BuyableField
                && board2t[feltNumber - 1] instanceof GUI_Street) {
            String chosenButtomkober = gui.getUserButtonPressed(
                    "Player" + playerNumber + "vil du k??be feltet",
                    "Ja", "Nej");
            if (chosenButtomkober.equals("Ja")) {

                play12.myWallet.setSquareMoney(((BuyableField) board3.fieldlist[feltNumber - 1]).getCost());
                play12.myWallet.UpdateMoney();
                playerArray[playerNumber - 1].myWallet.setSquareMoney(-((BuyableField) board3.fieldlist[feltNumber - 1]).getCost());
                playerArray[playerNumber - 1].myWallet.UpdateMoney();
                play12.setOwnerlist(feltNumber, false);
                playerArray[playerNumber - 1].setOwnerlist(feltNumber);
                ((BuyableField) board3.fieldlist[feltNumber - 1]).sellHouse(playerArray[playerNumber - 1]);
                ((GUI_Street) board2t[feltNumber - 1]).setBorder(playArray[playerNumber - 1].getPrimaryColor());


            }


        }
    }

    else if (textdata.equals("K??b et hus")){
        int feltNumber = gui.getUserInteger("Skriv det feltnummer, du ??nsker at bygge hus p?? .(Please, ik bruge bogstaver!");
if( board3.fieldlist[feltNumber-1] instanceof BuyableField && board2t[feltNumber-1] instanceof GUI_Street && ((BuyableField) board3.fieldlist[feltNumber-1]).getHouse()<5){

    ((BuyableField) board3.fieldlist[feltNumber-1]).addHouse();
    ((GUI_Street) board2t[feltNumber-1]).setHouses(((BuyableField) board3.fieldlist[feltNumber-1]).getHouse());


}

    }
    else if (textdata.equals("K??b et hotel")){
        int feltNumber = gui.getUserInteger("Skriv det feltnummer, du ??nsker at bygge et hotel p?? .(Please, ik bruge bogstaver!");

        if( board3.fieldlist[feltNumber-1] instanceof BuyableField && board2t[feltNumber-1] instanceof GUI_Street && ((BuyableField) board3.fieldlist[feltNumber-1]).getHouse()==4){
            ((BuyableField) board3.fieldlist[feltNumber-1]).addHouse();
            ((GUI_Street) board2t[feltNumber-1]).setHotel(true);

        }
    }
}
    // This method updates the money of the player on the GUI
    public void updatePlayerMoney(){
        for(int f = 0;f<playerArray.length;f++) {
            playArray[f].setBalance(playerArray[f].myWallet.getMoney());
            if(playerArray[f].myWallet.getMoney()==0){
                System.out.println("Tillyke,i har gennemf??rt spillet");
                System.exit(0);
            }
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
             , "S??lg et felt til en anden spiller", "S??lg et felt til banken");
 }

}