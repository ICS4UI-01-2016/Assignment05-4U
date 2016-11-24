/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import jaco.mp3.player.MP3Player;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author tatad6701
 */
public class Sound {

    // Create constant to be used
    private MP3Player sound;

    /**
     * Constructor for the sound (audio file)
     *
     * @param name the name of the rack to be used
     */
    public Sound(String name) {
        try {
            // Allows for the audio clip (the song) to be passed through into the game
            sound = new MP3Player(new File(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that plays the audio file
     */
    public void play() {
        sound.play();
    }

    /**
     * Method that stops the audio file
     */
    public void stop() {
        // Stops the sound (audio file)
        sound.stop();

    }

    /**
     * Method that has the song to loop
     *
     * @param loop repeats the song in a loop
     */
    public void setLoop(boolean loop) {
        sound.setRepeat(loop);
    }
}
