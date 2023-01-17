package org.example;
import gui_main.GUI;

//this is a class, that is used the element "pure fabrication" from the GRASP design pattern.
//the class mainly has two Two Die objects, "die1" and "die2", that are created in the constructor. which is used as a
//"rafel bæger" and creates the phenonomom known as binomial equivalance or "binominal fordeling"
public class Holder {
//directory of variables

    private int sum; //A private int variable "sum" that stores the sum of the two die rolls.
    public boolean extraTurn; //A public boolean variable "extraTurn" that is set to true if the two die rolls are the same.

    Die die1,die2;

    //Two Die objects, "die1" and "die2", that are created in the constructor.
    public Holder() {
        die1=new Die();
        die2= new Die();
    }

    /**
     *
     * @return
     */
    // method that returns the current value of the "sum" variable.
    public int  sum(){
        sum = die1.roll()+die2.roll();

        return sum;

    }
    // method that returns the current value of the "sum" variable.
    public int getSum() {
        return sum;
    }

    /**
     *
     * @return
     */
    //method that returns the current value of integar "sum" as a String.
    public String toString() {
        String result = Integer.toString(sum);
        return result;
    }
}