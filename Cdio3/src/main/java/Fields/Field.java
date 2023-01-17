package Fields;
import org.example.*;

// This class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.
// This class inherits its values to nearly all the classes in fields folder, which is used for backend board properties.
public abstract class  Field {
    // Directory of variables
    private int cashOut;
    private String fieldName;
    protected final int BoardNumber;
    Player player1, player2, player3, player4;
    protected boolean owned = false;

    //Constructor
    public Field(String fieldName, int BoardNumber) {
        this.fieldName = fieldName;
        this.BoardNumber = BoardNumber;
    }

    //Getter for BoardNumber
    public int getBoardNumber() {
        return BoardNumber;
    }

    // Abstract method for landing on field, to be overridden by subclasses
    public void landOndField(Player player10) {

    }

    // Getter for ownership status
    public boolean isOwned() {
        return owned;
    }

    // Getter for cashOut
    public int getCashOut() {
        return cashOut;
    }

    // Getter for fieldName
    public String getFieldName() {
        return fieldName;
    }
}
