package Fields;

import org.example.Player;
import org.example.Wallet;
import org.w3c.dom.ls.LSOutput;

public class LesserTax extends UnbuyableField{
    int money;
    public LesserTax(String fieldName,int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }

    public void landOndField(Player player1) {
        //subtracts 2000
        //added LesserTax class for low coupling high cohesion, incase we want to add the possibility
        //of choosing between paying 10% in home values, or 4000, at Skattevæsnet, the more expensive variant
        player1.myWallet.setSquareMoney(-money);
        player1.myWallet.UpdateMoney();
        System.out.println();
    }
}