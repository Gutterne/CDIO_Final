package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gui_fields.*;
import org.
import org.junit.jupiter.api.Test;

public class ChanceActionsTest {
    @Test
    public void testChancePulls() {
        Player player10 = new Player("player1", 30000);
        player10.setPositition(10);
        player10.myWallet.setSquareMoney(10000);

        int postition = player10.getPositition() % 40;
        GUI_Player player14 = new GUI_Player("player1", 1000);

        GUI_Field[] board30 = new GUI_Field[40];


        ChanceActions chanceActions = new ChanceActions();

        // Test case where cardsNumber is 0, 5, or 7
        chanceActions.chancePulls(player10, player14, board30, 0);
        assertEquals(29000, player10.myWallet.getMoney());
    }
@Test
    public void test(){
    Player player10 = new Player("player1", 30000);
    player10.setPositition(10);
    player10.myWallet.setSquareMoney(10000);

    int postition = player10.getPositition() % 40;
    GUI_Player player14 = new GUI_Player("player1", 200);

    GUI_Field[] board30 = new GUI_Field[40];


    ChanceActions chanceActions = new ChanceActions();
    // Test case where cardsNumber is 2, 6, or 8
    chanceActions.chancePulls(player10, player14, board30, 2);
    assertEquals(29800, player10.myWallet.getMoney());
}



}