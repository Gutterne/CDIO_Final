package Fields;

import org.example.Player;


public class  BuyableField extends Field {
    private  int cost;
    private Player owner;
    private String color, valg;
    private int House,hotel;

    public BuyableField(String fieldName,String color, int BoardNumber,int cost, int rent0, int rent1, int rent2, int rent3, int rent4, int rent5){
        super(fieldName,BoardNumber);
        this.cost=cost;
        this.color=color;
    }


    // if player can afford the house scenario.
    public void landOndField(Player player10,Boolean choice) {
// Her checker vi om det er første gang der nogen der lander på feltet.
// Normale scenario, da folk sikker kommer til at købe alle skøder de kan.
        if (owned == false) {
            System.out.println("Vil du købe skøden for "+cost+"?");
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
                if (player10.myWallet.getMoney() > cost) {
                    player10.myWallet.setSquareMoney(-cost);
                    player10.myWallet.UpdateMoney();
                    owner.myWallet.setSquareMoney(cost);
                    owner.myWallet.UpdateMoney();


                } else {
                    // sceario where player cannot afford to pay rent.
                    // den her gør at spilleren ikke for penge som ikke er i kredsløb.
                    player10.myWallet.setSquareMoney(-cost);
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
    }




