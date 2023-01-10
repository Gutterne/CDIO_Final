package Fields;

import org.example.Player;
import org.example.Wallet;

public class Start extends Field{
    private int money;
    public Start (String fieldName, int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }


    public void landOndField(Player player10) {
        player10.myWallet.setSquareMoney(money);
        player10.myWallet.UpdateMoney();
    }

}


