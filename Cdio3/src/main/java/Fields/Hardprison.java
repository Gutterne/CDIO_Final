package Fields;

import org.example.Player;
import org.w3c.dom.ls.LSOutput;
//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.

//Hardprison.java is a part of the prison field which has rougher rules on the player.
//Prison.java contains the less rougher rules, and is esenntially the same as parking.
public class Hardprison extends Field{
    public Hardprison(String fieldName, int BoardNumber){
        super(fieldName,BoardNumber);

        //Boolean value redirected into true.

    }

    //scenario when you "land on the field"
    @Override
    public void landOndField(Player player1) {

            System.out.println(player1.getPositition()+"du skal gå til fænglse og modtage ikke 4000 og betale 1000");
            player1.setPositition(player1.getPositition()+20);
            System.out.println(player1.getPositition()+"Du er i fængsel nu.");

            player1.myWallet.setSquareMoney(-1000);
            player1.myWallet.UpdateMoney();

        }

}