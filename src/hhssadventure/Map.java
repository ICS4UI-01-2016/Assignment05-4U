/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/*  +--Map
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
 * @author richj0985
 */
public class Map {

    String initialLocation;
    String initialDirection;
    private ArrayList<Location> locations;

    public Map(String fileName) {
        // Initialize the list
        locations = new ArrayList<>();
        try {
            // Make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));

            // read the initial location and direction from the config file
            initialLocation = input.nextLine();
            initialDirection = input.nextLine();

            // Make screens
            // Loop to the end of the file.  Check to see 
            // if more lines available in the file (hasNext)
            while (input.hasNext()) {
                // Creating a location object and pass it the scanner
                // so that it can read from the file and initialize
                // it's location variables 
                Location loc = new Location(input);

                // Added the created location to the list
                locations.add(loc);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public String getInitialLocation() {
        return initialLocation;
    }

    public String getInitialDirection() {
        return initialDirection;
    }

    public Screen getScreen(String findLocation, String findDirection) {
        // Loop through each of the locations in the list 
        for (Location loc : this.locations) {

            if (loc.getName().equals(findLocation)) {
                // found the location 
                return loc.getScreen(findDirection);
            }
        }
        // No screen found
        return null;
    }
}
