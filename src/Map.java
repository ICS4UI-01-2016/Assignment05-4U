
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
    //create list of locations as a private variable
    private ArrayList<Location> locations;
    //create current location/place name as a private variable
    private String currentPlace;
    //create current direction as a private variable
    private String currentDirection;
    //create the private variable that stores the current location
    Location currentLoc = null;
    /**
     * constructor for the map
     * @param fileName the file to be scanned
     */
    public Map(String fileName){
        //initialize the list 
        locations = new ArrayList<>();

        try {
            
            //make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            //initialize currrent place as the next "word"/position
            currentPlace = input.next();
            //initialize currrent direction as the next "word"/position
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
        //go through list of locations, and set the current location to the curresponding one in the list
        for(int i = 0; i < locations.size(); i++) {
             if(currentPlace.equals(locations.get(i).getLocationName())){
                currentLoc = locations.get(i);
            }
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
            if(s.getLocationName().equals(place)){
              
                
                //I found the screen
                return s.getScreen(direction);  
                
            }
            
        }
        // no screen found
        return null;
    }
    
    
     
    /**
     * Returns the name of the starting location
     * @return the name of the starting location
     */
    public String getStartingPlace(){
        return currentPlace;
    }
    /**
     * Returns the starting direction
     * @return the starting direction
     */
    public String getStartingDirection(){
        return currentDirection;
    }
    
    
    
    public static void main(String[] args) {
        
    }
}

