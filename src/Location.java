
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class Location {
    
    
   private Screen[] locationScreens;
   private String locationName;
    public Location(String filename){
        //initialize array
        locationScreens = new Screen[4];
        
        try {
            Scanner input = new Scanner(new File(filename));
            locationName = input.next();
            //make screens 4 times
            
            for(int i = 0; i < 4; i++){
                Screen s = new Screen(input);
                locationScreens[i] = s;
            }
        
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public String getLocationName(){
        return this.locationName;
    }
    public boolean canMoveForward(String direction){
        if()
    }
}
