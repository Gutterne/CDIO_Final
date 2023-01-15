package org.example;
import Fields.Ferry;
import Fields.Hardprison;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Shipping;
import gui_main.GUI;
import org.example.Board;
import org.example.HelperController;


public class ChanceActions {

    public void chancePulls(Player player10, GUI_Player player14, GUI_Field[] board30, int chanceNum2, GUI gui, int cards) {
        switch (cards) {
            case 0, 1:
                //Er ikke implementeret
                break;

            case 2, 7, 9:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(-1000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 3:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(-300);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 4, 8, 10:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(-200);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 5:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(-3000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 12, 13:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(500);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 17:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(3000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 18, 19 ,20, 21, 22, 14, 15, 16:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(1000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 23:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(200);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 28,29:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(40));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 30:
                board30[player10.getPositition()%40].removeAllCars();
                player10.setPositition(player10.getPositition()+3);
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 31,32:
                board30[player10.getPositition()%40].removeAllCars();
                player10.setPositition(player10.getPositition()-3);
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 33:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(11));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 34: // Virker ikke helt endnu
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                int nearestFerry = player10.findNearestFerryField(player10.getPositition());
                player10.setPositition(nearestFerry);
                board30[player10.getPositition() % 40].setCar(player14, true);
                break;
            case 37:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(24));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 38:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(32));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 39:
                //Ikke implementeret
                break;

            case 40:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(19));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 41:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(39));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 42:
                //Ikke implementeret endnu
                break;
            case 43, 44:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(10));
                player10.myWallet.setSquareMoney(-1000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;


        }
    }

    public void chancePulls(Player player721, GUI_Player play20, GUI_Field[] board2, String chancecards, GUI gui) {
    }
}
