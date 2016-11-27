/*
 * Location Class stores all of the information of a specific location within
 * the map (Map --> Location --> Screen).
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 EXAMPLE OF HOW USER MOVES THROUGH LOCATION, AND SCREEN
 + Location 1
 |    |  Upstairs1  
 |    |  N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)  <- Screen N
 |    |  E IMG_0046.JPG true                              <- Screen E
 |    |  S IMG_0047.JPG false Upstairs2 S(IMG_0052.JPG)   <- Screen S
 |    |  W IMG_0049.JPG true                              <- Screen W

 */
/**
 *
 * @author richj0985, starwarslover1998, and tatad6701
 */
public class Location {

    // Create constant to be used (instance variable)
    private String name;

    // Creates a array of the different screens within the location
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
     * Method used to get the screens direction
     *
     * @param findDirection the direction that it is trying to find within the
     * location
     * @return the direction of the current screen
     */
    public Screen getScreen(String findDirection) {
        // Now loop through the 4 screens/direction for this location
        for (Screen scn : screens) {
            // See if we have a direction match
            if (scn.getDirection().equals(findDirection)) {
                // Finding the image
                return scn;
            }
        }
        // Return nothing if no screen was found
        return null;
    }
}
