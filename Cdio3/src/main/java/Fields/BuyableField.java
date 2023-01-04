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

    public int getColour(int Farve) {
        
        //Dette er arrayliste over forskellige farver, og hvilke gameboard nummer de indeholder.
        int Brun[] = new int[]{2, 3};
        int Lyseblå[] = new int[]{5, 6};
        int Lilla[] = new int[]{8, 9};
        int Orange[] = new int[]{11, 12};
        int Rød[] = new int[]{14, 15};
        int Gul[] = new int[]{17, 18};
        int Grøn[] = new int[]{20, 21};
        
        
        if (Farve == Brun[0]) {
            return Brun[1];
        } else if(Farve==Brun[1]){
            return Brun[0];
        } else if(Farve==Lyseblå[0]){
            return Lyseblå[1];
        } else if(Farve==Lyseblå[1]){
            return Lyseblå[0];
        } else if(Farve==Lilla[0]){
            return Lilla[1];
        } else if(Farve==Lilla[1]){
            return Lilla[0];
        } else if(Farve==Orange[0]){
            return Orange[1];
        } else if(Farve==Orange[1]){
            return Orange[0];
        } else if(Farve==Rød[0]){
            return Rød[1];
        } else if(Farve==Rød[1]){
            return Rød[0];
        } else if(Farve==Gul[0]){
            return Gul[1];
        } else if(Farve==Gul[1]){
            return Gul[0];
        } else if(Farve==Grøn[0]){
            return Grøn[1];
        } else if(Farve==Grøn[1]){
            return Grøn[0];
        }



        else {
            return 0;
        }
    }


    @Override
    // if player can afford the house scenario.
    public void landOndField(Player player1,Player player2) {

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
                if (player1.getOwnerlist(getBoardNumber()) && player1.getOwnerlist(getColour(getBoardNumber()))) {
                    player1.myWallet.setSquareMoney(-cost * 2);
                    player1.myWallet.UpdateMoney();
                    player2.myWallet.setSquareMoney(cost * 2);
                    player2.myWallet.UpdateMoney();
                } else if (player1.myWallet.getMoney() > cost) {
                    player1.myWallet.setSquareMoney(-cost);
                    player1.myWallet.UpdateMoney();
                    player2.myWallet.setSquareMoney(cost);
                    player2.myWallet.UpdateMoney();
                    // Moiz

                } else {
                    // sceario where player cannot afford to pay rent.
                    player1.myWallet.setSquareMoney(-cost);
                    player1.myWallet.UpdateMoney();
                    player2.myWallet.setSquareMoney(player1.myWallet.getSquareMoney());
                    player2.myWallet.UpdateMoney();

                }
            }
        }
    }
        @Override
        public void landOndField (Player player1, Player player2, Player player3){

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
                } else {
                    if (!player1.getOwnerlist(getBoardNumber())) {
                        player1.myWallet.setSquareMoney(-cost);
                        player1.myWallet.UpdateMoney();
                    }
                }
            } else {
                if (!player1.getOwnerlist(getBoardNumber())) {
                    if (player2.getOwnerlist(getBoardNumber())) {
                        if (player1.myWallet.getMoney() > cost) {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player2.myWallet.setSquareMoney(cost);
                            player2.myWallet.UpdateMoney();
                        } else {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player2.myWallet.setSquareMoney(player1.myWallet.getMoney());
                            player2.myWallet.UpdateMoney();
                        }
                    } else {
                        if (player1.myWallet.getMoney() > cost) {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player3.myWallet.setSquareMoney(cost);
                            player3.myWallet.UpdateMoney();
                        } else {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player3.myWallet.setSquareMoney(player1.myWallet.getMoney());
                            player3.myWallet.UpdateMoney();
                        }
                    }
                }
            }
        }

        @Override
        public void landOndField (Player player1, Player player2, Player player3, Player player4){

         if(player1.isInJail()) {
            player1.myWallet.setSquareMoney(-1);
            player1.myWallet.UpdateMoney();
            player1.setInJail(false);
        }

            if (owned == false) {
                if (owned == false) {
                    if (player1.myWallet.getMoney() > cost) {
                        player1.myWallet.setSquareMoney(-cost);
                        player1.myWallet.UpdateMoney();
                        player1.setOwnerlist(getBoardNumber());
                        owned = true;
                    } else {
                        if (!player1.getOwnerlist(getBoardNumber())) {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                        }
                    }
                }
            } else {
                if (!player1.getOwnerlist(getBoardNumber())) {

                    if (player2.getOwnerlist(getBoardNumber())) {
                        if (player1.myWallet.getMoney() > cost) {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player2.myWallet.setSquareMoney(cost);
                            player2.myWallet.UpdateMoney();
                        } else {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player2.myWallet.setSquareMoney(player1.myWallet.getMoney());
                            player2.myWallet.UpdateMoney();
                        }

                    } else if (player3.getOwnerlist(getBoardNumber())) {
                        if (player1.myWallet.getMoney() > cost) {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player3.myWallet.setSquareMoney(cost);
                            player3.myWallet.UpdateMoney();
                        } else {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player3.myWallet.setSquareMoney(player1.myWallet.getMoney());
                            player3.myWallet.UpdateMoney();
                        }
                    } else {
                        if (player1.myWallet.getMoney() > cost) {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player4.myWallet.setSquareMoney(cost);
                            player4.myWallet.UpdateMoney();
                        } else {
                            player1.myWallet.setSquareMoney(-cost);
                            player1.myWallet.UpdateMoney();
                            player4.myWallet.setSquareMoney(player1.myWallet.getMoney());
                            player4.myWallet.UpdateMoney();
                        }
                    }
                }
            }
        }
    }



