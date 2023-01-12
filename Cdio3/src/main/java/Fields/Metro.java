package Fields;
import org.example.Player;


public class Metro extends Field {
    private int cost;

    Player player;
    private String color;


    public Metro(String metroName, String color, int BoardNumber) {
        super(metroName, BoardNumber);
        this.color = color;

    }

    public void landOndField(Player TravelPlayer) {
        //TravelPlayer.setPositition(TravelPlayer.getPositition() + 8);

        //first metro stop to second
        if(player1.getPositition()==8){
            TravelPlayer.setPositition(16);
        } //second metro stop to third
        else if (player1.getPositition()==16){
            TravelPlayer.setPositition(26);
        } //third metro stop to fourth
        else if(player1.getPositition()==26){
            TravelPlayer.setPositition(37);
        } //fourth metro stop to first
        else if(player1.getPositition()==37){
            TravelPlayer.setPositition(8);
        }

    }




}
