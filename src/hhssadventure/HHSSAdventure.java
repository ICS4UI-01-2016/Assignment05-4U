/*
 * HHSSAdventure class allows for the entire game to essentially run. This involves
 * creating an interface (GUI), showing the interface, creating the map and using the images
 * from the "images/pics.txt", creating a controller to connect with the GUI and map, and lastly
 * creating a new sound to allow for the music to play and loop as the user is playing the game!
 */
package hhssadventure;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the interface
        GUI gui = new GUI();

        // Show the interface
        gui.setVisible(true);

        // Create the map and grab the images from the "images/pics.txt" file
        Map map = new Map("images/pics.txt");

        // Create the game controller and connect it to both the GUI and the map
        Controller c = new Controller(gui, map);

        // Creating new sound (Used to grab the audio file we have)
        Sound music = new Sound("IHF-Departure.mp3");
        // Set the music to play in a loop 
        music.setLoop(true);
        // Play the music!
        music.play();
    }
}
