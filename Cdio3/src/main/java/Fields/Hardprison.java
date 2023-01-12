package Fields;

import org.example.Player;
import org.w3c.dom.ls.LSOutput;

//Hardprison.java is a part of the prison field which has rougher rules on the player.
//Prison.java contains the less rougher rules, and is esenntially the same as parking.
public class Hardprison extends Field{
    public Hardprison(String fieldName, int BoardNumber){
        super(fieldName,BoardNumber);

        //Boolean value redirected into true.

    }

    public void landOndField(Player player1) {

            System.out.println(player1.getPositition()+"du skal gå til fænglse og modtage ikke 4000 og betale 1000");
            player1.setPositition(player1.getPositition()+20);
            System.out.println(player1.getPositition());

            player1.myWallet.setSquareMoney(-1000);
            player1.myWallet.UpdateMoney();

        }

}