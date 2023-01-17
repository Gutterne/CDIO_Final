package org.example;


import Fields.Ferry;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Shipping;

//This is the Player class that represents a player in the game.
//The class has a number of fields, including a Wallet object, an array of booleans to keep track of ownership of properties,
// and variables to track the player's jail status, position, and balance.
public class Player {
    //directory of variables
    public Wallet myWallet;
    private int money2,positition;
    public boolean[] ownerlist;
    private int[] ints;
    public boolean isInJail;
    private boolean inPrison;
    private int balance;
    private String []colourset;

    public Board board3;

    String name;
    private int currentPositition;

    public Player(String name, int money) {
        this.name=name;
        money2=money;
        myWallet = new Wallet(money2);
        ints = new int[]{1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20
                ,21,22,23,24,25,26,27,28,29,30
                ,31,32,33,34,35,36,37,38,39,40};
        ownerlist = new boolean[]{false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false,false,false
                ,false,false,false,false,false,false,false,false,false,false,false
                ,false,false,false,false,false,false,false,false,false,false,false
                ,false,false,false,false,false,false,false};
        isInJail=false;

    }
    //The class also has a number of methods that can be used to check and update the player's status and properties,
    // such as the getOwnerlist() and setOwnerlist() methods to check and update ownership of properties,
    // and the isInJail() and setInJail() methods to check and update the player's jail status.
    public boolean getOwnerlist(int bool) {
        boolean m =ownerlist[bool];
        return m;
    }
    public void setOwnerlist(int bool) {
        ownerlist[bool]= true;
    }
    public void setOwnerlist(int bool,boolean bole) {
        ownerlist[bool]= bole;
    }
    public boolean isInJail() {
        return isInJail;
    }

    public void setInJail(boolean inJail) {
        isInJail = inJail;
    }

    public String getName() {
        return name;
    }

    public int getPositition() {
        return positition;
    }

    public int setPositition(int positition) {
        this.positition = positition;
        return positition;
    }
    public boolean isInPrison() {
        return this.inPrison;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }


    //This method finds the nearest ferry field to the player's current position,
    // updates the player's position to that field and pay the owner of the field if there is any.
    public int findNearestFerryField(int currentPositition) {
        this.currentPositition = currentPositition;
        int nearestFerryField = -1;
        int nearestFerryDistance = Integer.MAX_VALUE;
        for (int i = 0; i < board3.fieldlist.length; i++) {
            if (board3.fieldlist[i] instanceof Ferry) {
                int distance = (i - currentPositition + board3.fieldlist.length) % board3.fieldlist.length;
                if (distance < nearestFerryDistance) {
                    nearestFerryDistance = distance;
                    nearestFerryField = i;
                }
            }if (nearestFerryField != -1) {
                setPositition(nearestFerryField);
                GUI_Ownable ferry = null;
                String owner = ferry.getOwnerName();
                if ((owner != null) && (owner != null )) {
                    int rent = Integer.parseInt(ferry.getRent());
                    myWallet.setSquareMoney(-rent*2);
                    myWallet.UpdateMoney();
                }
            }
        }
        return nearestFerryField;
    }

    /*public void rykTilNærmesteRederi(Player[] board30) {
        int closestFerry = -1;
        int closestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < board30.length; i++) {
            if (board30[i] instanceof GUI_Shipping) {
                int distance = Math.abs(getPositition() - i);
                if (distance < closestDistance) {
                    closestDistance = distance;
                    closestFerry = i;
                }
            }
        }
        if (closestFerry != -1) {
            setPositition(closestFerry);
            GUI_Shipping ferry = (GUI_Shipping) board30[closestFerry];
            String owner = ferry.getOwnerName();
            if (owner != null && owner != this) {
                int rent = Integer.parseInt(ferry.getRent());
                myWallet.setSquareMoney(-rent*2);
                myWallet.UpdateMoney();
            }
        }
    }*/

}


