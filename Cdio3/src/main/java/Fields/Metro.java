package Fields;
import org.example.Player;

public class Metro extends Field {
    private int cost;

    Player travelplayer;
    private String color;

    public Metro(String metroName, String color, int BoardNumber) {
        super(metroName, BoardNumber);
        this.color = color;
    }

    public void landOndField(Player travelPlayer) {
        if(travelPlayer.getPositition()==7){
            travelPlayer.setPositition(15);
        } //second metro stop to third
        else if (travelPlayer.getPositition()==15){
            travelPlayer.setPositition(25);
        } //third metro stop to fourth
        else if(travelPlayer.getPositition()==25){
            travelPlayer.setPositition(36);
        } //fourth metro stop to first
        else if(travelPlayer.getPositition()==36){
            travelPlayer.setPositition(7);
        }
    }
}
