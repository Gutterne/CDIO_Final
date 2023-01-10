package org.example;

import Fields.BuyableField;
import Fields.Field;
import Fields.Start;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class HelperController {
    private boolean playing = true;
    private Board board3;
    private Holder holder;
    private GUI gui;
    private Player[] playerArray;
    private GUI_Player[] playArray;
    private GUI_Field[] board2;

    private GUI_Ownable ownable;

    boolean extraturn = false;

    public HelperController(Player[] playerArray, GUI_Player[] playArray, GUI gui
            , GUI_Field[] board2) {
        this.gui = gui;
        this.playArray = playArray;
        this.playerArray = playerArray;
        holder = new Holder();
        board3 = new Board();
        this.board2 = board2;

    }

    public void GameRunner() {
        for (int dm = 0; dm < playerArray.length; dm++)
            gui.addPlayer(playArray[dm]);
        while (playing) {
            for (int i = 0; i < playerArray.length; i++) {
                gui.showMessage(playerArray[i].getName() + " tryk enter:");
                int posit = movePlayer(playerArray[i], playArray[i], RollTheDice());
                LandPlayer(playerArray[i], posit,playArray[i]);
                updatePlayerMoney();
                if (extraturn == true) {
                    RollTheDice();
                    movePlayer(playerArray[i], playArray[i], RollTheDice());
                    // Der er en bug med display af cars.
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
            gui.showMessage("Du slog to ens, du får derfor ekstra tur");
        }
        return p1;
    }

    public int movePlayer(Player player711, GUI_Player Play12, int DiceSum) {
        player711.setPositition(player711.getPositition() + DiceSum);
        int m = player711.getPositition() % 40;
        board2[(player711.getPositition() - holder.getSum()) % 40].removeAllCars();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        board2[m].setCar(Play12, true);
        return m;
    }

    public void LandPlayer(Player player721, int am, GUI_Player getCarColor) {
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
                        ((GUI_Street) board2[am]).setBorder(getCarColor.getPrimaryColor());

                        //ONLY FOR STREETS, NEED A TEXT WORKAROUND FOR FERRIES & BREWERIES, DUE TO BEING A FIELD not a Ownable.

                    } else {
                        ((BuyableField) playerField1).landOndField(player721, false);
                    }
                } else {
                    if (!player721.getOwnerlist(am + 1)) {
                        gui.showMessage("Ew! Du ejer ikke feltet.Betal for leje.");
                        ((BuyableField) playerField1).landOndField(player721, false);
                    } else {
                        gui.showMessage("Du har landet på et felt du ejer.");
                        ((BuyableField) playerField1).landOndField(player721, false);
                    }

                }

            } else {
                playerField1.landOndField(player721);
            }
        }
    }


        public void updatePlayerMoney(){
            for (int f = 0; f < playerArray.length; f++) {
                playArray[f].setBalance(playerArray[f].myWallet.getMoney());
            }
        }


    }
