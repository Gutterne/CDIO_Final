package Fields;

import org.example.Player;


public class  BuyableField extends Field {
    private  int rent0,rent1,rent2,rent3,rent4,rent5;
    private Player owner;
    private String color, valg;
    private int House,hotel,price2;

    public BuyableField(String fieldName,String color, int BoardNumber,int cost, int rent0, int rent1, int rent2, int rent3, int rent4, int rent5){
        super(fieldName,BoardNumber);
        this.color=color;
        this.rent0=rent0; this.rent1=rent1; this.rent2=rent2;this.rent3=rent3;this.rent4=rent4;this.rent5=rent5;
  price2=rent0;


    }


    // if player can afford the house scenario.
    public void landOndField(Player player10,Boolean choice) {
// Her checker vi om det er første gang der nogen der lander på feltet.
// Normale scenario, da folk sikker kommer til at købe alle skøder de kan.

        if (owned == false) {
            System.out.println("Vil du købe skøden for "+ price2 +"?");
  // hvis ja, bliver man ejeren, så længe man har råd til det.
 if (choice){
            if (player10.myWallet.getMoney() > price2) {
                player10.myWallet.setSquareMoney(-price2);
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
        public void addHouse(int antalHuse){
          if(antalHuse==1) {
           price2 = rent1;
           House = 1;
}

else if(antalHuse==2){
    price2 =rent2;
    House=2;}
else if (antalHuse==3){
    price2 =rent3;
    House=3;}
    else if (antalHuse==4){
        price2 =rent4;
        House=4;}

    else{
        price2 =rent5;
        hotel=1;}



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


}




