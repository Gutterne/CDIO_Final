package Fields;

import org.example.Board;
import org.example.Player;
import Fields.BuyableField;
public class ColourSet {
Board board= new Board();

    public void checkFullColor(Player play11, Field[] bord, int fieldnumber){
        int count=0;
        for(int i=0;i<play11.ownerlist.length;i++){
            if(bord[fieldnumber]instanceof BuyableField ){
                String str2=((BuyableField)bord[fieldnumber-1]).getColor();
                String str1 = bord[i].getColor();

            }


        }
    }
}
