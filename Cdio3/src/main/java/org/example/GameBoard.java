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

 public class  GameBoard {

     public GameBoard(GameBoard[] board2) {
     }


     public static GUI_Field[] makeFields() {
         GUI_Field[] board = new GUI_Field[24];
         int i = 0;
         board[i++] = new GUI_Start("Start", "Modtag: 2", "Modtag 2M,-Når man har passeret start", Color.RED, Color.BLACK);
         board[i++] = new GUI_Street("Gatekjøkkenet", "Pris:  1", "Gatekjøkkenet", "Leje:  1", new Color(101, 67, 33), Color.BLACK);
         board[i++] = new GUI_Street("Pizzahuset", "Pris:  1", "Pizzahuset", "Leje:  1", new Color(101, 67, 33), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Godtebutikken", "Pris:  1", "Godtebutikken", "Leje:  1", new Color(135, 206, 235), Color.BLACK);
         board[i++] = new GUI_Street("Iskiosken", "Pris:  1", "Iskiosken", "Leje:  1", new Color(135, 206, 235), Color.BLACK);
         board[i++] = new GUI_Refuge("default", "På besøg", "På Besøg", "På Besøg", Color.WHITE, Color.BLACK);
         board[i++] = new GUI_Street("Museet", "Pris:  2", "Museet", "Leje:  2", new Color(156, 81, 182), Color.BLACK);
         board[i++] = new GUI_Street("Biblioteket", "Pris:  2", "Biblioteket", "Leje:  2", new Color(156, 81, 182), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Skaterparken", "Pris:  2", "Skaterparken", "Leje:  2", new Color(255, 127, 0), Color.BLACK);
         board[i++] = new GUI_Street("Svømmingpoolen", "Pris:  2", "Svømmingpoolen", "Leje:  2", new Color(255, 127, 0), Color.BLACK);
         board[i++] = new GUI_Refuge("default", "Fri parkering", "Fri Parkering", "Fri Parkering", Color.WHITE, Color.ORANGE);
         board[i++] = new GUI_Street("Spillehallen", "Pris:  3", "Spillehallen", "Leje:  3", new Color(217, 33, 33), Color.BLACK);
         board[i++] = new GUI_Street("Kinoen", "Pris:  3", "Kinoen", "Leje:  3", new Color(217, 33, 33), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Legetøjsbilbutikken", "Pris:  3", "Legetøjsbilbutikken", "Leje:  3", new Color(250, 253, 15), Color.BLACK);
         board[i++] = new GUI_Street("Dyrehandlen", "Pris:  3", "Dyrehandlen", "Leje:  3", new Color(250, 253, 15), Color.BLACK);
         board[i++] = new GUI_Jail("default", "FÆNGSEL", "FÆNGSEL", "På Besøg I fængsel", new Color(125, 125, 125), Color.BLACK);
         board[i++] = new GUI_Street("Bowlinghallen", "Pris:  4", "Bowlinghallen", "Leje:  4", new Color(75, 139, 59), Color.BLACK);
         board[i++] = new GUI_Street("ZoologiskHave", "Pris:  4", "ZoologiskHave", "Leje:  4", new Color(75, 139, 59), Color.BLACK);
         board[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
         board[i++] = new GUI_Street("Vandlandet", "Pris:  4", "Vandlandet", "Leje:  4", new Color(25, 116, 210), Color.BLACK);
         board[i++] = new GUI_Street("Strandpromonadenn", "Pris:  4", "Strandpromonaden", "Leje:  4", new Color(25, 116, 210), Color.BLACK);

         return board;
     }
    }


