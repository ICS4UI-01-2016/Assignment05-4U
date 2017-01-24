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
 * @author guanv6321
 */
public class Map {

    // instance variables
    private ArrayList<Location> locations;
    private ArrayList<Screen> screens;
    private String startLocation;
    private String startDirection;

    public Map(String fileName) {

        locations = new ArrayList<>();
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            this.startLocation = input.next();
            this.startDirection = input.next();

            // Make screens
            // loop to the end of the file
            while (input.hasNext()) {
                // creating a screen from the scanner
                Location loc = new Location(input.next(), input);
                // added the created screen to the list
                locations.add(loc);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * gets starting location
     * @return starting location
     */
    public String getStartLocation() {
        return this.startLocation;
    }

    /**
     * gets starting direction
     * @return starting direction
     */
    public String getStartDirection() {
        return this.startDirection;
    }

    public Screen getScreen(String location, String direction) {
        for (Location loc : locations) {
            this.screens = loc.getScreens();
            for (Screen scrn : screens) {
                if (scrn.getLocationName().equalsIgnoreCase(location) && scrn.getDirection().equals(direction)) {
                    return scrn;
                }
            }
        }
        return null;
    }
}
