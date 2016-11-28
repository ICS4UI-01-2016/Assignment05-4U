
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class LocationAdventure {

    //A way to store all possible screens in an array 
    private ArrayList<ScreenAdventure> screens;
    //String that stores the name of the place 
    private String locationName;
    // contains all directions
    private String[] directions;
    

    public LocationAdventure(Scanner input) {
        //initialize array, since there are 4 lines, and 4 directions

        // Having directions coorelate to numbers make orientation much easier, each slot contains a corresponding direction
        directions[0] = "north";
        directions[1] = "east";
        directions[2] = "south";
        directions[3] = "west";
        
        screens = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            ScreenAdventure scrn = new ScreenAdventure(input);            
            screens.add(scrn);
        }
   
    }
    
    public String getLocationName(){
        return locationName;
    }
    
    public ScreenAdventure getScreen(String direction){
        for(ScreenAdventure scrn : screens){
            if(scrn.getDirection().equals(direction)){
                return scrn;
            }           
        }
        return null;
    }
}
