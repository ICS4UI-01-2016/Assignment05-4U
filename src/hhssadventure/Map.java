/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author richj0985
 */
public class Map {

    private ArrayList<Screen> screens;

    public Map(String fileName) {
        // Initialize the list
        screens = new ArrayList<>();
        try {
            // Make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            // Make screens
            // Loop to the end of the file
            while (input.hasNext()) {
                // Creating a screen from the scanner
                Screen s = new Screen(input);
                // Added the created screen to the list
                screens.add(s);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Screen getScreen(int location, int direction) {
        // Go through each screen 
        for (Screen s : screens) {
            // See if the row and col match
            if (s.getLocation() == location && s.getDirection() == direction) {
                // Finding the image
                return s;
            }
        }
        // No screen found
        return null;
    }
}
