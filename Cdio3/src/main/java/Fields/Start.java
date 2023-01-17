package Fields;

import org.example.Player;
import org.example.Wallet;
//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.

public class Start extends Field{
    //directory of variables
    private int money;
    public Start (String fieldName, int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }


    //scenario where a player "lands on the field"
    public void landOndField(Player player10) {
        player10.myWallet.setSquareMoney(money);
        player10.myWallet.UpdateMoney();
        System.out.println(player10.getPositition()+"akæsjfklajdfoilkjakldfjalk");
    }

}


