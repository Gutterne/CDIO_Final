package Fields;

import org.example.Player;

public class Prison extends UnbuyableField{
    public Prison (String fieldName, int BoardNumber){
        super(fieldName,BoardNumber);

    }
    @Override
    public void landOndField(Player player1, Player player2) {
player1.setInJail(true);

    }
    @Override
    public void landOndField(Player player1,Player player2,Player player3) {
        player1.setInJail(true);

    }
    @Override
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {
        player1.setInJail(true);

    }
}
