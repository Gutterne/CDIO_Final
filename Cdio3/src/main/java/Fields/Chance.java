package Fields;

import org.example.Die;
import org.example.Player;
import org.example.Wallet;

public class Chance extends UnbuyableField {
    private Die die8;
    private   int [] bunke1,bunke2,bunke3,bunke4,bunke5,bunke6;
    private int randomBunke,nextCardUp;
    public Chance(String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);
        die8 = new Die();
        bunke1 = new int[]{1,2,3,4,5,6,};
        bunke2 = new int[]{3,6,2,4,1,5};
        bunke3 = new int[]{5,6,2,3,1,4};
        bunke4 = new int[]{3,1,6,2,5,4};
        bunke5 = new int[]{6,4,2,5,3,1};
        bunke6 = new int[]{6,2,3,4,1,5};
    }

    @Override
    public void landOndField(Player player1) {




    }
}
