package Fields;

import org.example.Player;
import org.example.Wallet;
import org.w3c.dom.ls.LSOutput;

//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.

//tax fields, is under the rules of "skattevæsnet" & "skatskassen" fields, it subtracts 4000 money from the individual player.
public class Tax extends Field{
    //directory of variables
    int money;

    //method reference for backend board - board.java
    public Tax (String fieldName,int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }

    //Scenario where player "lands on the field"
    public void landOndField(Player player1) {

        //subtracts 4000
        player1.myWallet.setSquareMoney(-4000);
        player1.myWallet.UpdateMoney();
        System.out.println("Du har ramt statskassen, du skal betale 4000");

    }
}

