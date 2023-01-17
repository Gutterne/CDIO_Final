package Fields.Metro;
import Fields.*;

import org.example.Player;
//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.
//this class is the reverse algorithm of metro, so it can be used on the reverseboard feature.
public class ReverseMetro extends Field {
    private int cost;
    private boolean taken=false;
    Player travelplayer;
    private String color;
    //this method is referenced in board.java and inherits much of it's properties from fields, it's parallel combared to Metro.
    public ReverseMetro(String metroName, String color, int BoardNumber) {
        super(metroName, BoardNumber);
        this.color = color;
    }

    public void landOndField(Player travelPlayer) {
        if(!taken){
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
        }        taken=true;

    }
}
