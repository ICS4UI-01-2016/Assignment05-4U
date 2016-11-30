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

    private ArrayList<Screen> screens;
    private ArrayList<Area> areas;
    private String startArea;
    private String startDirection;

    public Map(String fileName) {

        areas = new ArrayList<>();

        try {
            // make the scanner for the text file
            Scanner in = new Scanner(new File(fileName));

            this.startArea = in.next();
            this.startDirection = in.next();

            // Make screens
            // loop to the end of the file
            while (in.hasNext()) {
                Area a = new Area(in.next(), in);
                areas.add(a);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public String getStartArea() {
        return this.startArea;
    }

    public String getStartDirection() {
        return this.startDirection;
    }

    public Screen getScreen(String Area, String Direction) {
        // go through each screen
        for (Area a : areas) {
            this.screens = a.getScreens();
            for (Screen s : screens) {
                // see if the row and col match
                if (s.getArea() == Area && s.getDirection() == Direction) {
                    // I found the screen
                    return s;
                }
            }
        }
        // no screen found
        return null;
    }

}
