/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brendan
 */
public class School {
    
    // creating the instance variables
    private ArrayList<Screen> screens;
    private ArrayList<Location> locations; 
    private String initialLocation;
    private String initialDirection;
    
    /**
     * constructor for the school
     * @param fileName the name of the file being scanned
     */
    public School(String fileName){
        
        // initilize the new array list 
        locations = new ArrayList<>();
        // if the file does exist do the following
        try {
            // creating the scanner
            Scanner in = new Scanner(new File(fileName));
            // input the initial direction and the initial location
            this.initialLocation = in.next();
            this.initialDirection = in.next();

            // while there is something that is unscanned do the following
            while (in.hasNext()) {
                // create a new location and add it to the array list
                Location s = new Location(in.next(), in);
                locations.add(s);
            }
            // catch the printStackTrace exception
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * method to get the initial direction
     * @return the initial direction
     */
    public String getInitialDirection(){
        return this.initialDirection;
    }
    /**
     * method to get the initial location
     * @return the initial location
     */
    public String getInitialLocation(){
        return this.initialLocation;
    }
    
    /**
     * method to get the screen
     * @param Location the location of the screen
     * @param Direction the direction of the screen
     * @return the location and and direction
     */
    public Screen getScreen(String Location, String Direction) {

        // go through each of the screens
        for (Location a : locations) {
            // take in the screens for the first location
            this.screens = a.getNextScreen();
            // for each screen make sure to check if the location and the direction are equal
            for (Screen s : screens) {
                // if these are true do the following
                if (s.getLocation().equalsIgnoreCase(Location) && s.getDirection().equalsIgnoreCase(Direction)) {
                    // return s if it was successful is finding the screen
                    return s;
                }
            }
        }
        // return null if no screen was found
        return null;
    }
}
