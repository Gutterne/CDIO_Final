package Fields;

import org.example.Player;

//Hardprison.java is a part of the prison field which has rougher rules on the player.
//Prison.java contains the less rougher rules, and is esenntially the same as parking.
public class Prison extends Field {
    public Prison(String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);

        //Boolean value redirected into true.
    }

    boolean onVisit;

    public void transport() {
        this.onVisit = true;
    }

    @Override
    public void landOndField(Player player1) {
        System.out.println(player1.getPositition()+"Du landet på en gratis filet");
    }
}



