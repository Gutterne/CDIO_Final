package Fields;

import org.example.Player;
import org.example.Wallet;

public class Tax extends UnbuyableField{
    int money;
    public Tax (String fieldName,int BoardNumber,int money){
        super(fieldName,BoardNumber);
        this.money=money;
    }

    public void landOndField(Player player1){};

}

