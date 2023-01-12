package Fields;

import org.example.Player;
import org.example.Wallet;
import org.w3c.dom.ls.LSOutput;

public class Tax extends UnbuyableField{
    int money;
    public Tax (String fieldName,int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }

    public void landOndField(Player player1) {

        //subtracts 4000
        player1.myWallet.setSquareMoney(-money);
        player1.myWallet.UpdateMoney();

    }
}

