package org.example;

import Fields.Hardprison;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;


public class ChanceActions {

    public void chancePulls(Player player10, GUI_Player play14, GUI_Field[] board30, int chanceNum2, GUI gui) {
        switch (chanceNum2) {
            case 30:
                board30[player10.getPositition()%40].removeAllCars();
                player10.setPositition(player10.getPositition()+3);
                board30[player10.getPositition()%40].setCar(play14, true);
                break;
            case 31:
                board30[player10.getPositition()%40].removeAllCars();
                player10.setPositition(player10.getPositition()-3);
                board30[player10.getPositition()%40].setCar(play14, true);
                break;
            case 12:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(500);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(play14, true);
                break;
            case 43:
                board30[player10.getPositition()  % 40].removeAllCars();
                //player10.setPositition(player10.getPositition()+);
                board30[player10.getPositition()%40].setCar(play14, true);
                break;
            case 41:



                break;
            case 6:
                gui.showMessage("");

                break;
            case 7:
                gui.showMessage("");

                break;
            case 8:
                gui.showMessage("");

                break;
            case 9:
                gui.showMessage("");

                break;
            case 10:
                gui.showMessage("");

                break;


        }
    }
}
