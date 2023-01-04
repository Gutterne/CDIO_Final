package org.example;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Player {
    public Wallet myWallet;
    private int money2;
    private boolean[] ownerlist;
    private int[] ints;
    private boolean isInJail;
    public Player(int money) {
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
   //set ownerlist, det her er hvad der udgør int[] ints array listen, og påsætter elementen til at være true, så man ved
   //hvad der påsat til listen
    public void setOwnerlist(int bool) {
   ownerlist[bool]= true;
    }

    //det samme som ovenstående, bare for jail.
    public boolean isInJail() {
        return isInJail;
    }

    public void setInJail(boolean inJail) {
        isInJail = inJail;
    }
}



