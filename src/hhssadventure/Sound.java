///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package hhssadventure;
//
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.Clip;
//
///**
// *
// * @author tatad6701
// */
//public class Sound {
//
//    private Clip sound;
//
//    public Sound(String name) {
//        try {
//            // Allows for the audio clip (the song) to be passed through into the game
//            AudioInputStream in = AudioSystem.getAudioInputStream(new file(name));
//            sound = AudioSystem.getClip();
//            sound.open(in);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void play() {
//        new Thread(new Runnable() {
//            public void run() {
//                // Starts the sound (audio file) to be played for the enjoyment of the player ;)
//            }
//        }
//    
//    }
//}
