package org.example;

import Fields.*;
import gui_fields.FieldMouseListener;

//BACKEND BOARD
public class Board {
 Field[] fieldlist;


 public Board() {
  fieldlist = new Field[41];
  fieldlist[0] = new Start("Start", 1, 4000);
  fieldlist[1] = new BuyableField("Rødovre", "Lyseblå", 2, 1200);
  fieldlist[2] = new Chance("Prøv Lykken", 3);
  fieldlist[3] = new BuyableField("Hvidovre", "Lyseblå", 4, 1200);
  fieldlist[4] = new Tax("Tax", 5, 4000);
  fieldlist[5] = new BuyableField("Helsingør - Helsingborg", "Lyseblå", 6, 4000);
  fieldlist[6] = new BuyableField("Roskildevej", "Orange", 7, 2000);
  fieldlist[7] = new Chance("Prøv Lykken", 8);
  fieldlist[8] = new BuyableField("Valby Langgade", "Orange", 9, 2000);
  fieldlist[9] = new BuyableField("Allégade", "Orange", 10, 2000);
  fieldlist[10] = new Prison("I fængsel (På Besøg)", 11);
  fieldlist[11] = new BuyableField("Frederiksberg allé", "Grøn", 12, 2800);
  fieldlist[12] = new Brewery("Tuborg Squash", "Rød", 13, 3000);
  fieldlist[13] = new BuyableField("Bülowsvej", "Grøn", 14, 2800);
  fieldlist[14] = new BuyableField("Gammel kongevej", "Grøn", 15, 3200);
  fieldlist[15] = new BuyableField("Mols-linjen", "Mørkeblå", 16, 4000);
  fieldlist[16] = new BuyableField("Bernstorffsvej", "Grå", 17, 3600);
  fieldlist[17] = new Chance("Chance", 18);
  fieldlist[18] = new BuyableField("Hellerupvej", "Grå", 19, 3600);
  fieldlist[19] = new BuyableField("Strandvejen", "Grøn", 20, 4000);
  fieldlist[20] = new Parking("Parkering", "Intet", 21, 0);
  fieldlist[21] = new BuyableField("Trianglen", "Rød", 22, 4400);
  fieldlist[22] = new Chance("Prøv Lykken", 23);
  fieldlist[23] = new BuyableField("Østerbrogade", "Rød", 24, 4400);
  fieldlist[24] = new BuyableField("Grønningen", "Rød", 25, 4800);
  fieldlist[25] = new BuyableField("Gedser - Rostock", "Mørkeblå", 26, 4000);
  fieldlist[26] = new BuyableField("Bredgade", "Hvid", 27, 5200);
  fieldlist[27] = new BuyableField("Kongens Nytorv", "Hvid", 28, 5200);
  fieldlist[28] = new Brewery("Coca Cola", "Rød", 29, 3000);
  fieldlist[29] = new BuyableField("Østergade", "Hvid", 30, 5600);
  fieldlist[30] = new Chance("Prøv Lykken", 31);
  fieldlist[31] = new BuyableField("Amagertorv", "Gul", 32, 6000);
  fieldlist[32] = new Hardprison("FÆNGSEL!", 33);
  fieldlist[33] = new BuyableField("Vimmelskaftet", "Gul", 34, 6000);
  fieldlist[34] = new Chance("Prøv Lykken", 35);
  fieldlist[35] = new BuyableField("Nygade", "Gul", 36, 6400);
  fieldlist[36] = new BuyableField("Rødby-Puttgarden", "Mørkeblå", 37, 4000);
  fieldlist[37] = new Chance("Prøv Lykken", 38);
  fieldlist[38] = new BuyableField("Frederiksberggade", "Purple", 39, 7000);
  fieldlist[39] = new Tax("Tax", 40, 2000);
  fieldlist[40] = new BuyableField("Rådhuspladsen", "Lilla", 41, 8000);


 }



}