package Fields;

import org.example.Player;

public class Prison extends UnbuyableField{
    public Prison (String fieldName, int BoardNumber){
        super(fieldName,BoardNumber);

    }
    @Override
    public void landOndField(Player player10) {
        player10.setInJail(true);
    }

}