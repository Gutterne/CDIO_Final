package org.example;

import Fields.*;
import gui_fields.FieldMouseListener;


//BACKEND BOARD
public class Board {
  Field[] fieldlist;
 public Board(){
  fieldlist = new Field[44];
  fieldlist[0]= new Start("Start",1,4000);
  fieldlist[1]= new BuyableField("Rødovrevej","Lyseblå",2,
          1200,50,250,750,2250,4000,6000);
  fieldlist[2]= new Chance("Prøv Lykken",3);
  fieldlist[3]= new BuyableField("Hvidovre","Lyseblå",4,1200,
          50,250,400,750,2250,6000);
  fieldlist[4]= new Tax("Tax",5,4000);
  fieldlist[5]= new Metro("DSB","Sort",6);
  fieldlist[6]= new Ferry("Helsingør - Helsingborg","Lyseblå",7,4000,500,1000,2000,4000);
  fieldlist[7]= new BuyableField("Roskildevej","Orange",8,2000,
          100,600,1800,5400,8000,11000);
  fieldlist[8]= new Chance("Prøv Lykken",9);
  fieldlist[9]= new BuyableField("Valby Langgade","Orange",10,2000,
          100,600,1800,5400,8000,11000);
  fieldlist[10]= new BuyableField("Allégade","Orange",11,2000,
          150,800,2000,6000,9000,12000);
  fieldlist[11]= new Prison("I fængsel (På Besøg)",12);
  fieldlist[12]= new BuyableField("Frederiksberg allé","Grøn",13,2800,
          200,1000,3000,9000,12500,15000);
  fieldlist[13]= new Brewery("Tuborg Squash","Rød",14,3000,100,200);
  fieldlist[14]= new BuyableField("Bülowsvej","Grøn",15,2800,
          200,1000,3000,9000,12500,15000);
  fieldlist[15]= new BuyableField("Gammel kongevej","Grøn",16,3200,
          250,1250,3750,10000,14000,18000);
  fieldlist[16]= new Metro("DSB","Sort",17);
  fieldlist[17]= new Ferry("Mols-linjen","Mørkeblå",18,4000,500,1000,2000,4000);
  fieldlist[18]= new BuyableField("Bernstorffsvej","Grå",19,3600,
          300,1400,4000,11000,15000,19000);
  fieldlist[19]= new Chance("Chance",20);
  fieldlist[20]= new BuyableField("Hellerupvej","Grå",21,3600,
          300,1400,4000,11000,15000,19000);
  fieldlist[21]= new BuyableField("Strandvejen","Grøn",22,4000,
          350,1600,4400,12000,16000,20000);
  fieldlist[22]= new Parking("Parkering","Intet",23,0);
  fieldlist[23]= new BuyableField("Trianglen","Rød",24,4400,
          350,1800,5000,14000,17500,21000);
  fieldlist[24]= new Chance("Prøv Lykken",25);
  fieldlist[25]= new BuyableField("Østerbrogade","Rød",26,4400,
          350,1800,5000,14000,17500,21000);
  fieldlist[26]= new BuyableField("Grønningen","Rød",27,4800,
          400,2000,6000,15000,18500,22000);
  fieldlist[27]= new Metro("DSB","Sort",28);
  fieldlist[28]= new Ferry("Gedser - Rostock","Mørkeblå",29,
          4000,500,1000,2000,4000);
  fieldlist[29]= new BuyableField("Bredgade","Hvid",30,5200,
          450,2200,6600,16000,19500,23000);
  fieldlist[30]= new BuyableField("Kongens Nytorv","Hvid",31,5200,
          450,2200,6600,16000,19500,23000);
  fieldlist[31]= new Brewery("Coca Cola","Rød",32,3000,100,200);
  fieldlist[32]= new BuyableField("Østergade","Hvid",33,5600,
          500,2400,7200,17000,20500,24000);
  fieldlist[33]= new Hardprison("FÆNGSEL!",34);
  fieldlist[34]= new BuyableField("Amagertorv","Gul",35,6000,
          550,2600,7800,18000,22000,25000);
  fieldlist[35]= new BuyableField("Vimmelskaftet","Gul",36,6000,
          550,2600,7800,18000,22000,25000);
  fieldlist[36]= new Chance("Prøv Lykken",37);
  fieldlist[37]= new BuyableField("Nygade","Gul",38,6400,
          600,3000,9000,20000,24000,28000);
  fieldlist[38]= new Metro("DSB","Sort",39);
  fieldlist[39]= new Ferry("Rødby-Puttgarden","Mørkeblå",40,
          4000,500,1000,2000,4000);
  fieldlist[40]= new Chance("Prøv Lykken",41);
  fieldlist[41]= new BuyableField("Frederiksberggade","Purple",42,7000,
          700,3500,10000,22000,26000,30000);
  fieldlist[42]= new Tax("Tax",43,2000);
  fieldlist[43]= new BuyableField("Rådhuspladsen","Lilla",44,8000,
          1000,4000,12000,28000,34000,40000);





 }
/*

   fieldlist = new Field[24];
  fieldlist[0]= new Start("Start",1,4000);
  fieldlist[1]= new BuyableField("Rødovre","Lyseblå",2,1200);
  fieldlist[2]= new BuyableField("H","Brun",3,1);
  fieldlist[3]= new Chance("Chance",4);
  fieldlist[4]= new BuyableField("Godtebutikken","Lyseblå",5,1);
  fieldlist[5]= new BuyableField("Iskiosken","Lyseblå",6,1);
  fieldlist[6]= new Visitation("På Besøg",7);
  fieldlist[7]= new BuyableField("Museet","Lilla",8,2);
  fieldlist[8]= new BuyableField("Biblioteket","Lilla",9,2);
  fieldlist[9]= new Chance("Chance",10);
  fieldlist[10]= new BuyableField("Skaterparken","Orange",11,2);
  fieldlist[11]= new BuyableField("Svømmingpool","Orange",12,2);
  fieldlist[12]= new Visitation("Fri Parkering",13);
  fieldlist[13]= new BuyableField("Spillehallen","Rød",14,3);
  fieldlist[14]= new BuyableField("Kinoen","Rød",15,3);
  fieldlist[15]= new Chance("Chance",16);
  fieldlist[16]= new BuyableField("Legetøjsbutikken","Gul",17,3);
  fieldlist[17]= new BuyableField("Dyrehandlen","Gul",18,3);
  fieldlist[18]= new Prison("Fængsel",19);
  fieldlist[19]= new BuyableField("Bowlinghallen","Grøn",20,4);
  fieldlist[20]= new BuyableField("Zoologisk Have","Grøn",21,4);
  fieldlist[21]= new Chance("Chance",22);
  fieldlist[22]= new BuyableField("Lalandia","Blå",23,4);
  fieldlist[23]= new BuyableField("Strandpromenaden","Blå",24,4);

 */

}
