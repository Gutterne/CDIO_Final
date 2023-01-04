package Fields;


import org.example.Wallet;

import org.example.Player;


class BuyableFieldTest {


    void manKanKøbeEtFelt() {
        var auto = new BuyableField("Hus", "rød", 20, 5);
        Player player1 = new Player(10);
        Player player2 = new Player(10);
        auto.landOndField(player1, player2);
        auto.landOndField(player2, player1);

    }

    void ManKanBetaleleje() {
        var auto = new BuyableField("hus","rød",20,5);
        Player player1 = new Player(10);
        Player player2 = new Player(10);
        auto.isOwned();
        auto.landOndField(player1, player2);
        auto.landOndField(player1, player2);


    }


    void ManKanFåleje() {
        var auto = new BuyableField("hus","rød",20,5);
        Player player1 = new Player(10);
        Player player2 = new Player(10);

        auto.landOndField(player1, player2);
        auto.landOndField(player2, player1);


    }
}