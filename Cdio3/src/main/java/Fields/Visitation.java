package Fields;

import org.example.Player;
import org.example.Wallet;

public class Visitation extends UnbuyableField {
    public Visitation (String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);
    }
    @Override
    public void landOndField(Player player1,Player player2) {

         if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }

    }
    public void landOndField(Player player1,Player player2,Player player3) {

         if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }

    }
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {

         if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }

    }
}