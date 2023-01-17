package org.example;
import gui_main.GUI;

public class Holder {


    private int sum;
    public boolean extraTurn;




    Die die1,die2;

    public Holder() {
        die1=new Die();
        die2= new Die();
    }

    /**
     *
     * @return
     */
    public int sum() {
        int roll1 = die1.roll();
        int roll2 = die2.roll();
        if (roll1 == roll2) {
            extraTurn = true;
        }
        sum = roll1 + roll2;
        return sum;
    }
    public int getSum() {
        return sum;
    }

    /**
     *
     * @return
     */
    public String toString() {
        String result = Integer.toString(sum);
        return result;
    }
    public boolean getExtraTurn() {
        return extraTurn;
    }
    public boolean extraTurn() {
        if (getExtraTurn()) {
            extraTurn = false;
            return true;
        }
        return false;
    }

}