
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
    //
    
   //A way to store all possible screens in an array 
   private Screen[] locationScreens;
   //String that stores the name of the place 
   private String locationName;
   // contains all directions
   private String[] directions;
   
   //direction is stored as an integer so that it can be easily manipulated 
   private int currentDirection;
   
    public Location(String filename){
        //initialize array, since there are 4 lines, and 4 directions
        locationScreens = new Screen[4];
        
        // Having directions coorelate to numbers make orientation much easier, each slot contains a corresponding direction
        directions[0] = "N";
        directions[1] = "E";
        directions[2] = "S";
        directions[3] = "W";
        
        //using try incase an error is thrown at us 
        try {
            Scanner input = new Scanner(new File(filename));
            locationName = input.next();
            

            //make screens 4 times            
            for(int i = 0; i < 4; i++){
                Screen s = new Screen(input);
                // each slot of an array represents direction, each direction is given a screen
                locationScreens[i] = s;
            }
        
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    public String getLocationName(){
        return this.locationName;
    }
    
    
    /**
     * A method that checks if you are able to move forward or not
     * @param direction the direction you are currently on
     * @return true or false whether you can move forward or not
     */
    public boolean canMoveForward(String direction){
         for(int i = 0; i < 4; i++){
            String check = directions[i];
            
            if(check.equals(direction)){
                currentDirection = i;
            }
         }
                
          return locationScreens[currentDirection].isFrontClear();
        
       
  
}
    /**
     * A method that "attaches" the image to each array of screen 
     * @param direction 
     * @return the location that is provided within the same line the current direction is in
     */
            public String getPicture(String direction){
        for(int i = 0; i < 4; i++){
            String check = directions[i];
            
            if(direction.equals(check)){
                currentDirection = i;
            }
        }
        return locationScreens[currentDirection].getImage();
    }
            
            
            public String getNextLocation(String location){
                   for(int i = 0; i < 4; i++){
            String check = directions[i];
            
            if(location.equals(check)){
                currentDirection = i;
            }
        }
        return locationScreens[currentDirection].getNextPlace();
            }
            
            public String getNextDirection(String direction){
                for(int i = 0; i < 4; i ++){
                    String check = directions[i];
                    
                    if(direction.equals(check)){
                        currentDirection = i;
                    }
                }
                
                return locationScreens[currentDirection].getNextDirection();
            }
}
