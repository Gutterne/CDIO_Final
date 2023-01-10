package Fields;

import org.example.Player;

//Hardprison.java is a part of the prison field which has rougher rules on the player.
//Prison.java contains the less rougher rules, and is esenntially the same as parking.
public class Hardprison extends UnbuyableField{
    public Hardprison(String fieldName, int BoardNumber){
        super(fieldName,BoardNumber);

        //Boolean value redirected into true.

    }

    public void landOndField(Player player1) {
        player1.setInJail(true);
    }

    //Hard Prison has three requirements
    // 1. 1000kr degradation of player wallet
    // 2. "Løsladelseskort" from "prøv lykken" can be used.
    // 3. Ved at kaste 2 af samme slags. Man flytter så straks det antal felter frem,
    // som øjnene viser, og har alligevel ekstrakast.
}