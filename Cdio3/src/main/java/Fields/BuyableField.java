package Fields;

import org.example.Player;


public class BuyableField extends Field {
    private  int cost;

    Player player;
    private String color;


    public BuyableField(String fieldName,String color, int BoardNumber,int cost){
        super(fieldName,BoardNumber);
        this.cost=cost;
        this.color=color;

    }



    @Override
    // if player can afford the house scenario.
    public void landOndField(Player player1) {


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


