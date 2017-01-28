/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brendan
 */
public class Location {

    // creating an array list to store all of the screens for a given area
    private ArrayList<Screen> screens;

    /**
     * constructing an area that will have smaller areas within it
     * @param locationName the name of the location in the picture file
     * @param in the variable used for the scanner
     */
    public Location(String locationName, Scanner in) {
        // creating the array list containing the screens for an area
        screens = new ArrayList<>();

        // make three screens for an area and do the following 
        for (int i = 0; i <= 3; i++) {
            // construct a new screen with the locations name and the scanner
            Screen s = new Screen(locationName, in);
            // add the new screen to the array list
            screens.add(s);
        }
    }

    /**
     * return the array list with all the screens
     * @return the screens array list
     */
    public ArrayList getNextScreen() {
        return screens;
    }
}
