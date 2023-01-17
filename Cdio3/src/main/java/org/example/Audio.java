package org.example;
import jaco.mp3.player.MP3Player;

import java.io.File;

public class Audio extends Thread{
    //directory of variables
    MP3Player mp3PlayerMusic;
    MP3Player DiceSFX;

    //Directory of audio files
    File fileDice;
    File fileMusic;
    File filePrøvLykken;
    File fileStart;
    File fileMetro;
    File fileJail;

    //Directory of audio pathnames.
    public Audio() {
        this.fileMusic = new File("Cdio3/src/main/resources/matador.mp3");
        this.fileDice = new File("Cdio3/src/main/resources/Terning.mp3");
        this.fileJail = new File("Cdio3/src/main/resources/Fængsel.mp3");
        this.fileMetro = new File("Cdio3/src/main/resources/Metro.mp3");
        this.filePrøvLykken = new File("Cdio3/src/main/resources/PrøvLykken.mp3");
        this.fileStart = new File("Cdio3/src/main/resources/Start.mp3");

    }

    //running method
    public void run() {

        try{
            mp3PlayerMusic = new MP3Player(fileMusic);
            mp3PlayerMusic.play();
        }catch (Exception e){
            System.out.print(e);
        }
    }
    // all sound-methods used for referencing
    public void DiceSound(){
        try{
            DiceSFX = new MP3Player(fileDice);
            DiceSFX.play();


        }catch (Exception e){
            System.out.print(e);
        }

    }
    public void JailSound(){
        try{
            DiceSFX = new MP3Player(fileJail);
            DiceSFX.play();


        }catch (Exception e){
            System.out.print(e);
        }

    }
    public void MetroSound(){
        try{
            DiceSFX = new MP3Player(fileMetro);
            DiceSFX.play();


        }catch (Exception e){
            System.out.print(e);
        }

    }
    public void ChanceSound(){
        try{
            DiceSFX = new MP3Player(filePrøvLykken);
            DiceSFX.play();


        }catch (Exception e){
            System.out.print(e);
        }

    }
    public void StartSound(){
        try{
            DiceSFX = new MP3Player(fileStart);
            DiceSFX.play();


        }catch (Exception e){
            System.out.print(e);
        }

    }
}



