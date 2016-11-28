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
import javafx.stage.Screen;



/**
 *
 * @author Ajay
 */
public class Map {

    String StartLoc;
    String StartDir;


    private ArrayList<Location> locations;


    public Map(String fileName) {
        locations = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(fileName));

            StartLoc  = input.nextLine();
            StartDir = input.nextLine();

            while (input.hasNext()) {
                Location loc = new Location(input);

                locations.add(loc);
            }
    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }


    public String getStartLoc() {
        return StartDir;
    }

    public String getStartDir() {
        return StartDir;
    }
    
    public screen getScreen(String findLocation, String findDirection) {
        for (Location loc : this.locations) {
            if (loc.getName().equals(findLocation)) {
                return loc.getScreen(findDirection);
            }
        }
        // No screen found, return nothing!
        return null;
    }
}

