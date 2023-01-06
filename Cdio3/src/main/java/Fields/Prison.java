package Fields;


import org.example.Player;

//Hardprison.java is a part of the prison field which has rougher rules on the player.
//Prison.java contains the less rougher rules, and is esenntially the same as parking.
public class Prison extends UnbuyableField {
    public Prison(String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);

        //Boolean value redirected into true.
    }

    private boolean onVisit;

    public void transport() {
        this.onVisit = true;
    }



}