package Fields;

import org.example.Player;

public class Metro extends Field {

    Player player;
    private String color;


    public Metro(String fieldName, String color, int BoardNumber) {
        super(fieldName, BoardNumber);
        this.color = color;

        {
        }
    }
}