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
 * @author Ajay
 */
public class Map {

    String StartLoc;
    String StartDir;
    private ArrayList<Location> locations;
    private ArrayList<screen>screens;


    public Map(String fileName) {
        locations = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(fileName));

            this.StartLoc  = input.nextLine();
            this.StartDir = input.nextLine();

            while(input.hasNext()) {
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
    
    public screen getScreen(String Location, String Direction) {
        for (Location loc : this.locations) {
            if (loc.getName().equals(Location)) {
                return loc.getScreen(Direction);
            }
        }
        // No screen found, return nothing!
        return null;
    }
}

