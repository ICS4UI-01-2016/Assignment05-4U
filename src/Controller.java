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
    private String place;
    private String direction;
    
    
    public Controller(HHSSAdventureFrame gui, Map m, String word, String c){
        this.gui = gui;
        this.map = m;
        this.place = word;
        this.direction = c;
        
        
        //make sure the GUI can talk to you
        gui.setController(this);
        
        //set starting image 
        Screen start = map.getScreen(place,direction);
        gui.setImage(start.getImage());
    }
    
    public void goForward(){
        //get the screen we are on right now 
        Screen current = map.getScreen(place, direction);
        
        //if we can move north
        if(current.isFrontClear()){
            place = current.getNextPlace();
            
            //Get new screen, set at next place according 
            Screen newScreen = map.getScreen(current.getNextPlace(), current.getNextDirection());
            newScreen.getNextPlace();

            // set the image
            gui.setImage(newScreen.getImage());
        }
      
    }
    
   
       public void lookNorth(){
        //get the screen we are on right now 
        Screen current = map.getScreen(place, direction);
        
 
       
            // move up a row
            direction = "N"; 
            //Get new screen 
            Screen newScreen = map.getScreen(place, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        }
        
    
    
    

    public void lookSouth(){
        //get the screen we are on right now 
        Screen current = map.getScreen(place, direction);
        
        
    
           direction = "S";
            //Get new screen 
            Screen newScreen = map.getScreen(place, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        
        
    
    
    
}
         public void lookWest(){
        //get the screen we are on right now 
        Screen current = map.getScreen(place, direction);
        
        //ask if we can move north
      
            direction = "W";
         
            //Get new screen 
            Screen newScreen = map.getScreen(place, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        
}
           public void lookEast(){
        //get the screen we are on right now 
        Screen current = map.getScreen(place, direction);
        
        //ask if we can move north
        
            direction = "E";
            
            //Get new screen 
            Screen newScreen = map.getScreen(place, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        
}
           public static void main(String[] args) {
   
               Controller f = new Controller(null, null, "Hey", "h");
               
}
}

