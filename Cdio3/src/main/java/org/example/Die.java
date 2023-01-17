package org.example;

// constructor which initializes the face value of the die to 6
public class Die {

    private final int MaxSides=6;
    private int facevalue;

    public Die(){
        facevalue=6; // the state of the object before any action.
    }

    // getter method for the face value of the die
    public int getFacevalue() {
        return facevalue;
    }

    // setter method for the face value of the die
    public void setFacevalue(int facevalue) {
        this.facevalue = facevalue;
    }

    // method to roll the die, generates a random number between 1 and MaxSides
// and sets the face value to the generated number
    public int  roll(){
        facevalue=(int)(Math.random()*MaxSides+1);
        return facevalue;
    }




}