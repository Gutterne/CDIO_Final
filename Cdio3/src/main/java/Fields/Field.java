package Fields;
import org.example.*;
public abstract class  Field {
    private int cashOut;
    private String fieldName;
    protected final int BoardNumber;
    Player player1, player2, player3, player4;
    protected boolean owned = false;
    private String color;

    public Field(String fieldName, int BoardNumber) {
        this.fieldName = fieldName;
        this.BoardNumber = BoardNumber;
    }

    public int getBoardNumber() {
        return BoardNumber;
    }

    public void landOndField(Player player10) {

    }

    public boolean isOwned() {
        return owned;
    }


    public String getFieldName() {
        return fieldName;
    }

    public String getColor() {
        return color;
    }
}