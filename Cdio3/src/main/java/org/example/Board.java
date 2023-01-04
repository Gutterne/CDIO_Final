package org.example;

import Fields.*;


public class Board {
  Field[] fieldlist;
 public Board(){
   fieldlist = new Field[24];
  fieldlist[0]= new Start("Start",1,4000);
  fieldlist[1]= new BuyableField("Rødovre","Lyseblå",2,1200);
  fieldlist[2]= new Chance("Prøv Lykken",3);
  fieldlist[3]= new BuyableField("Hvidovre","Lyseblå",4,1200);
  fieldlist[4]= new Tax("Tax",5,4000);
  fieldlist[5]= new BuyableField("","Lyseblå",6,1);
  fieldlist[6]= new BuyableField("Roskildevej","Orange",7,2000);
  fieldlist[7]= new Chance("Prøv Lykken",8);
  fieldlist[8]= new BuyableField("Valby Langgade","Orange",9,2000);
  fieldlist[9]= new BuyableField("Allégade","Orange",10,2000);
  fieldlist[10]= new Prison("I fængsel (På Besøg)",11);
  fieldlist[11]= new BuyableField("Frederiksberg allé","Grøn",12,2800);
  fieldlist[12]= new Brewery("Tuborg Squash","Rød",13,3000);
  fieldlist[13]= new BuyableField("Bülowsvej","Grøn",14,2800);
   fieldlist[14]= new BuyableField("Gammel kongevej","Grøn",15,3200);
  fieldlist[15]= new Chance("Chance",16);
  fieldlist[16]= new BuyableField("Legetøjsbutikken","Grøn",17,3);
  fieldlist[17]= new BuyableField("Dyrehandlen","Gul",18,3);
  fieldlist[18]= new Prison("Fængsel",19);
  fieldlist[19]= new BuyableField("Bowlinghallen","Grøn",20,4);
  fieldlist[20]= new BuyableField("Zoologisk Have","Grøn",21,4);
  fieldlist[21]= new Chance("Chance",22);
  fieldlist[22]= new BuyableField("Lalandia","Blå",23,4);
  fieldlist[23]= new BuyableField("Strandpromenaden","Blå",24,4);

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
