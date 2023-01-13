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

    private ReverseBoard reverseBoard3;
    private Holder holder;
    private GUI gui;
    private Player[] playerArray;
    private GUI_Player[] playArray;
    private GUI_Field[] board2;


    private GUI_Field[] reverseBoard;
    private int[] buyableFields;

    private int[] chancecards = new int[0];

    private Chance chance;

    boolean boardCondition;
    private int currentPlayerPosition;

    private JPanel centerPanel = new JPanel();

    boolean extraturn = false;


    public HelperController(Player[] playerArray, GUI_Player[] playArray, GUI gui
            , GUI_Field[] board2, GUI_Field[] reverseBoard, boolean reverseCondition) {
        this.gui = gui;
        this.playArray = playArray;
        this.playerArray = playerArray;
        holder = new Holder();
        this.boardCondition = reverseCondition;
        buyableFields = new int[]{1, 3, 5, 6, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19, 21, 23, 24, 25,
                26, 27, 28, 29, 31, 32, 34, 35, 37, 39, 40};
        if (reverseCondition == false) {
            board3 = new Board();
            this.board2 = board2;
        }
        if (reverseCondition == true) {
            reverseBoard3 = new ReverseBoard();
            this.reverseBoard = reverseBoard;
        }
    }

    public void GameRunner() {
        for (int dm = 0; dm < playerArray.length; dm++)
            gui.addPlayer(playArray[dm]);
        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                currentPlayerPosition = playerArray[i].getPositition();
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                int posit = movePlayer(playerArray[i], playArray[i], RollTheDice());

                LandPlayer(playerArray[i], playArray[i], posit);


                passerStart(playerArray[i], posit);
                updatePlayerMoney();
                if (extraturn == true) {
                    RollTheDice();//Used to make a new roll, so not the same is displayed twice, resulting in infinite loop.
                    movePlayer(playerArray[i], playArray[i], RollTheDice());
                    LandPlayer(playerArray[i], playArray[i], posit);

                }
            }
        }
    }

    public int RollTheDice() {
        holder.sum();
        int p1 = holder.getSum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        if (holder.die1.getFacevalue() == holder.die2.getFacevalue()) {
            extraturn = true;
            gui.showMessage("Du slog to ens, du får derfor et ekstra tur");
        }
        return p1;
    }

    public int movePlayer(Player player711, GUI_Player Play12, int DiceSum) {
        player711.setPositition(player711.getPositition() + DiceSum);
        int m = player711.getPositition() % 40;
        if (boardCondition == true) {
            reverseBoard[(player711.getPositition() - holder.getSum()) % 40].removeAllCars();
            reverseBoard[m].setCar(Play12, true);
        }
        if (boardCondition == false) {
            board2[(player711.getPositition() - holder.getSum()) % 40].removeAllCars();
            board2[m].setCar(Play12, true);
        }
        return m;
    }

    public void LandPlayer(Player player721, GUI_Player play20, int am) {

        if (boardCondition == false) {
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
                        } else {
                            ((BuyableField) playerField1).landOndField(player721, false);
                        }

                    } else {
                        gui.showMessage("Du har landet på et felt du ejer.");

                    }
                }
            }
            if (playerField1 instanceof Brewery) {
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
            }
            if (playerField1 instanceof Ferry) {
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
            }
            if (playerField1 instanceof Chance) {

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
            if (playerField1 instanceof Metro) {
                gui.showMessage("Du har landt ved Metro-Stoppet, du tar nu metroen til næste stop!");
                //board2[player721.getPositition() % 40].setCar();
            }
            if (playerField1 instanceof Hardprison) {

                gui.showMessage("Du skal gå til fængsel og modtage ikke 4000");
                gui.showMessage("Du har betalt 1000 kr. for at få love at kaster teninge næste gange ");
                board2[player721.getPositition() % 40].removeAllCars();
                ((Hardprison) playerField1).landOndField(player721);
                board2[player721.getPositition() % 40].setCar(play20, true);


            } else {
                playerField1.landOndField(player721);
            }
        }
        if (boardCondition == true) {
            Field reverseField1 = reverseBoard3.fieldListReverse[am];
            if (reverseField1 instanceof BuyableField) {
                if (!reverseField1.isOwned()) {
                    String chosenButton = gui.getUserButtonPressed(
                            "Du har landet på " + reverseField1.getFieldName() + "" +
                                    ". Vil du købe den?",
                            "Ja", "Nej"
                    );
                    if (chosenButton.equals("Ja")) {
                        ((BuyableField) reverseField1).landOndField(player721, true);
                        if (reverseBoard[am] instanceof GUI_Street) {
                            ((GUI_Street) reverseBoard[am]).setBorder(play20.getPrimaryColor());
                        } else {
                            ((BuyableField) reverseField1).landOndField(player721, false);
                        }

                    } else {
                        gui.showMessage("Du har landet på et felt du ejer.");

                    }
                }
            }
            if (reverseField1 instanceof Brewery) {
                if (!reverseField1.isOwned()) {
                    String chosenButtonBrewery = gui.getUserButtonPressed(
                            "Du har landet på " + reverseField1.getFieldName() + "" +
                                    ". Vil du købe dette bryggeri?",
                            "Ja", "Nej"
                    );
                    if (chosenButtonBrewery.equals("Ja")) {
                        ((Brewery) reverseField1).landOndField(player721, true);
                        ((GUI_Brewery) reverseBoard[am]).setBorder(play20.getPrimaryColor());
                    } else {
                        ((Brewery) reverseField1).landOndField(player721, false);
                    }
                } else {
                    gui.showMessage("Du ejer allerede bryggeriet");

                }
            }
            if (reverseField1 instanceof Ferry) {
                if (!reverseField1.isOwned()) {
                    String chosenButtonFerry = gui.getUserButtonPressed(
                            "Du har landet på " + reverseField1.getFieldName() + "" +
                                    ". Vil du købe denne superFærge",
                            "Ja", "Nej"
                    );
                    if (chosenButtonFerry.equals("Ja")) {
                        ((Ferry) reverseField1).landOndField(player721, true);
                        ((GUI_Shipping) reverseBoard[am]).setBorder(play20.getPrimaryColor());
                    } else {
                        ((Ferry) reverseField1).landOndField(player721, false);
                    }
                } else {
                    gui.showMessage("Du ejer allerede denne færge");

                }
            }
            if (reverseField1 instanceof Chance) {

                System.out.println("Chance Land");
                gui.displayChanceCard(((Chance) reverseField1).getChancecards());
                String chosen = gui.getUserButtonPressed(
                        "",
                        "Ok"
                );
                gui.displayChanceCard("");
                String path = Attrs.getImagePath("GUI_Field.Image.Luck");
                GUI_Center.label[0].setIcon(new ImageIcon(this.getClass().getResource(path)));
                centerPanel.setBackground(GUI_Board.BASECOLOR);

            }
            if (reverseField1 instanceof Metro) {
                gui.showMessage("Du har landt ved Metro-Stoppet, du tar nu metroen til næste stop!");
                //board2[player721.getPositition() % 40].setCar();
            }
            if (reverseField1 instanceof Hardprison) {

                gui.showMessage("Du skal gå til fængsel og modtage ikke 4000");
                gui.showMessage("Du har betalt 1000 kr. for at få love at kaster teninge næste gange ");
                reverseBoard[player721.getPositition() % 40].removeAllCars();
                ((Hardprison) reverseField1).landOndField(player721);
                reverseBoard[player721.getPositition() % 40].setCar(play20, true);


            } else {
                reverseField1.landOndField(player721);
            }
        }

    }

    public void passerStart(Player player72, int amn) {
        if (boardCondition == true) {
            if (currentPlayerPosition % 40 > player72.getPositition() % 40 && !(reverseBoard3.fieldListReverse[amn] instanceof Hardprison)) {
                if (!(reverseBoard3.fieldListReverse[amn] instanceof Start))
                    gui.showMessage("Du har passeret start.");
                reverseBoard3.fieldListReverse[0].landOndField(player72);
            }

        }
    }


        public void updatePlayerMoney () {
            for (int f = 0; f < playerArray.length; f++) {
                playArray[f].setBalance(playerArray[f].myWallet.getMoney());
            }
        }



}