package hhssadventure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import hhssadventure.Screen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thomas
 */
public class Map {

    //all instance variables 

    private ArrayList<Screen> screens;
    private ArrayList<Location> locations;
    private String firstLocation;
    private String firstDirection;

    /**
     * builder for map
     *
     * @param fileName the file being scanned in
     */
    public Map(String fileName) {
       
        
        locations = new ArrayList<>();

        try {
            //scanner for text file
            Scanner input = new Scanner(new File(fileName));
            //scan in the startin direction and location
            this.firstLocation = input.next();

            this.firstDirection = input.next();
            //while there is still text that has not been scanned 
            while (input.hasNext()) {
                //eneter the locations into an array 
                Location n = new Location(input.next(),input);//error
                System.out.println(n);
                //add to array
                locations.add(n);
            }
        } catch (FileNotFoundException ex) {
        }
    }

    /**
     * get the first direction(starting)
     *
     * @return first location
     */
    public String getFirstDirection() {
        return this.firstDirection;
    }

    /**
     * get first starting location
     *
     * @return the starting location
     */
    public String getFirstLocation() {
        //return the location 
        return this.firstLocation;
    }

    /**
     * gets the the get screen
     *
     * @param Location the location of the image
     * @param Direction the direction of the image
     * @return
     */
    public Screen getScreen(String Location, String Direction) {
        //go through all screens from location class
        for (Location l : locations) {
            this.screens = l.getScreens();

            for (Screen s : screens) {
                //check to see if the imane location and the directions are the same 
                if (s.getNextLoc().equalsIgnoreCase(Location) && s.getDirection().equalsIgnoreCase(Direction)) {
                    //return the screen
                    return s;
                }
            }
        }
        //if nothing is found (no screen return nothing)
        return null;
    }

}
