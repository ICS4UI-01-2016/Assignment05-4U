/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author richj0985
 */
public class Location {
    public String name; 
    public ArrayList<Screen> screens;
    
    public Location( Scanner input ) {
        // Initialize the list of screens for this location
        screens = new ArrayList<>();  
        
        //read the location name
        name = input.nextLine();
        
        // read the 4 screens for this location (N,E,S,W)
        for( int i=0; i<4; i++ ){
            Screen s = new Screen(input);
            
            // Added the created screen to the list
            screens.add(s);
        }
    }

}
