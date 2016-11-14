
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
    
    
    public Map(String fileName){
        //initialize the list 
        screens = new ArrayList<>();
        try {
            //make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            //Make screens
            //loop to the end of the file
            while(input.hasNext()){
                Screen s = new Screen(input);
                screens.add(s);
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Retrieve specific screen from the map
     * @param row the row which the screen appears 
     * @param col the col which the screen appears 
     * @return the screen at (row,col) or null if not found
     */
    public Screen getScreen(String place, String direction){
        //go through each screen 
        for(Screen s: screens){
            // see if row and col match
            if(s.getCurrentPlace() == place && s.getCurrentDirection()== direction){
                //I found the screen
                return s;
            }
            
        }
        // no screen found
        return null;
    }
    
}
