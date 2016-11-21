package hhssadventure;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *An object to store the entire map of the world
 * @author moore3607
 */
public class Map {
    private ArrayList<Screen> screens;
    
    public Map(String fileName){
        // initialize the list
        screens = new ArrayList<>();
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            
            while(input.hasNext()){
                //creating a screen from the scanner
                Screen s = new Screen(input);
                // added the created screen to the list
                screens.add(s);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Retrieve a specific screen from the map
     * @param row the row which the screen appears
     * @param col the column which the screen appears
     * @return the screen at(row, col) or null if not found
     */
    public Screen getScreen(int IMGNum){
        //go through each screen
        for(Screen s: screens){
            // see if the row and column match
            if(IMGNum == ){
                return s;
            }
        }
        // no screen found
        return null;
    }
}
