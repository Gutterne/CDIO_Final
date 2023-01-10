package org.example;

import Fields.BuyableField;
import gui_fields.*;
import gui_fields.GUI_Ownable;
import java.awt.Color;

 public class  GameBoard {
     BuyableField buyableField;
     static Color carColor;
     int[] ColorOutline = {0, 0, 0};

     public GameBoard(GameBoard[] board2) {

         //Add new pictures if time here.
     }


     //This is the Frontend GUI. Here we display pictures & Make the colors of each field. This is most used for visuals, than the actual backend. Backend, is Board. This use GUI as userinterface.
     public static GUI_Field[] makeFields() {
         GUI_Field[] board = new GUI_Field[41];
         int i = 0;

         board[i++] = new GUI_Start("Start", "Modtag: 4000", "Modtag 4000kr,-Når man har passeret start", Color.RED, Color.BLACK);
         board[i++] = new GUI_Street("Rødovrevej", "Pris:  1200kr", "", "Startleje:  50", new Color(135, 206, 235), carColor);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Hvidovre", "Pris:  1200kr", "Startleje: 50 ", "50", new Color(135, 206, 235), carColor);
         board[i++] = new GUI_Tax("Skattevæsnet", "Betal 4000kr", "eller 10%", new Color(255, 255, 255), Color.BLACK);
         board[i++] = new GUI_Shipping("default", "Helsingørbåden", "Pris 4000kr", "Lineart pr båd", "500", new Color(105, 156, 250), carColor);
         board[i++] = new GUI_Street("Roskildevej", "Pris 2000kr", "Startleje : 100", "100", new Color(255, 127, 0), carColor);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Valby Langgade", "Pris:  2000kr", "", "100", new Color(255, 127, 0), Color.BLACK);
         board[i++] = new GUI_Street(" Allégade", "Pris:  2400kr", "Startleje 100", "100", new Color(255, 127, 0), Color.BLACK);
         board[i++] = new GUI_Jail("default", "på besøg", "På Besøg", "", new Color(255, 255, 255), Color.BLACK);
         board[i++] = new GUI_Street("Frederiksberg Allé", "Pris:  ", "Startleje 200", "200", new Color(222, 220, 73), Color.BLACK);
         board[i++] = new GUI_Brewery("default", "Pris : 3000kr", "Sodavandskæde, flere kan ejes", "Double pris hvis 2 ejet", "100kr", new Color(154, 200, 134), Color.BLACK);
         board[i++] = new GUI_Street("Bülowsvej", "Pris:  2800kr", "Startleje 200", "200", new Color(222, 220, 73), Color.BLACK);
         board[i++] = new GUI_Street("Gl. Kongevej", "Pris:  3200kr", "Startleje 250", "250", new Color(222, 220, 73), Color.BLACK);
         board[i++] = new GUI_Shipping("default", "Molslinjen", "Pris 4000kr", "Lineart pr båd", "500", new Color(255, 50, 5), Color.BLACK);
         board[i++] = new GUI_Street("Bernstorffsvej", "Pris:  3600kr", "", "300", new Color(128, 128, 128), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Hellerup", "Pris:  3600kr", "", "300", new Color(128, 128, 128), Color.BLACK);
         board[i++] = new GUI_Street("Strandvejen", "Pris:  4000kr", "", "350", new Color(128, 128, 128), Color.BLACK);
         board[i++] = new GUI_Refuge("default", "Parkering", "Tag en pause ", "intet sker", new Color(255, 255, 255), Color.BLACK);

         board[i++] = new GUI_Street("Trianglen", "Pris:  4400kr", "", "350", new Color(237, 28, 36), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Østerbrogade", "Pris:  4400kr", "", "350", new Color(237, 28, 36), Color.BLACK);
         board[i++] = new GUI_Street("Grønningen", "Pris : 4800kr", "", "400", new Color(237, 28, 36), Color.BLACK);
         board[i++] = new GUI_Shipping("default", "Gedser-båden", "Pris 4000kr", "Lineart pr båd", "500", new Color(105, 156, 250), Color.BLACK);
         board[i++] = new GUI_Street("Bredgade", "Pris : 5200kr", "", "450", new Color(255, 255, 255), Color.BLACK);
         board[i++] = new GUI_Street("Kgs. Nytorv", "Pris : 5200kr", "", "450", new Color(255, 255, 255), Color.BLACK);
         board[i++] = new GUI_Brewery("default", "Pris : 3000kr", "Sodavandskæde, flere kan ejes", "Double pris hvis 2 ejet", "100kr", Color.RED, Color.ORANGE);
         board[i++] = new GUI_Street("Østergade", "Pris:  5600kr", "Bowlinghallen", "500", new Color(255, 255, 255), Color.BLACK);
         board[i++] = new GUI_Jail("default", "FÆNGSEL", "FÆNGSEL", "På Besøg I fængsel", new Color(125, 125, 125), Color.BLACK);
         board[i++] = new GUI_Street("Amagertorv", "Pris:  6000kr", "", "550", new Color(255, 233, 0), Color.BLACK);
         board[i++] = new GUI_Street("Vimmelskaftet", "Pris: 6000kr", "", "550", new Color(255, 233, 0), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Nygade", "Pris: 6400kr", "", "600", new Color(255, 233, 0), Color.BLACK);
         board[i++] = new GUI_Shipping("default", "Helsingørbåden", "Pris 4000kr", "Lineart pr båd", "500", new Color(105, 156, 250), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Frederiksberg", "Pris:  7000kr", "", "700", new Color(156, 81, 182), Color.BLACK);
         board[i++] = new GUI_Tax("Statskassen", "Betal 2000kr", "Pris 2000kr", new Color(255, 255, 255), Color.BLACK);
         board[i++] = new GUI_Street("Rådhuspladsen", "Pris: 8000kr", "Dommedaghuset", "1000", new Color(156, 81, 182), Color.BLACK);

         return board;
     }

     private static void visualOwnerShip(BuyableField buyableField) {

         GUI_Field test = null;
         GUI_Ownable o = (GUI_Ownable) test;


         if (buyableField.isOwned() == false) {
             carColor = Color.black;
         } else if (buyableField.isOwned() == true) {
             carColor = Color.getColor(String.valueOf(Color.RED));
         }



             //o.setBorder(player721.getPrimaryColor(), player721.getSecondaryColor());

         }
     }

 





