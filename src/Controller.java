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
    
    
    public Controller(HHSSAdventureFrame gui, Map m, String word, String c){
        this.gui = gui;
        this.map = m;
        this.currentPlace = word;
        this.currentDirection = c;
        
        
        //make sure the GUI can talk to you
        gui.setController(this);
        
        //set starting image 
        Screen start = map.getScreen(currentPlace,currentDirection);
        gui.setImage(start.getImage());
    }
    
    public void goForward(){
        //get the screen we are on right now 
        Screen current = map.getScreen(currentPlace, currentDirection);
        
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
    
   
       public void lookNorth(){

            // move up a row
            currentDirection = "N"; 
            //Get new screen 
            Screen newScreen = map.getScreen(currentPlace, currentDirection);
            // set the image
            gui.setImage(newScreen.getImage());
        }
        
    
    
    

    public void lookSouth(){
      

           currentDirection = "S";
            //Get new screen 
            Screen newScreen = map.getScreen(currentPlace, currentDirection);
            // set the image
            gui.setImage(newScreen.getImage());
        
        
    
    
    
}
         public void lookWest(){
       
       
        
        //ask if we can move north
      
            currentDirection = "W";
         
            //Get new screen 
            Screen newScreen = map.getScreen(currentPlace, currentDirection);
            // set the image
            gui.setImage(newScreen.getImage());
        
}
           public void lookEast(){
        
       
        
        //ask if we can move north
        
            currentDirection = "E";
            
            //Get new screen 
            Screen newScreen = map.getScreen(currentPlace, currentDirection);
            // set the image
            gui.setImage(newScreen.getImage());
        
}
           public static void main(String[] args) {
   
              
               
}
}

