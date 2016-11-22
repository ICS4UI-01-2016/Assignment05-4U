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
public class Location {

    private String name;
    private ArrayList<Screen> screens;

    /**
     * Scanner created to pass through the image's information
     *
     * @param input used to read the information concerning the images
     */
    public Location(Scanner input) {
        // Initialize the list of screens for this location
        screens = new ArrayList<>();

        // Read in the location name
        name = input.nextLine();
        // Read in the 4 screens for this location (N,E,S,W)
        for (int i = 0; i < 4; i++) {
            Screen s = new Screen(input);

            // Added the created screen to the list
            screens.add(s);
        }
    }

    /**
     * Method used to return the images current location name
     *
     * @return the current location name concerning the image
     */
    public String getName() {
        // Return the current location name of the image
        return name;
    }

    /**
     * Method used to get the screens direction **********************************
     *
     * @param findDirection string that is used to display
     * @return the direction of the current screen
     */
    public Screen getScreen(String findDirection) {
        // now loop through the 4 screens/direction for this location
        for (Screen scn : screens) {
            // See if we have a direction match
            if (scn.getDirection().equals(findDirection)) {
                // Finding the image
                return scn;
            }
        }
        return null;
    }
}
