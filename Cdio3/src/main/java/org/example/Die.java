package org.example;

public class Die {

    private final int MaxSides=6;
    private int facevalue;

    public Die(){
        facevalue=6; // the state of the object before any action.
    }

    public int getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(int facevalue) {
        this.facevalue = facevalue;
    }

    public int  roll(){
        facevalue=(int)(Math.random()*MaxSides+1);
        return facevalue;

    }

    @Override
    public String toString() {
        return "Die{" +
                "facevalue=" + facevalue +
                '}';
    }
}