package Fields;

import org.example.Player;

public class Parking extends Field {
    private int cost;

    Player player;
    private String color;


    public Parking(String fieldName, String color, int BoardNumber, int cost) {
        super(fieldName, BoardNumber);
        this.cost = cost;
        this.color = color;

        {
        }
    }
}


