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
    
    private ArrayList<Screen> screens;
    private ArrayList<Location> locations;
    
    private String initialLocation;
    private String initialDirection;
    
    public School(String fileName){
        
        locations = new ArrayList<>();
        
        try {
            
            Scanner in = new Scanner(new File(fileName));
            
            this.initialLocation = in.next();
            this.initialDirection = in.next();

            
            while (in.hasNext()) {
                
                Location s = new Location(in.next(), in);
                locations.add(s);
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public String getInitialDirection(){
        return this.initialDirection;
    }
    
    public String getInitialLocation(){
        return this.initialLocation;
    }
    
    public Screen getScreen(String Area, String Direction) {

        for (Location a : locations) {
            
            this.screens = a.getNextScreen();
            
            for (Screen s : screens) {
                if (s.getLocation().equalsIgnoreCase(Area) && s.getDirection().equalsIgnoreCase(Direction)) {
                    
                    return s;
                }
            }
        }

        return null;
    }
}
