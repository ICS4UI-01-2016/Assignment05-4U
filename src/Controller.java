
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Controller {
    private HHSSAdventureFrame gui;
    private Map map;
    private String currentPlace;
    private String currentDirection;
    private ArrayList<Location> locations = new ArrayList<>();
    private Location test;
    private String[] directions;
    
    private Map currentLoc;
    
    
    
    public Controller(HHSSAdventureFrame gui, Map m, String word, String c){
        this.gui = gui;
        this.map = m;
        this.currentPlace = word;
        this.currentDirection = c;
        
        
        directions[0] = "N";
        directions[1] = "E";
        directions[2] = "S";
        directions[3] = "W";
        
        //make sure the GUI can talk to you
        gui.setController(this);
        
        //set starting image 
        Screen start = map.getLocation(currentPlace,currentDirection);
        gui.setImage(start.getImage());
    }
    
    public void goForward(){
        //get the screen we are on right now 
        Screen current = map.getLocation(currentPlace, currentDirection);
        String destination = test.getNextLocation(currentPlace);
        
        //if we can move north
        if(current.isFrontClear()){
            currentPlace = current.getNextPlace();
            
            //Get new screen, set at next place according  to "getNextPlace"
            Screen newScreen = map.getScreen(current.getNextPlace(), current.getNextDirection());
            newScreen.getNextPlace();

            // set the image
            gui.setImage(newScreen.getImage());
        }
      
    }
    
   
    
        
    
    
    

  
         public void turnLeft(){
       
       
        
        //ask if we can move north
             for (int i = 0; i < directions.length; i++) {
                 if(currentDirection.equals("N")){
                       currentDirection = "W";
                       break;
                       
                 }else{
                     currentDirection = directions[i-1];
                     break;
                 }
                 
                 gui.setImage(current);
                 
             }
          
         
            //Get new screen 
            Screen newScreen = map.getScreen(currentPlace, currentDirection);
            // set the image
            gui.setImage(newScreen.getImage());
        
}
         
         
         
           public void turnRight(){
   
               Screen current = map.getLocation(currentPlace, currentDirection);
               for (int i = 0; i < directions.length; i++) {
                 if(currentDirection.equals("W")){
                       currentDirection = "N";
                       break;
                 }else{
                     currentDirection = directions[i+1];
                     break;
                 }
        
            
            
            //Get new screen 
            Screen newScreen = map.getLocation(currentPlace, currentDirection);
            // set the image
            gui.setImage(newScreen.getImage());
            gui.setPosition()
        
}

}
}



