package org.example;

import Fields.*;
import gui_fields.FieldMouseListener;


//BACKEND BOARD
//contains CDIO Final assignment information from Materials>fields.csv
public class Board {
  Field[] fieldlist;
 public Board(){
   fieldlist = new Field[41];
  fieldlist[0]= new Start("Start",1,4000);
  fieldlist[1]= new BuyableField("Rødovrevej","Lyseblå",2,
          1200,50,250,750,2250,4000,6000);
  fieldlist[2]= new Chance("Prøv Lykken",3);
  fieldlist[3]= new BuyableField("Hvidovre","Lyseblå",4,1200,
          50,250,400,750,2250,6000);
  fieldlist[4]= new Tax("Tax",5,4000);
  fieldlist[5]= new Ferry("Helsingør - Helsingborg","Lyseblå",6,4000,500,1000,2000,4000);
  fieldlist[6]= new BuyableField("Roskildevej","Orange",7,2000,
          100,600,1800,5400,8000,11000);
  fieldlist[7]= new Chance("Prøv Lykken",8);
  fieldlist[8]= new BuyableField("Valby Langgade","Orange",9,2000,
          100,600,1800,5400,8000,11000);
  fieldlist[9]= new BuyableField("Allégade","Orange",10,2000,
          150,800,2000,6000,9000,12000);
  fieldlist[10]= new Prison("I fængsel (På Besøg)",11);
  fieldlist[11]= new BuyableField("Frederiksberg allé","Grøn",12,2800,
          200,1000,3000,9000,12500,15000);
  fieldlist[12]= new Brewery("Tuborg Squash","Rød",13,3000,100,200);
  fieldlist[13]= new BuyableField("Bülowsvej","Grøn",14,2800,
          200,1000,3000,9000,12500,15000);
  fieldlist[14]= new BuyableField("Gammel kongevej","Grøn",15,3200,
          250,1250,3750,10000,14000,18000);
  fieldlist[15]= new Ferry("Mols-linjen","Mørkeblå",16,4000,500,1000,2000,4000);
  fieldlist[16]= new BuyableField("Bernstorffsvej","Grå",17,3600,
          300,1400,4000,11000,15000,19000);
  fieldlist[17]= new Chance("Chance",18);
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
  fieldlist[25]= new Ferry("Gedser - Rostock","Mørkeblå",26,
          4000,500,1000,2000,4000);
  fieldlist[26]= new BuyableField("Bredgade","Hvid",27,5200,
          450,2200,6600,16000,19500,23000);
  fieldlist[27]= new BuyableField("Kongens Nytorv","Hvid",28,5200,
          450,2200,6600,16000,19500,23000);
  fieldlist[28]= new Brewery("Coca Cola","Rød",29,3000,100,200);
  fieldlist[29]= new BuyableField("Østergade","Hvid",30,5600,
          500,2400,7200,17000,20500,24000);
  fieldlist[30]= new Chance("Prøv Lykken",31);
  fieldlist[31]= new BuyableField("Amagertorv","Gul",32,6000,
          550,2600,7800,18000,22000,25000);
  fieldlist[32]= new Hardprison("FÆNGSEL!",33);
  fieldlist[33]= new BuyableField("Vimmelskaftet","Gul",34,6000,
          550,2600,7800,18000,22000,25000);
  fieldlist[34]= new Chance("Prøv Lykken",35);
  fieldlist[35]= new BuyableField("Nygade","Gul",36,6400,
          600,3000,9000,20000,24000,28000);
  fieldlist[36]= new Ferry("Rødby-Puttgarden","Mørkeblå",37,
          4000,500,1000,2000,4000);
  fieldlist[37]= new Chance("Prøv Lykken",38);
  fieldlist[38]= new BuyableField("Frederiksberggade","Purple",39,7000,
          700,3500,10000,22000,26000,30000);
  fieldlist[39]= new Tax("Tax",40,2000);
  fieldlist[40]= new BuyableField("Rådhuspladsen","Lilla",41,8000,
          1000,4000,12000,28000,34000,40000);
 }
}
