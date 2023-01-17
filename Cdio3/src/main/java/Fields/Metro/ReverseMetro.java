package Fields.Metro;
import Fields.*;

import org.example.Player;

public class ReverseMetro extends Field {
    private int cost;

    Player travelplayer;
    private String color;

    public ReverseMetro(String metroName, String color, int BoardNumber) {
        super(metroName, BoardNumber);
        this.color = color;
    }

    public void landOndField(Player travelPlayer) {
        if(travelPlayer.getPositition()%40==4){
            travelPlayer.setPositition(15);
        } //second metro stop to third
        else if (travelPlayer.getPositition()%40==15){
            travelPlayer.setPositition(25);
        } //third metro stop to fourth
        else if(travelPlayer.getPositition()%40==25){
            travelPlayer.setPositition(33);
        } //fourth metro stop to first
        else if(travelPlayer.getPositition()%40==33){
            travelPlayer.setPositition(4);
        }
    }
}
