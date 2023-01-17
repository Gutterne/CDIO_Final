package org.example;
import jaco.mp3.player.MP3Player;

import java.io.File;

public class Audio extends Thread{
    MP3Player mp3PlayerMusic;
    MP3Player DiceSFX;
    File fileDice;
    File fileMusic;

    public Audio() {
        this.fileMusic = new File("Cdio3/src/main/resources/matador.mp3");
        this.fileDice = new File("Cdio3/src/main/resources/Terning.mp3");
    }
    public void run() {

        try{
            mp3PlayerMusic = new MP3Player(fileMusic);
            mp3PlayerMusic.play();
        }catch (Exception e){
            System.out.print(e);
        }
    }

    public void DiceSound(){
        try{
            DiceSFX = new MP3Player(fileDice);
            DiceSFX.play();


        }catch (Exception e){
            System.out.print(e);
        }

    }
}


