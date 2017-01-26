/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hhssadventure;

import java.io.File;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ajay
 */
public class Location {
    private String name;
    private ArrayList<screen> screens;  //Only private screens being used for the map

    public Location(Scanner input) {
        // Initialize the list of screens for this location
        screens = new ArrayList<>();

        // Read in the location name
        name = input.nextLine();
        // Read in the 4 screens for this location (N,E,S,W)
        for (int i = 0; i < 4; i++) {
            screen s = new screen(input);

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
    public screen getScreen(String findDirection) {
        // Now loop through the 4 screens/direction for this location
        for (screen scn : screens) {
            // See if we have a direction match
            if (scn.getNextDirection().equals(findDirection)) {
                // Finding the image
                return scn;
            }
        }
        // Return nothing if no screen was found
        return null;
    }
    
    /**
     * return the array lists screens
     * @return the screens from the array list
     */
    public ArrayList getScreen(){
        return screens;
    }
}