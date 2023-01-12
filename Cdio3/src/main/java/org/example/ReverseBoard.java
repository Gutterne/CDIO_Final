package org.example;

import Fields.*;

public class ReverseBoard {
    Field[] fieldListReverse;
    public ReverseBoard() {
        fieldListReverse = new Field[41];
        fieldListReverse[0] = new Start("Start", 1, 4000);
        fieldListReverse[1] = new BuyableField("Rådhuspladsen", "Lilla", 41, 8000);
        fieldListReverse[2] = new Tax("Tax", 40, 2000);
        fieldListReverse[3] = new BuyableField("Frederiksberggade", "Purple", 39, 7000);
        fieldListReverse[4] = new Chance("Prøv Lykken", 38);
        fieldListReverse[5] = new BuyableField("Rødby-Puttgarden", "Mørkeblå", 37, 4000);
        fieldListReverse[6] = new BuyableField("Nygade", "Gul", 36, 6400);
        fieldListReverse[7] = new Chance("Prøv Lykken", 35);
        fieldListReverse[8] = new BuyableField("Vimmelskaftet", "Gul", 34, 6000);
        fieldListReverse[9] = new Hardprison("FÆNGSEL!", 33);
        fieldListReverse[10] = new BuyableField("Amagertorv", "Gul", 32, 6000);
        fieldListReverse[11] = new Chance("Prøv Lykken", 31);
        fieldListReverse[12] = new BuyableField("Østergade", "Hvid", 30, 5600);
        fieldListReverse[13] = new Brewery("Coca Cola", "Rød", 29, 3000);
        fieldListReverse[14] = new BuyableField("Kongens Nytorv", "Hvid", 28, 5200);
        fieldListReverse[15] = new BuyableField("Bredgade", "Hvid", 27, 5200);
        fieldListReverse[16] = new BuyableField("Gedser - Rostock", "Mørkeblå", 26, 4000);
        fieldListReverse[17] = new BuyableField("Grønningen", "Rød", 25, 4800);
        fieldListReverse[18] = new BuyableField("Østerbrogade", "Rød", 24, 4400);
        fieldListReverse[19] = new Chance("Prøv Lykken", 23);
        fieldListReverse[20] = new BuyableField("Trianglen", "Rød", 22, 4400);
        fieldListReverse[21] = new Parking("Parkering", "Intet", 21, 0);
        fieldListReverse[22] = new BuyableField("Strandvejen", "Grøn", 20, 4000);
        fieldListReverse[23] = new BuyableField("Hellerupvej", "Grå", 19, 3600);
        fieldListReverse[24] = new Chance("Chance", 18);
        fieldListReverse[25] = new BuyableField("Bernstorffsvej", "Grå", 17, 3600);
        fieldListReverse[26] = new BuyableField("Mols-linjen", "Mørkeblå", 16, 4000);
        fieldListReverse[27] = new BuyableField("Gammel kongevej", "Grøn", 15, 3200);
        fieldListReverse[28] = new BuyableField("Bülowsvej", "Grøn", 14, 2800);
        fieldListReverse[29] = new Brewery("Tuborg Squash", "Rød", 13, 3000);
        fieldListReverse[30] = new BuyableField("Frederiksberg allé", "Grøn", 12, 2800);
        fieldListReverse[31] = new Prison("I fængsel (På Besøg)", 11);
        fieldListReverse[32] = new BuyableField("Allégade", "Orange", 10, 2000);
        fieldListReverse[33] = new BuyableField("Valby Langgade", "Orange", 9, 2000);
        fieldListReverse[34] = new Chance("Prøv Lykken", 8);
        fieldListReverse[35] = new BuyableField("Roskildevej", "Orange", 7, 2000);
        fieldListReverse[36] = new BuyableField("Helsingør - Helsingborg", "Lyseblå", 6, 4000);
        fieldListReverse[37] = new Tax("Tax", 5, 4000);
        fieldListReverse[38] = new BuyableField("Hvidovre", "Lyseblå", 4, 1200);
        fieldListReverse[39] = new Chance("Prøv Lykken", 3);
        fieldListReverse[40] = new BuyableField("Rødovre", "Lyseblå", 2, 1200);
    }
}
