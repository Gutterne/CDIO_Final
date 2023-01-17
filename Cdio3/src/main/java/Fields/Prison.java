package Fields;

import org.example.Player;
// This class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.

// Hardprison.java is a part of the prison field which has rougher rules on the player.
// Prison.java contains the less rougher rules, and is essentially the same as parking.
public class Prison extends Field {
    public Prison(String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);

        // Boolean value redirected into true.
    }

    boolean onVisit;

    // transport method sets the onVisit field to true
    public void transport() {
        this.onVisit = true;
    }

    @Override
    public void landOndField(Player player1) {
        System.out.println(player1.getPositition()+"Du landet på en gratis filet");
    }
}
