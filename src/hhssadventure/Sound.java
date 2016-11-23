/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author tatad6701
 */
public class Sound {

    private Clip sound;

    public Sound(String name) {
        try {
            // Allows for the audio clip (the song) to be passed through into the game
            AudioInputStream in = AudioSystem.getAudioInputStream(new File(name));
            sound = AudioSystem.getClip();
            sound.open(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        new Thread(new Runnable() {
            public void run() {
                // Starts the sound (audio file) to be played for the enjoyment of the player ;)
                sound.setFramePosition(0);
                sound.start();
            }
        }).start();
    }

    public void stop() {
        // Stops the sound (audio file)
        sound.stop();
        sound.setFramePosition(0);
    }

    public void loop() {
        new Thread(new Runnable() {
            public void run() {
                // Makes the song loop while game is open
                sound.setFramePosition(0);
                sound.loop(Clip.LOOP_CONTINUOUSLY);
            }
        }).start();
    }
}
