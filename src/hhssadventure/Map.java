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
 * @author brayden
 */
public class Map {

    //instance variables
    private ArrayList<Screen> screens;
    private ArrayList<Area> areas;
    private String startArea;
    private String startDirection;

    /**
     * constructor class for map
     *
     * @param fileName the file being scanned
     */
    public Map(String fileName) {
        //intialize areas arraylist
        areas = new ArrayList<>();
        //if file exists
        try {
            // make the scanner for the text file
            Scanner in = new Scanner(new File(fileName));
            //scan in start area and direction
            this.startArea = in.next();
            this.startDirection = in.next();

            //while there is unscanned text in a line
            while (in.hasNext()) {
                //create a new area and add it to the array list
                Area a = new Area(in.next(), in);
                areas.add(a);
            }
            //catch the printstacktrace exception
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * accessor method to get start area
     *
     * @return start area
     */
    public String getStartArea() {
        return this.startArea;
    }

    /**
     * accessor method to get start direction
     *
     * @return start direction
     */
    public String getStartDirection() {
        return this.startDirection;
    }

    /**
     * accessor method to get screen
     *
     * @param Area area of the screen
     * @param Direction direction of the screen
     * @return the area and the direction
     */
    public Screen getScreen(String Area, String Direction) {
        // go through each screen
        for (Area a : areas) {
            //pass in screens for area a
            this.screens = a.getScreens();
            //for each screen check to see if the area name and direction are equal
            for (Screen s : screens) {
                if (s.getAreaName().equalsIgnoreCase(Area) && s.getDirection().equalsIgnoreCase(Direction)) {
                    //return s if found the screen
                    return s;
                }
            }
        }
        //return null if no screen found
        return null;
    }

}
