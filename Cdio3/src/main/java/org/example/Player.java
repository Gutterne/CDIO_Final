package org.example;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Player {
    public Wallet myWallet;
    private int money2,positition;
    private boolean[] ownerlist;
    private int[] ints;
    public boolean isInJail;
    private boolean inPrison;
    private int balance;

    String name;
    public Player(String name, int money) {
        this.name=name;
        money2=money;
        myWallet = new Wallet(money2);
        ints = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        ownerlist = new boolean[]{false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false};
        isInJail=false;

    }

    public boolean getOwnerlist(int bool) {
        boolean m =ownerlist[bool];
        return m;
    }
    public void setOwnerlist(int bool) {
        ownerlist[bool]= true;
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

    public void setPositition(int positition) {
        this.positition = positition;
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

}


