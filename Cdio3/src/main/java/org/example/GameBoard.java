package org.example;

import gui_fields.GUI_Brewery;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_fields.GUI_Tax;
import java.awt.Color;
//FRONTEND BOARD

//This class is creating a class called "GameBoard" which creates an array of GUI_Field objects
 public class  GameBoard {
     SettingsController CarInfo;
     boolean owned =  false;
     int [] ColorOutline = {0,0,0};

     public GameBoard(GameBoard[] board2) {
         //Add new pictures if time here.
     }
    //This is the Frontend GUI. Here we display pictures & Make the colors of each field. This is most used for visuals, than the actual backend. Backend, is Board. This use GUI as userinterface.
    public static GUI_Field[] makeFields() {
        GUI_Field[] board = new GUI_Field[41];

        //Each field is given a name, a description, and various other properties such as price, starting rent and color.
        int i = 0;

        board[i++] = new GUI_Start("Start", "Modtag: 4000" +i, "Modtag 4000kr,-Når man har passeret start", Color.RED, Color.BLACK);
        board[i++] = new GUI_Street("Rødovrevej", "Pris:  1200kr"+i, "", "Startleje:  50", new Color(135, 206, 235), Color.BLACK);
        board[i++] = new GUI_Chance("?", "Prøv lykken"+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        board[i++] = new GUI_Street("Hvidovrevej", "Pris:  1200kr"+i, "Startleje: 50 ", "50", new Color(135, 206, 235), Color.BLACK);
        board[i++] = new GUI_Tax( "Skattevæsnet", "Betal 4000kr"+i, "eller 10%", new Color(255,255,255), Color.BLACK);
        board[i++] = new GUI_Shipping("default","Helsingørbåden"+i,"Pris 4000kr", "Startleje 500" , "500", new Color(105, 156, 250), Color.BLACK);
        board[i++] = new GUI_Street("Roskildevej", "Pris 2000kr"+i, "Startleje : 100", "100", new Color(255, 127, 0), Color.BLACK);

        board[i++] = new GUI_Tax("| Metro |", ""+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);

        board[i++] = new GUI_Street("Valby Langgade" ,"Pris:  2000kr "  +i, "Startleje 100", "100", new Color(255, 127, 0), Color.BLACK);
        board[i++] = new GUI_Street(" Allégade"+i, "Pris:  2400kr ", "Startleje 100", "100", new Color(255, 127, 0), Color.BLACK);
        board[i++] = new GUI_Jail("default", "på besøg", "På Besøg "+i, "", new Color(255, 255, 255), Color.BLACK);
        board[i++] = new GUI_Street("Frederiksberg Allé", "Pris:2800kr "+i, "Startleje 200", "200", new Color(222,220,73), Color.BLACK);
        board[i++] = new GUI_Brewery("default", "Pris : 3000kr "+i,"Sodavandskæde, flere kan ejes", "Double pris hvis 2 ejet", "100kr",new Color(154,200,134), Color.BLACK);
        board[i++] = new GUI_Street("Bülowsvej", "Pris:  2800kr "+i, "Startleje 200", "200", new Color(222,220,73), Color.BLACK);
        board[i++] = new GUI_Street("Gl. Kongevej", "Pris:  3200kr "+i, "Startleje 250", "250", new Color(222,220,73), Color.BLACK);

        board[i++] = new GUI_Tax("| Metro |", " "+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);

        board[i++] = new GUI_Street("Bernstorffsvej", "Pris:  3600kr "+i, "Startleje 300kr", "300", new Color(128, 128, 128), Color.BLACK);
        board[i++] = new GUI_Chance("?", "Prøv lykken "+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        board[i++] = new GUI_Street("Hellerupvej", "Pris:  3600kr "+i, "Startleje 300kr", "300", new Color(128, 128, 128), Color.BLACK);
        board[i++] = new GUI_Street("Strandvejen", "Pris:  4000kr "+i, "Startleje 350kr", "350", new Color(128, 128, 128), Color.BLACK);
        board[i++] = new GUI_Refuge("default", "Parkering", "Tag en pause "+i, "intet sker", new Color(255, 255, 255), Color.BLACK);
        board[i++] = new GUI_Street("Trianglen", "Pris:  4400kr "+i, "Startleje 350kr", "350", new Color(237, 28, 36), Color.BLACK);
        board[i++] = new GUI_Chance("?", "Prøv lykken "+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        board[i++] = new GUI_Street("Østerbrogade", "Pris:  4400kr "+i, "Startleje 350kr", "350", new Color(237, 28, 36), Color.BLACK);
        board[i++] = new GUI_Street("Grønningen", "Pris : 4800kr "+i, "Startleje 400kr", "400", new Color(237, 28, 36), Color.BLACK);

        board[i++] = new GUI_Tax("| Metro |", " "+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);


        board[i++] = new GUI_Street("Bredgade", "Pris : 5200kr "+i, "Startleje 450kr", "450", new Color(255, 255, 255), Color.BLACK);
        board[i++] = new GUI_Street("Kgs. Nytorv", "Pris : 5200kr "+i, "Startleje 450kr", "450", new Color(255, 255, 255), Color.BLACK);
        board[i++] = new GUI_Brewery("default", "Pris : 3000kr ","Sodavandskæde, flere kan ejes"+i, "Double pris hvis 2 ejet", "100kr", Color.RED, Color.BLACK);
        board[i++] = new GUI_Street("Østergade", "Pris:  5600kr "+i, "Startleje 500kr", "500", new Color(255, 255, 255), Color.BLACK);
        board[i++] = new GUI_Jail("default", "FÆNGSEL", "FÆNGSEL "+i, "På Besøg I fængsel", new Color(125, 125, 125), Color.BLACK);
        board[i++] = new GUI_Street("Amagertorv", "Pris:  6000kr "+i, "Startleje 550kr", "550", new Color(255, 233, 0), Color.BLACK);
        board[i++] = new GUI_Street("Vimmelskaftet", "Pris: 6000kr "+i, "Startleje 550kr", "550", new Color(255, 233, 0), Color.BLACK);
        board[i++] = new GUI_Chance("?", "Prøv lykken "+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        board[i++] = new GUI_Street("Nygade", "Pris: 6400kr "+i, "Startleje 600kr", "600", new Color(255, 233, 0), Color.BLACK);
        board[i++] = new GUI_Shipping("default","Rødby-Båden "+i,"Pris 4000kr", "Startleje 500kr" , "500", new Color(105, 156, 250), Color.BLACK);

        board[i++] = new GUI_Tax("| Metro |", " "+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);

        board[i++] = new GUI_Street("Frederiksberg", "Pris:  7000kr "+i, "Startleje 700kr", "700", new Color(156, 81, 182), Color.BLACK);
        board[i++] = new GUI_Tax( "Statskassen", "Betal 2000kr "+i, "Pris 2000kr", new Color(255,255,255), Color.BLACK);
        board[i++] = new GUI_Street("Rådhuspladsen", "Pris: 8000kr "+i, "Startleje 1000kr", "1000", new Color(156, 81, 182), Color.BLACK);



         return board;
     }
     public static GUI_Field[] reverseField() {
         GUI_Field[] reverseboard = new GUI_Field[41];
         int i = 0;
         reverseboard[i++] = new GUI_Start("Start", "Modtag: 4000 " +i, "Modtag 4000kr,-Når man har passeret start", Color.RED, Color.BLACK);
         reverseboard[i++] = new GUI_Street("Rådhuspladsen", "Pris: 8000kr "+i, "Startleje 1000kr", "1000", new Color(156, 81, 182), Color.BLACK);
         reverseboard[i++] = new GUI_Tax( "Statskassen", "Betal 2000kr "+i, "Pris 2000kr", new Color(255,255,255), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Frederiksberg", "Pris: 7000kr "+i, "Startleje 700", "700", new Color(156, 81, 182), Color.BLACK);
         reverseboard[i++] = new GUI_Tax("| Metro |", " "+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);
         reverseboard[i++] = new GUI_Shipping("default","Rødby-Båden","Pris 4000kr "+i, "Startleje 500kr" , "500", new Color(105, 156, 250), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Nygade", "Pris: 6400kr "+i, "Startleje 600kr", "600", new Color(255, 233, 0), Color.BLACK);
         reverseboard[i++] = new GUI_Chance("?", "Prøv lykken "+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Vimmelskaftet", "Pris: 6000kr "+i, "Startleje 550kr", "550", new Color(255, 233, 0), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Amagertorv", "Pris: 6000kr "+i, "Startleje 550kr", "550", new Color(255, 233, 0), Color.BLACK);
         reverseboard[i++] = new GUI_Jail("default", "FÆNGSEL", "FÆNGSEL "+i, "På Besøg I fængsel", new Color(125, 125, 125), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Østergade", "Pris: 5600kr "+i, "Startleje 500kr", "500", new Color(255, 255, 255), Color.BLACK);
         reverseboard[i++] = new GUI_Brewery("default", "Pris : 3000kr "+i,"Sodavandskæde, flere kan ejes", "Double pris hvis 2 ejet", "100kr", Color.RED, Color.ORANGE);
         reverseboard[i++] = new GUI_Street("Kgs. Nytorv", "Pris : 5200kr "+i, "Startleje 450kr", "450", new Color(255, 255, 255), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Bredgade", "Pris : 5200kr "+i, "Startleje 450kr", "450", new Color(255, 255, 255), Color.BLACK);
         reverseboard[i++] = new GUI_Tax("| Metro |", " "+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);
         reverseboard[i++] = new GUI_Street("Grønningen", "Pris :4800kr "+i, "Startleje 400kr", "400", new Color(237, 28, 36), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Østerbrogade", "Pris: 4400kr "+i, "Startleje 350kr", "350", new Color(237, 28, 36), Color.BLACK);
         reverseboard[i++] = new GUI_Chance("?", "Prøv lykken "+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Trianglen", "Pris: 4400kr "+i, "Startleje 350kr", "350", new Color(237, 28, 36), Color.BLACK);
         reverseboard[i++] = new GUI_Refuge("default", "Parkering", "Tag en pause "+i, "intet sker", new Color(255, 255, 255), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Strandvejen", "Pris: 4000kr "+i, "Startleje 350kr", "350", new Color(128, 128, 128), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Hellerup", "Pris: 3600kr "+i, "Startleje 300kr", "300", new Color(128, 128, 128), Color.BLACK);
         reverseboard[i++] = new GUI_Chance("?", "Prøv lykken "+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Bernstorffsvej", "Pris: 3600kr "+i, "Startleje 300kr", "300", new Color(128, 128, 128), Color.BLACK);
         reverseboard[i++] = new GUI_Tax("| Metro |", " "+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);
         reverseboard[i++] = new GUI_Street("Gl. Kongevej", "Pris: 3200kr "+i, "Startleje 250", "250", new Color(222,220,73), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Bülowsvej", "Pris:  2800kr "+i, "Startleje 200", "200", new Color(222,220,73), Color.BLACK);
         reverseboard[i++] = new GUI_Brewery("default", "Pris : 3000kr "+i,"Sodavandskæde, flere kan ejes", "Double pris hvis 2 ejet", "100kr",new Color(154,200,134), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Frederiksberg Allé", "Pris:2800kr "+i , "Startleje 200", "200", new Color(222,220,73), Color.BLACK);
         reverseboard[i++] = new GUI_Jail("default", "på besøg "+i, "På Besøg", "", new Color(255, 255, 255), Color.BLACK);
         reverseboard[i++] = new GUI_Street(" Allégade", "Pris: 2400kr "+i, "Startleje 100", "100", new Color(255, 127, 0), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Valby Langgade", "Pris: 2000kr "+i, "", "100", new Color(255, 127, 0), Color.BLACK);
         reverseboard[i++] = new GUI_Tax("| Metro |", " "+i, "Du blir rykket til næste metro stop", new Color(0,0,50), Color.WHITE);
         reverseboard[i++] = new GUI_Street("Roskildevej", "Pris 2000kr "+i, "Startleje : 100", "100", new Color(255, 127, 0), Color.BLACK);
         reverseboard[i++] = new GUI_Shipping("default","Helsingørbåden","Pris 4000kr "+i, "Lineart pr båd" , "500", new Color(105, 156, 250), Color.BLACK);
         reverseboard[i++] = new GUI_Tax( "Skattevæsnet", "Betal 4000kr "+i, "eller 10%", new Color(255,255,255), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Hvidovre", "Pris: 1200kr "+i, "Startleje: 50 ", "50", new Color(135, 206, 235), Color.BLACK);
         reverseboard[i++] = new GUI_Chance("?", "Prøv lykken "+i, "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         reverseboard[i++] = new GUI_Street("Rødovre", "Pris:  1200kr "+i, "", "Startleje:  50", new Color(135, 206, 235), Color.BLACK);



         return reverseboard;
     }
    }


