package Fields;

import org.example.Player;

//Brewery.java, accounts for fields, such as coca-cola & tuborg squash)
public class Brewery extends Field {
    private  int cost;

    Player player;
    private String color;


    public Brewery(String fieldName,String color, int BoardNumber,int cost, int rent0,int rent1){
        super(fieldName,BoardNumber);
        this.cost=cost;
        this.color=color;

    }


//Contains ownership properties.
    @Override
    // if player can afford the Brewery scenario.
    public void landOndField(Player player1) {

        if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }

        if (owned == false) {
            if (player1.myWallet.getMoney() > cost) {
                player1.myWallet.setSquareMoney(-cost);
                player1.myWallet.UpdateMoney();
                player1.setOwnerlist(getBoardNumber());
                owned = true;

            }
            // if player is broke scenario. He will lose the rest of his money hahah.
            else {
                if (!player1.getOwnerlist(getBoardNumber())) {
                    player1.myWallet.setSquareMoney(-cost);
                    player1.myWallet.UpdateMoney();
                }
            }
        } else {

            if (!player1.getOwnerlist(getBoardNumber())) {
                // scenario where player can afford the rent.
                if (player1.myWallet.getMoney() > cost) {
                    player1.myWallet.setSquareMoney(-cost);
                    player1.myWallet.UpdateMoney();

                    // Moiz

                } else {
                    // sceario where player cannot afford to pay rent.
                    player1.myWallet.setSquareMoney(-cost);
                    player1.myWallet.UpdateMoney();


                }
            }
        }
    }

}
