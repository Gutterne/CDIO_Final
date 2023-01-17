package Fields.Metro;
import Fields.Field;
import org.example.Player;
//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.

public class Metro extends Field {
    private int cost;

    Player travelplayer;
    private String color;

    //this method is referenced in board.java and inherits much of it's properties from fields.
    public Metro(String metroName, String color, int BoardNumber) {
        super(metroName, BoardNumber);
        this.color = color;
    }

    public void landOndField(Player travelPlayer) {
        if (travelPlayer.getPositition() % 40 == 7) {
            travelPlayer.setPositition(15);
        } //second metro stop to third
        else if (travelPlayer.getPositition() % 40 == 15) {
            travelPlayer.setPositition(25);
        } //third metro stop to fourth
        else if (travelPlayer.getPositition() % 40 == 25) {
            travelPlayer.setPositition(36);
        } //fourth metro stop to first
        else if (travelPlayer.getPositition() % 40 == 36) {
            travelPlayer.setPositition(7);
        }
    }
}
