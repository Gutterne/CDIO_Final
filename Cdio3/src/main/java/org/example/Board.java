package org.example;

import Fields.*;
import Fields.Metro.Metro;
import Fields.Metro.ReverseMetro;


//BACKEND BOARD

//this class, defines all the properties and actions the matador board has.
public class Board {
 // Arrays of fields in reverse and normal order
 Field[] fieldListReverse;
  Field[] fieldlist;
 // Constructor
 public Board(){
  // Initializing fields on the board in a specific order
  fieldlist = new Field[40];
  fieldlist[0]= new Start("Start",1,4000);
  fieldlist[1]= new BuyableField("Rødovrevej","Lyseblå",2,
          1200,50,250,750,2250,4000,6000);
  fieldlist[2]= new Chance("Prøv Lykken",3);
  fieldlist[3]= new BuyableField("Hvidovrevej","Lyseblå",4,1200,
          50,250,400,750,2250,6000);
  fieldlist[4]= new Tax("Tax",5,4000);
  fieldlist[5]= new Ferry("Helsingør - Helsingborg","Lyseblå",6,4000,500,1000);
  fieldlist[6]= new BuyableField("Roskildevej","Orange",7,2000,
          100,600,1800,5400,8000,11000);
  fieldlist[7]= new Metro("Metro","black",8);
  fieldlist[8]= new BuyableField("Valby Langgade","Orange",9,2000,
          100,600,1800,5400,8000,11000);
  fieldlist[9]= new BuyableField("Allégade","Orange",10,2400,
          150,800,2000,6000,9000,12000);
  fieldlist[10]= new Prison("I fængsel (På Besøg)",11);
  fieldlist[11]= new BuyableField("Frederiksberg allé","Grøn",12,2800,
          200,1000,3000,9000,12500,15000);
  fieldlist[12]= new Brewery("Tuborg Squash","Rød",13,3000,100,200);
  fieldlist[13]= new BuyableField("Bülowsvej","Grøn",14,2800,
          200,1000,3000,9000,12500,15000);
  fieldlist[14]= new BuyableField("Gammel kongevej","Grøn",15,3200,
          250,1250,3750,10000,14000,18000);
  fieldlist[15]= new Metro("Metro","black",16);
  fieldlist[16]= new BuyableField("Bernstorffsvej","Grå",17,3600,
          300,1400,4000,11000,15000,19000);
  fieldlist[17]= new Chance("Prøv Lykken",18);
  fieldlist[18]= new BuyableField("Hellerupvej","Grå",19,3600,
          300,1400,4000,11000,15000,19000);
  fieldlist[19]= new BuyableField("Strandvejen","Grøn",20,4000,
          350,1600,4400,12000,16000,20000);
  fieldlist[20]= new Parking("Parkering","Intet",21,0);
  fieldlist[21]= new BuyableField("Trianglen","Rød",22,4400,
          350,1800,5000,14000,17500,21000);
  fieldlist[22]= new Chance("Prøv Lykken",23);
  fieldlist[23]= new BuyableField("Østerbrogade","Rød",24,4400,
          350,1800,5000,14000,17500,21000);
  fieldlist[24]= new BuyableField("Grønningen","Rød",25,4800,
          400,2000,6000,15000,18500,22000);
  fieldlist[25]= new Metro("Metro","black",26);
  fieldlist[26]= new BuyableField("Bredgade","Hvid",27,5200,
          450,2200,6600,16000,19500,23000);
  fieldlist[27]= new BuyableField("Kongens Nytorv","Hvid",28,5200,
          450,2200,6600,16000,19500,23000);
  fieldlist[28]= new Brewery("Coca Cola","Rød",29,3000,100,200);
  fieldlist[29]= new BuyableField("Østergade","Hvid",30,5600,
          500,2400,7200,17000,20500,24000);
  fieldlist[30]= new Hardprison("FÆNGSEL!",31);
  fieldlist[31]= new BuyableField("Amagertorv","Gul",32,6000,
          550,2600,7800,18000,22000,25000);
  fieldlist[32]= new BuyableField("Vimmelskaftet","Gul",33,6000,
          550,2600,7800,18000,22000,25000);
  fieldlist[33]= new Chance("Prøv Lykken",34);
  fieldlist[34]= new BuyableField("Nygade","Gul",35,6400,
          600,3000,9000,20000,24000,28000);
  fieldlist[35]= new Ferry("Rødby - Puttgarden","Mørkeblå",36,4000,500,1000);
  fieldlist[36]= new Metro("Metro","Sort",37);
  fieldlist[37]= new BuyableField("Frederiksberggade","Lilla",38,7000,
          700,3500,10000,22000,26000,30000);
  fieldlist[38]= new LesserTax("Tax",39,2000);
  fieldlist[39]= new BuyableField("Rådhuspladsen","Lilla",40,8000,
          1000,4000,12000,28000,34000,40000);



  fieldListReverse = new Field[40];
  fieldListReverse[0] = new Start("Start", 1, 4000);
  fieldListReverse[1] = new BuyableField("Rådhuspladsen", "Lilla", 41, 8000,1000,4000,12000,28000,34000,40000);
  fieldListReverse[2] = new Tax("Tax", 2, 2000);
  fieldListReverse[3] = new BuyableField("Frederiksberggade", "Purple", 3, 7000,700,3500,10000,22000,26000,30000);
  fieldListReverse[4] = new ReverseMetro("Metro","Sort",4);
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
  fieldListReverse[15] = new ReverseMetro("Metro","black",16);
  fieldListReverse[16] = new BuyableField("Grønningen", "Rød", 17, 4800,400,2000,6000,15000,18500,22000);
  fieldListReverse[17] = new BuyableField("Østerbrogade", "Rød", 18, 4400,350,1800,5000,14000,17500,21000);
  fieldListReverse[18] = new Chance("Prøv Lykken", 19);
  fieldListReverse[19] = new BuyableField("Trianglen", "Rød", 20, 4400,350,1800,5000,14000,17500,21000);
  fieldListReverse[20] = new Parking("Parkering", "Intet", 21, 0);
  fieldListReverse[21] = new BuyableField("Strandvejen", "Grøn", 22, 4000,350,1600,4400,12000,16000,20000);
  fieldListReverse[22] = new BuyableField("Hellerupvej", "Grå", 23, 3600,300,1400,4000,11000,15000,19000);
  fieldListReverse[23] = new Chance("Chance", 24);
  fieldListReverse[24] = new BuyableField("Bernstorffsvej", "Grå", 25, 3600,300,1400,4000,11000,15000,19000);
  fieldListReverse[25] = new ReverseMetro("Metro","black",26);
  fieldListReverse[26] = new BuyableField("Gammel kongevej", "Grøn", 27, 3200,250,1250,3750,10000,14000,18000);
  fieldListReverse[27] = new BuyableField("Bülowsvej", "Grøn", 28, 2800,200,1000,3000,9000,12500,15000);
  fieldListReverse[28] = new Brewery("Tuborg Squash", "Rød", 29, 3000,100,200);
  fieldListReverse[29] = new BuyableField("Frederiksberg allé", "Grøn", 30, 2800,200,1000,3000,9000,12500,15000);
  fieldListReverse[30] = new Prison("I fængsel (På Besøg)", 31);
  fieldListReverse[31] = new BuyableField("Allégade", "Orange", 32, 2000,150,800,2000,6000,9000,12000);
  fieldListReverse[32] = new BuyableField("Valby Langgade", "Orange", 33, 2000,100,600,1800,5400,8000,11000);
  fieldListReverse[33] = new ReverseMetro("Metro","black",34);
  fieldListReverse[34] = new BuyableField("Roskildevej", "Orange", 35, 2000,100,600,1800,5400,8000,11000);
  fieldListReverse[35] = new Ferry("Helsingør - Helsingborg", "Lyseblå", 36, 4000,500,1000);
  fieldListReverse[36] = new Tax("Tax", 37, 4000);
  fieldListReverse[37] = new BuyableField("Hvidovre", "Lyseblå", 38, 1200,50,250,400,750,2250,6000);
  fieldListReverse[38] = new Chance("Prøv Lykken", 39);
  fieldListReverse[39] = new BuyableField("Rødovre", "Lyseblå", 40, 1200,50,250,750,2250,4000,6000);





 }
}
