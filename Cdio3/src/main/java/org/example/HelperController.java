package org.example;

import Fields.BuyableField;
import Fields.Field;
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

    boolean extraturn=false;

    private int[] chancecards = new int[0];

    private Chance chance ;

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
        for(int dm=0;dm<playerArray.length;dm++)
            gui.addPlayer(playArray[dm]);
        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                int posit = movePlayer(playerArray[i],playArray[i],RollTheDice());
                LandPlayer(playerArray[i],posit);
                updatePlayerMoney();
                if (extraturn==true){
                    RollTheDice();
                    movePlayer(playerArray[i],playArray[i],RollTheDice());
                    // Der er en bug med display af cars.
                }





            }
        }
    }
    public int RollTheDice(){
       holder.sum();
       int p1 = holder.getSum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        if(holder.die1.getFacevalue() == holder.die2.getFacevalue()){
            extraturn=true;
            gui.showMessage("Du slog to ens, du får derfor ekstra tur");
        }
        return p1;
    }
    public int movePlayer(Player player711,GUI_Player Play12, int DiceSum){
        player711.setPositition(player711.getPositition() + DiceSum);
        int m = player711.getPositition() % 40;
        board2[(player711.getPositition() - holder.getSum()) % 40].removeAllCars();
        gui.setDice(holder.die1.getFacevalue(),holder.die2.getFacevalue());
        board2[m].setCar(Play12, true);
        return m;
    }

    public void LandPlayer(Player player721,int am){
        Field playerField1 = board3.fieldlist[am];
        String chosenButton = null;
        //String cards = String.valueOf(chancecards[(int) (Math.random() * 44 + 1)]);
        if (playerField1 instanceof BuyableField) {
            if (!playerField1.isOwned()) {
                chosenButton = gui.getUserButtonPressed(
                        "Du har landet på " + playerField1.getFieldName() + "" +
                                ". Vil du købe den?",
                        "Ja", "Nej"
                );
                if (chosenButton.equals("Ja")) {
                    ((BuyableField) playerField1).landOndField(player721, true);
                } else {
                    ((BuyableField) playerField1).landOndField(player721, false);
                }
            }
            else {
                gui.showMessage("Du har landet på et felt du ejer.");

            }


        }
             /* else if (playerField1 instanceof Chance){
               gui.displayChanceCard("_My message_")
               gui.showMessage("Du har landet på chance felt.");
               gui.showMessage(((Chance) playerField1).getChancecards());
        } */
        else {
            playerField1.landOndField(player721, true);
        }
        if (playerField1 instanceof Chance) {
            gui.displayChanceCard(((Chance) playerField1).getChancecards());
            chosenButton = gui.getUserButtonPressed(
                    "",
                    "Ok"
            );
            gui.displayChanceCard("");
            String path = Attrs.getImagePath("GUI_Field.Image.Luck");

            //GUI_Center.label[0].setText("");
            GUI_Center.label[0].setIcon(new ImageIcon(this.getClass().getResource(path)));
            centerPanel.setBackground(GUI_Board.BASECOLOR);

        }

        /*if (chosenButton.equals("Ok")) {
            ((Chance) playerField1).landOndField(player721, true);
            }*/

        /*if (playerField1 instanceof Chance) {
            JOptionPane.showMessageDialog(null, "De har vundet vild med dans og skifter navn til Allan!");
        }*/

          /*public String getChancecards() {
            String cards = chancecards[(int) (Math.random() * 44 + 1)];
            return cards;
        }*/


    }

    public void updatePlayerMoney(){
        for(int f = 0;f<playerArray.length;f++) {
            playArray[f].setBalance(playerArray[f].myWallet.getMoney());
        }
    }


}