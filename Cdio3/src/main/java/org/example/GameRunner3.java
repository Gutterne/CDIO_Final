package org.example;
import Fields.Field;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
public class GameRunner3 extends GameRunner2 {
    int p3;

    public void GameRun3(GUI_Player play1, GUI_Player play2, GUI_Player play3, GUI_Field[] board2, GUI gui, Player player1, Player player2, Player player3) throws InterruptedException {
        gui.showMessage("Player 1 tryk enter:");
        p1 += holder.sum();

        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        int m = p1 % 24;
        if (board2[(p1 - holder.getSum()) % 24].hasCar(play3) && board2[(p1 - holder.getSum()) % 24].hasCar(play2)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play2, true);
            board2[(p1 - holder.getSum()) % 24].setCar(play3, true);
        } else if (board2[(p1 - holder.getSum()) % 24].hasCar(play2)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play2, true);

        } else if (board2[(p1 - holder.getSum()) % 24].hasCar(play3)) {
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
            board2[(p1 - holder.getSum()) % 24].setCar(play3, true);
        } else
            board2[(p1 - holder.getSum()) % 24].removeAllCars();
        board2[m].setCar(play1, true);

        Field playerField1 = board3.fieldlist[m];
        playerField1.landOndField(player1, player2, player3);
        play1.setBalance(player1.myWallet.getMoney());
        play2.setBalance(player2.myWallet.getMoney());
        play3.setBalance(player3.myWallet.getMoney());

        checkIfWinner(player1, player2, player3, gui);
        //Check if player reaches win

        //CHECK PROPERTY IF's

        if (playerField1.isOwned() && player1.getOwnerlist(m + 1)) {
            gui.showMessage("Player1 owns this property");
        } else if (playerField1.isOwned() && player2.getOwnerlist(m + 1))
            gui.showMessage("This property belongs to player 2, pay rent.");
        else if (player1.isInJail())
            gui.showMessage("You in jail, pay a fine of 1 next round.");
        else if (playerField1.isOwned() && player2.getOwnerlist(m + 1)) {
            gui.showMessage("This property belongs to player 3, pay rent.");
        } else
            System.out.println();

        gui.showMessage("Player 2 tryk enter:");
        p2 += holder.sum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        int n = p2 % 24;
        if (board2[(p2 - holder.getSum()) % 24].hasCar(play1) && board2[(p2 - holder.getSum()) % 24].hasCar(play3)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play1, true);
            board2[(p2 - holder.getSum()) % 24].setCar(play3, true);
        } else if (board2[(p2 - holder.getSum()) % 24].hasCar(play3)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play3, true);

        } else if (board2[(p2 - holder.getSum()) % 24].hasCar(play1)) {
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
            board2[(p2 - holder.getSum()) % 24].setCar(play1, true);
        } else
            board2[(p2 - holder.getSum()) % 24].removeAllCars();
        board2[n].setCar(play2, true);


        Field playerField2 = board3.fieldlist[n];
        playerField2.landOndField(player2, player1, player3);
        play1.setBalance(player1.myWallet.getMoney());
        play2.setBalance(player2.myWallet.getMoney());
        play3.setBalance(player3.myWallet.getMoney());

        checkIfWinner(player1, player2, player3, gui);
        if (playerField2.isOwned() && player1.getOwnerlist(n + 1)) {
            gui.showMessage("Player 2 owns this property");

        } else if (playerField2.isOwned() && player2.getOwnerlist(n + 1))
            gui.showMessage("This property belongs to player 1, Give up money.");
        else if (player2.isInJail())
            gui.showMessage("You in jail, pay a fine of 1 next round.");
        else if (playerField2.isOwned() && player3.getOwnerlist(n + 1)) {
            gui.showMessage("This property belongs to player 3, bitch better have my money");
        } else
            System.out.println();

        gui.showMessage("Player 3 tryk enter:");
        p3 += holder.sum();
        gui.setDice(holder.die1.getFacevalue(), holder.die2.getFacevalue());
        int o = p3 % 24;
        if (board2[(p3 - holder.getSum()) % 24].hasCar(play1) && board2[(p3 - holder.getSum()) % 24].hasCar(play2)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play2, true);
            board2[(p3 - holder.getSum()) % 24].setCar(play1, true);
        } else if (board2[(p3 - holder.getSum()) % 24].hasCar(play2)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play2, true);

        } else if (board2[(p3 - holder.getSum()) % 24].hasCar(play1)) {
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
            board2[(p3 - holder.getSum()) % 24].setCar(play1, true);
        } else
            board2[(p3 - holder.getSum()) % 24].removeAllCars();
        board2[o].setCar(play3, true);

        Field playerField3 = board3.fieldlist[o];
        playerField3.landOndField(player3, player1, player2);
        play1.setBalance(player1.myWallet.getMoney());
        play2.setBalance(player2.myWallet.getMoney());
        play3.setBalance(player3.myWallet.getMoney());



        checkIfWinner(player1, player2, player3, gui);
        if (playerField3.isOwned() && player3.getOwnerlist(o + 1)) {
            gui.showMessage("Player 3 owns this property");

        } else if (playerField3.isOwned() && player2.getOwnerlist(o + 1))
            gui.showMessage("This property belongs to player2, pay rent.");
        else if (player3.isInJail())
            gui.showMessage("You in jail, pay a fine of 1 next round.");
        else if (playerField3.isOwned() && player1.getOwnerlist(o + 1)) {
            gui.showMessage("This property belongs to player 1, pay rent.");
        } else
            System.out.println();
    }

    public void checkIfWinner(Player player1, Player player2, Player player3, GUI gui) throws InterruptedException {
        if (player1.myWallet.getMoney() == 0)
        {
            winner = true;
            if (player2.myWallet.getMoney() > player3.myWallet.getMoney()) {
                gui.showMessage("VI HAR EN VINDER DING DING, TILLYKKE PLAYER 2, Du har vundet verdens bedste spil");
                setWinner(gui);
            } else
                gui.showMessage("VI HAR EN VINDER DING, TILLYKKE PLAYER 3, Bare tuk tuk!");
            setWinner(gui);
        } else if (player2.myWallet.getMoney() == 0)
        {
            winner = true;
            if (player1.myWallet.getMoney() > player3.myWallet.getMoney()) {
                gui.showMessage("VI HAR EN VINDER DING DING, TILLYKKE PLAYER 1, Du har vundet verdens bedste spil");
                setWinner(gui);
            } else
                gui.showMessage("VI HAR EN VINDER DING, TILLYKKE PLAYER 3, Bare tuk tuk!");
            setWinner(gui);
        } else if (player3.myWallet.getMoney() == 0) {
            winner = true;
            if (player1.myWallet.getMoney() > player2.myWallet.getMoney()) {
                gui.showMessage("VI HAR EN VINDER DING DING, TILLYKKE PLAYER 1, Du har vundet verdens bedste spil");
                setWinner(gui);
            } else
                gui.showMessage("VI HAR EN VINDER DING, TILLYKKE PLAYER 3, Bare tuk tuk!");
            setWinner(gui);
        }

    }
}
