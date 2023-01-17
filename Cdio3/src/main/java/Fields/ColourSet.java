package Fields;

import org.example.Board;
import org.example.Player;
import Fields.BuyableField;
public class ColourSet {
Board board= new Board();

    public Boolean checkFullColor(Player play11, Field[] bord, int fieldnumber){
        int count=0;
        String str2;
        for(int i=0;i<play11.ownerlist.length;i++){
            if(bord[fieldnumber]instanceof BuyableField && bord[i] instanceof BuyableField ){
                str2=((BuyableField)bord[fieldnumber-1]).getColor();
                String str1 = ((BuyableField)bord[i]).getColor();
                if(str1.equals(str2)){
                    count++;
                }

            }


        }
        if(count==3){
            return true;
        }
        else
            return false;
    }

}
