package Fields;

import org.example.Player;
//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.

public class Parking extends Field {
    //directory of variables
    private int cost;
    Player player;
    private String color;

    // Constructor
    public Parking(String fieldName, String color, int BoardNumber, int cost) {
        super(fieldName, BoardNumber);
        this.cost = cost;
        this.color = color;

        {
        }
    }
}


