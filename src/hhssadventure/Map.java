/*
 * Map Class stores all of the information of the total map within
 * the text file (Map --> Location --> Screen).
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/*
 EXAMPLE OF HOW USER MOVES THROUGH MAP, LOCATION, AND SCREEN
 +--Map
 |    + Location 1
 |    |  Upstairs1  
 |    |  N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)  <- Screen N
 |    |  E IMG_0046.JPG true                              <- Screen E
 |    |  S IMG_0047.JPG false Upstairs2 S(IMG_0052.JPG)   <- Screen S
 |    |  W IMG_0049.JPG true                              <- Screen W
 |    + Location 2
 |    |  Upstairs1  
 |    |  N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)  <- Screen N
 |    |  E IMG_0046.JPG true                              <- Screen E
 |    |  S IMG_0047.JPG false Upstairs2 S(IMG_0052.JPG)   <- Screen S
 |    |  W IMG_0049.JPG true                              <- Screen W
 |    + Location 3
 |    |  Upstairs1  
 |    |  N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)  <- Screen N
 |    |  E IMG_0046.JPG true                              <- Screen E
 |    |  S IMG_0047.JPG false Upstairs2 S(IMG_0052.JPG)   <- Screen S
 |    |  W IMG_0049.JPG true                              <- Screen W
 |    +-
 |     .
 |     .
 |     .
 */
/**
 *
 * @author richj0985, starwarslover1998, and tatad6701
 */
public class Map {

    // Strings to hold the initial location and direction of the user (Caf1, N)
    String initialLocation;
    String initialDirection;

    // Array of all of the locations within the map
    private ArrayList<Location> locations;

    /**
     * Runs through the total map of the text file and scans the various
     * locations
     *
     * @param fileName the scanner for the text file
     */
    public Map(String fileName) {
        // Initialize the list
        locations = new ArrayList<>();
        try {
            // Make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));

            // Read the initial location and direction from the config file
            initialLocation = input.nextLine();
            initialDirection = input.nextLine();

            // Make screens
            // Loop to the end of the file. Check to see 
            // if more lines available in the file (hasNext)
            while (input.hasNext()) {
                // Creating a location object and pass it the scanner
                // so that it can read from the file and initialize
                // it's location variables 
                Location loc = new Location(input);

                // Added the created location to the list
                locations.add(loc);
            }
            // Print "FileNotFoundException" to the programmer if the file was not found
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Method acknowledges the initial location of the user when the game starts
     *
     * @return the initial location of the user
     */
    public String getInitialLocation() {
        // Return the initial location of the user
        return initialLocation;
    }

    /**
     * Method acknowledges the initial direction of the user when the game
     * starts
     *
     * @return the initial direction of user
     */
    public String getInitialDirection() {
        // Return the initial direction of the user
        return initialDirection;
    }

    /**
     * Method that searches through the map to find a specific location
     *
     * @param findLocation the location that you need to find
     * @param findDirection the direction that you need to find
     * @return the location found and calls to find the specific direction
     */
    public Screen getScreen(String findLocation, String findDirection) {
        // Loop through each of the locations in the list 
        for (Location loc : this.locations) {
            // Asks if the location name that you are trying to find is the same as
            // the index location 
            if (loc.getName().equals(findLocation)) {
                // Found the location, now find the direction
                return loc.getScreen(findDirection);
            }
        }
        // No screen found, return nothing!
        return null;
    }
}
