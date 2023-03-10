package Fields;

import org.example.Player;
//this class is responsible for field actions when the individual player lands on the following field, all of this is used in the backend board.


public class  BuyableField extends Field {
    //directory of variables
    private  int cost;
    private  int rent0,rent1,rent2,rent3,rent4,rent5;
    private Player owner;
    private String color, valg;
    private int House=0,hotel,price2;

    //this method is referenced in board.java and inherits much of it's properties from fields.
    //the buyable field, contains all of the following requirements for each field, from the matador task requirements
    //field requirements given by the teacher, in the excel document, in Materials>Fields
    public BuyableField(String fieldName,String color, int BoardNumber,int cost, int rent0, int rent1, int rent2, int rent3, int rent4, int rent5){
        super(fieldName,BoardNumber);
        this.color=color;
        this.cost=cost;
        this.rent0=rent0; this.rent1=rent1; this.rent2=rent2;this.rent3=rent3;this.rent4=rent4;this.rent5=rent5;
  price2=rent0;


    }


    // if player can afford the house scenario.
    public void landOndField(Player player10,Boolean choice) {
// Her checker vi om det er første gang der nogen der lander på feltet.
// Normale scenario, da folk sikker kommer til at købe alle skøder de kan.
        if (owned == false) {
            System.out.println("Vil du købe skøden for "+ cost +"?");
  // hvis ja, bliver man ejeren, så længe man har råd til det.
 if (choice){
            if (player10.myWallet.getMoney() > cost) {
                player10.myWallet.setSquareMoney(-cost);
                player10.myWallet.UpdateMoney();
                player10.setOwnerlist(getBoardNumber());
                owned = true;
                owner = player10;
                System.out.println("Du ejer nu skøden.");
            }
            else {
                //
                System.out.println("Du har ikke råd til at købe feltet, spare som penge sammen");
            }
            }
       else {
     System.out.println("Du har valgt nej, så din tur er forbi.");
 }

        } else {
                // hvis man lander på en andens felt.
            if (!player10.getOwnerlist(getBoardNumber())) {
                // scenario where player can afford the rent.
                // den normale scenario, som sker mere ofte.
                if (player10.myWallet.getMoney() > price2) {
                    player10.myWallet.setSquareMoney(-price2);
                    player10.myWallet.UpdateMoney();
                    owner.myWallet.setSquareMoney(price2);
                    owner.myWallet.UpdateMoney();


                } else {
                    // sceario where player cannot afford to pay rent.
                    // den her gør at spilleren ikke for penge som ikke er i kredsløb.
                    player10.myWallet.setSquareMoney(-price2);
                    player10.myWallet.UpdateMoney();
                    owner.myWallet.setSquareMoney(player10.myWallet.getMoney());
                    owner.myWallet.UpdateMoney();


                }
            }
                else{
                    System.out.println("Du ejer feltet, så du skal ikke betale leje");
                }
            }
        }
        public void addHouse(){
            if(House<=3){
                House++;
            }


          if(House==1) {
           price2 = rent1;

}

else if(House==2){
    price2 =rent2;
    }
else if (House==3){
    price2 =rent3;
   }
    else if (House==4){
        price2 =rent4;
        }

    else{
        price2 =rent5;
        House=5;}



}

        public void sellHouse(Player play11){
        owner=play11;
        }

    public String getColor() {
        return color;
    }

    public int getHouse() {
        return House;
    }

    public int getHotel() {
        return hotel;
    }

    public void setOwner(Player owner) {
        if (owner == null) {
            this.owner = null;
            owned=false;
        } else {
            this.owner = owner;

        }
    }

    public int getPrice2() {
        return price2;
    }

    public int getCost() {
        return cost;
    }
}




