package org.example;
import Fields.Ferry;
import Fields.Hardprison;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Shipping;
import gui_main.GUI;
import org.example.Board;
import org.example.HelperController;

//this class has the responsibility of chance cards actions.
public class ChanceActions {

//The method uses a switch statement to check the card number and performs different actions based on the card number.
// Some of the actions include moving the player to a different field, adding or subtracting money from the player's wallet,
// and moving the player's game piece on the GUI board. Overall, this class is responsible for handling all
// actions that occur when a player lands on a chance field.
    public void chancePulls(Player player10, GUI_Player player14, GUI_Field[] board30, int cardsNumber) {

        switch (cardsNumber) {

            case 0, 5, 7:
                player10.myWallet.setSquareMoney(-1000);
                player10.myWallet.UpdateMoney();
                break;
            case 2, 6, 8:
                player10.myWallet.setSquareMoney(-200);
                player10.myWallet.UpdateMoney();
                break;
            case 1:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(-300);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 3, 4:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(-3000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 9:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(-2000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 10, 11:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(500);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 12, 13 ,14, 15, 16, 17, 18, 19:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(1000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 20:
                board30[player10.getPositition()%40].removeAllCars();
                player10.myWallet.setSquareMoney(200);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 21,22:
                board30[player10.getPositition()%40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(0));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 23:
                board30[player10.getPositition()%40].removeAllCars();
                player10.setPositition(player10.getPositition()+3);
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 24, 25:
                board30[player10.getPositition()%40].removeAllCars();
                player10.setPositition(player10.getPositition()-3);
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 26:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(11));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 27:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(24));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 28:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(32));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 29:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(19));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 30:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(39));
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
            case 31, 32:
                board30[player10.getPositition()  % 40].removeAllCars();
                player10.setPositition(player10.getPositition());
                player10.setPositition(player10.setPositition(10));
                player10.myWallet.setSquareMoney(-1000);
                player10.myWallet.UpdateMoney();
                board30[player10.getPositition()%40].setCar(player14, true);
                break;
        }
    }


}
