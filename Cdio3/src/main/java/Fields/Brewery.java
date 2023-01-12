package Fields;

import org.example.Player;

public class Brewery extends Field {
    private  int cost;
    private Player owner;
    private String color, valg;
    private int House,hotel;



    public Brewery(String ferryName,String color, int BoardNumber,int cost,int rent1, int rent2){
        super(ferryName,BoardNumber);
        this.cost=cost;
        this.color=color;
    }
//Contains ownership properties.
    // if player can afford the house scenario.
    public void landOndField(Player player10,Boolean choice) {
// Here we check if its the first time somebody is landing on the following field.
// It's a normal scenario, since everybody wants to buy the field if they can.
        if (owned == false) {
            System.out.println("Vil du købe skøden for "+cost+"?");
            // If yes, you become the owner, as long as you can afford it.
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
                    System.out.println("Du har ikke råd til at købe et Bryggeri, få styr på din økonomi");
                }
            }
            else {
                System.out.println("Du har valgt nej, til at købe bryggeriet.");
            }

        } else {
// If you land on a different field.
            if (!player10.getOwnerlist(getBoardNumber())) {
                // scenario where player can afford the rent.
                // the normal scenario that happens more often.
                if (player10.myWallet.getMoney() > cost) {
                    player10.myWallet.setSquareMoney(-cost);
                    player10.myWallet.UpdateMoney();
                    owner.myWallet.setSquareMoney(cost);
                    owner.myWallet.UpdateMoney();


                } else {
                    // sceario where player cannot afford to pay rent.
                    // player doesn't recieve money which is in circulation.
                    player10.myWallet.setSquareMoney(-cost);
                    player10.myWallet.UpdateMoney();
                    owner.myWallet.setSquareMoney(player10.myWallet.getMoney());
                    owner.myWallet.UpdateMoney();


                }
            }
            else{
                System.out.println("Du ejer feltet, så du skal ikke betale leje. Business is booming.");
            }
        }
    }
}






