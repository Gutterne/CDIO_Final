package org.example;

import Fields.*;


public class Board {
  Field[] fieldlist;
 public Board(){
  fieldlist = new Field[24];
  fieldlist[0]= new Start("Start",1,2);
  fieldlist[1]= new BuyableField("Gatekjønnet","Brun",2,1);
  fieldlist[2]= new BuyableField("Pizzahuset","Brun",3,1);
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

}


}
