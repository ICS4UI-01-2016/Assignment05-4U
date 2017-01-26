package hhssadventure;

import hhssadventure.Location;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321, kulla6503
 */
public class Map {

    // instance variables
    private ArrayList<Location> locations;
    private ArrayList<Screen> screens;
    private String startLocation;
    private String startDirection;

    /**
     * Constructor to initialize starting location and direction
     *
     * @param fileName
     */
    public Map(String fileName) {

        // Initialize the location array list 
        locations = new ArrayList<>();
        try {
            // Make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));

            // Gets the start location 
            this.startLocation = input.next();

            // Gets the star direction 
            this.startDirection = input.next();

            // Make screens
            // Loop to the end of the file
            while (input.hasNext()) {

                // Creating a screen from the scanner
                Location loc = new Location(input.next(), input);

                // Added the created screen to the list
                locations.add(loc);
            }
            // The Method catches the print stack trace method 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Gets starting location
     *
     * @return starting location
     */
    public String getStartLocation() {
        return this.startLocation;
    }

    /**
     * Gets starting direction
     *
     * @return starting direction
     */
    public String getStartDirection() {
        return this.startDirection;
    }

    /**
     * Gets the screen
     *
     * @param location of the screen
     * @param direction of the screen
     * @return the location and direction
     */
    public Screen getScreen(String location, String direction) {

        // Goes through the screen
        for (Location loc : locations) {

            // The screens past for location loc
            this.screens = loc.getScreens();

            // Checks if location and direction are equal
            for (Screen scrn : screens) {

                if (scrn.getLocationName().equalsIgnoreCase(location) && scrn.getDirection().equals(direction)) {
                    // Return the screen if it is found
                    return scrn;
                }
            }
        }
        // Return nothing if no screen is found
        return null;
    }
}
