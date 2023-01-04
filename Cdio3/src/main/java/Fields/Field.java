package Fields;
import org.example.*;
public class  Field {
    private String fieldName;
    protected final  int BoardNumber;
    Player player1,player2,player3,player4;
    protected boolean owned=false;

    public  Field (String fieldName, int BoardNumber){
        this.fieldName=fieldName;
        this.BoardNumber=BoardNumber;

    }

    public int getBoardNumber() {
        return BoardNumber;
    }
    public void landOndField(Player player1,Player player2) {

    }
    public void landOndField(Player player1,Player player2,Player player3) {

    }
    public void landOndField(Player player1,Player player2,Player player3, Player player4) {

    }

    public boolean isOwned() {
        return owned;
    }
}
