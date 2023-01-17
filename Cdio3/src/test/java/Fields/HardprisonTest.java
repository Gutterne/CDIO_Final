package Fields;

import org.example.Player;
import org.example.Wallet;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HardprisonTest {
    @Test
    public void Hardprionfunktion() {
        Player player1 = new Player("Player 1");
        player1.myWallet = new Wallet(50000);
        Hardprison field = new Hardprison("Hard Prison", 20);

        int initialPosition = player1.getPositition();
        int initialMoney = player1.myWallet.getSquareMoney();

        field.landOndField(player1);

        assertEquals(initialPosition + 20, player1.getPositition());
        assertEquals(initialMoney - 1000, player1.myWallet.getSquareMoney());
    }

}

