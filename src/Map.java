
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
 * An object to store the entire map of HYRULE 
 * @author hadik9595
 */
public class Map {
    private ArrayList<Screen> screens;
    private ArrayList<Spawn> locations;
    
    
    public Map(String fileName){
        //initialize the list 
        screens = new ArrayList<>();
        locations = new ArrayList<>();
        try {
            //make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            //Make screens
            //loop to the end of the file
            while(input.hasNext()){
                // creating a screen from the scanner
                Screen s = new Screen(input);
                 // added the created screen to the list
                screens.add(s);
                
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Retrieve specific screen from the map
     * @param place the row which the screen appears 
     * @param direction the col which the screen appears 
     * @return the screen at (place) or null if not found
     */
    public Screen getScreen(String place, String direction){
        //go through each screen 
        for(Screen s: screens){
            // see if place and direction match
            if(s.getCurrentPlace().equals(place) && s.getCurrentDirection().equals(direction)){
                //I found the screen
                System.out.println("Test "  + s.getCurrentDirection()+ " " + s.getCurrentPlace() );
                return s;
            }
            
        }
        // no screen found
        return null;
    }
    
}
