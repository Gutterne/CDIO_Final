package org.example;

import Fields.*;

public class ReverseBoard {
    Field[] fieldListReverse;

    public ReverseBoard() {
        fieldListReverse = new Field[40];
        fieldListReverse[0] = new Start("Start", 1, 4000);
        fieldListReverse[1] = new BuyableField("Rådhuspladsen", "Lilla", 41, 8000,1000,4000,12000,28000,34000,40000);
        fieldListReverse[2] = new Tax("Tax", 2, 2000);
        fieldListReverse[3] = new BuyableField("Frederiksberggade", "Purple", 3, 7000,700,3500,10000,22000,26000,30000);
        fieldListReverse[4] = new Metro("Metro","Sort",4);
        fieldListReverse[5] = new Ferry("Rødby-Puttgarden", "Mørkeblå", 5, 4000,500,1000);
        fieldListReverse[6] = new BuyableField("Nygade", "Gul", 6, 6400,600,3000,9000,20000,24000,28000);
        fieldListReverse[7] = new Chance("Prøv Lykken", 7);
        fieldListReverse[8] = new BuyableField("Vimmelskaftet", "Gul", 8, 6000,550,2600,7800,18000,22000,25000);
        fieldListReverse[9] = new BuyableField("Amagertorv", "Gul", 9, 6000,550,2600,7800,18000,22000,25000);
        fieldListReverse[10] = new Hardprison("FÆNGSEL!", 10);
        fieldListReverse[11] = new BuyableField("Østergade", "Hvid", 12, 5600, 500,2400,7200,17000,20500,24000);
        fieldListReverse[12] = new Brewery("Coca Cola", "Rød", 13, 3000,100,200);
        fieldListReverse[13] = new BuyableField("Kongens Nytorv", "Hvid", 14, 5200, 450,2200,6600,16000,19500,23000);
        fieldListReverse[14] = new BuyableField("Bredgade", "Hvid", 15, 5200,450,2200,6600,16000,19500,23000);
        fieldListReverse[15] = new Metro("Metro","black",16);
        fieldListReverse[16] = new BuyableField("Grønningen", "Rød", 17, 4800,400,2000,6000,15000,18500,22000);
        fieldListReverse[17] = new BuyableField("Østerbrogade", "Rød", 18, 4400,350,1800,5000,14000,17500,21000);
        fieldListReverse[18] = new Chance("Prøv Lykken", 19);
        fieldListReverse[19] = new BuyableField("Trianglen", "Rød", 20, 4400,350,1800,5000,14000,17500,21000);
        fieldListReverse[20] = new Parking("Parkering", "Intet", 21, 0);
        fieldListReverse[21] = new BuyableField("Strandvejen", "Grøn", 22, 4000,350,1600,4400,12000,16000,20000);
        fieldListReverse[22] = new BuyableField("Hellerupvej", "Grå", 23, 3600,300,1400,4000,11000,15000,19000);
        fieldListReverse[23] = new Chance("Chance", 24);
        fieldListReverse[24] = new BuyableField("Bernstorffsvej", "Grå", 25, 3600,300,1400,4000,11000,15000,19000);
        fieldListReverse[25] = new Metro("Metro","black",26);
        fieldListReverse[26] = new BuyableField("Gammel kongevej", "Grøn", 27, 3200,250,1250,3750,10000,14000,18000);
        fieldListReverse[27] = new BuyableField("Bülowsvej", "Grøn", 28, 2800,200,1000,3000,9000,12500,15000);
        fieldListReverse[28] = new Brewery("Tuborg Squash", "Rød", 29, 3000,100,200);
        fieldListReverse[29] = new BuyableField("Frederiksberg allé", "Grøn", 30, 2800,200,1000,3000,9000,12500,15000);
        fieldListReverse[30] = new Prison("I fængsel (På Besøg)", 31);
        fieldListReverse[31] = new BuyableField("Allégade", "Orange", 32, 2000,150,800,2000,6000,9000,12000);
        fieldListReverse[32] = new BuyableField("Valby Langgade", "Orange", 33, 2000,100,600,1800,5400,8000,11000);
        fieldListReverse[33] = new Metro("Metro","black",34);
        fieldListReverse[34] = new BuyableField("Roskildevej", "Orange", 35, 2000,100,600,1800,5400,8000,11000);
        fieldListReverse[35] = new Ferry("Helsingør - Helsingborg", "Lyseblå", 36, 4000,500,1000);
        fieldListReverse[36] = new Tax("Tax", 37, 4000);
        fieldListReverse[37] = new BuyableField("Hvidovre", "Lyseblå", 38, 1200,50,250,400,750,2250,6000);
        fieldListReverse[38] = new Chance("Prøv Lykken", 39);
        fieldListReverse[39] = new BuyableField("Rødovre", "Lyseblå", 40, 1200,50,250,750,2250,4000,6000);
    }


}
