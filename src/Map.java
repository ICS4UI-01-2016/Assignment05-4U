
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
    
    private ArrayList<Location> locations;
    
    private String[] direction;
    private Location currentDestination;
    
    private String currentPlace;
    private String currentDirection;
   
    
    public Map(String fileName){
        //initialize the list 
        locations = new ArrayList<>();
        
        // Having directions coorelate to numbers make orientation much easier, each slot contains a corresponding direction
        
        try {
            
            //make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            
            currentPlace = input.next();
            currentDirection = input.next();
            
            //Make screens
            //loop to the end of the file
            while(input.hasNext()){
                
                // creating a screen from the scanner
                Location s = new Location(input);
                
                 // added the created screen to the list
                locations.add(s);
                
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
    public Screen getLocation(String place, String direction){
        //go through each screen 
        
        for(Location s: locations){
            
            // see if place and direction match
            if(s.getLocationName().equals(s.getNextLocation(direction))){
                //I found the screen
                return s.getScreen(direction);                                                                                                                                       
            }
            
        }
        // no screen found
        return null;
    }
    
    public String getStartingPlace(){
        return currentPlace;
    }
    
    public String getStartingDirection(){
        return currentDirection;
    }
    
    
    
 
}

