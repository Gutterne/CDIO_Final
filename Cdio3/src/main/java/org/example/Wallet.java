package org.example;

//This is the Wallet class which is used to keep track of a player's money.
public class Wallet {
    private int money; //private instance variable "money" which stores the current amount of money the player has.
    private int SquareMoney; //private instance variable "SquareMoney" which is used to keep track of the money that is gained or lost on a specific square.

    //The class has a constructor which initializes the money with the given value
    public Wallet(int money){
this.money=money;
    }

    /**
     *
     * @return
     */
    //The class has a getter method getSquareMoney() which returns the SquareMoney
    public int getSquareMoney() {
        return SquareMoney;
    }

    /**
     *
     * @param squareMoney
     */
    //The class has a setter method setSquareMoney() which sets the SquareMoney
    public void setSquareMoney(int squareMoney) {
        SquareMoney = squareMoney;
    }

    /**
     *
     * @return
     */
    //The class has a method UpdateMoney() which updates the money by adding the squareMoney to it.
    // If the squareMoney is negative and the absolute value of squareMoney is greater than the money then the money
    // is set to zero.
    public int UpdateMoney(){
        if ( 0 >SquareMoney && -SquareMoney> money) {
            money = 0;}
        else {
            money = money + SquareMoney;
        }
        return money;
    }
    //getter method getMoney() which returns the current money the player has.
    public int getMoney() {
        return money;
    }
}