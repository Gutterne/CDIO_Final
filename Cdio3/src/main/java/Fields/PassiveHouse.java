package Fields;

import org.example.Player;

public class PassiveHouse extends Prison {
    public PassiveHouse(String fieldName, int BoardNumber) {
        super(fieldName, BoardNumber);
    }

    public void landOn(Player player) {
        if (player.isInPrison()) {
            return;
        }
    }
        public void landOndField(Player player1) {
            player1.setInJail(true);
            if (player1.isInJail==true){return;
                // player is in jail, so other players do not have to pay rent for this player's properties
                    //for (BuyableField buyableField : player1.getOwnerlist()) {
                        //player1.setRentFree(true);
                 //   }
            //    } else {
                    // player is not in jail, so other players have to pay rent for this player's properties
                    //for (Property property : Player.getProperties()) {
                      //  property.setRentFree(false);
                    }
                }

            }



