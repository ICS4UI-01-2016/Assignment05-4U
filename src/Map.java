
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
    
    /**
     * constructor for the map
     * @param fileName the file to be scanned
     */
    public Map(String fileName){
        //initialize the array list 
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
            //throws the error if file is not found (fileName)!!
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
   
    }
    /**
     * The method that is used to match the currentLocation with location we want 
     * @param place the current place that is being passed in
     * @param direction the current direction that is being passed in
     * @return the screen at (place then passes it to another method to get the right direction) or null if not found
     */
    public Screen getLocation(String place, String direction){
        //go through each screen 
        for(Location s: locations){   
            //sees if location name matches the location from the parameters 
            if(s.getLocationName().equals(place)){
                //Found a match, then asks the method getScreen in order to see if there is a direction match
                return s.getScreen(direction);  
                
            }
        }
        // no match was found, returns nothing
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

