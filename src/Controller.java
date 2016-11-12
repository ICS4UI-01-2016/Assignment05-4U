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
    private int direction;
    
    public Controller(HHSSAdventureFrame gui, Map m, String word, char c){
        this.gui = gui;
        this.map = m;
        this.place = word;
        this.direction = c;
        
        //make sure the GUI can talk to you
        gui.setController(this);
        
        //set starting image 
        Screen start = map.getScreen(row, col);
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){
        //get the screen we are on right now 
        Screen current = map.getScreen(row, col);
        
        //ask if we can move north
        if(current.canGoNorth()){
            // move up a row
            row--;
            //Get new screen 
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
      
    }
       public void goSouth(){
        //get the screen we are on right now 
        Screen current = map.getScreen(row, col);
        
        //ask if we can move north
        if(current.canGoSouth()){
            // move up a row
            row++;
            //Get new screen 
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
        
    
    
    
}
         public void goWest(){
        //get the screen we are on right now 
        Screen current = map.getScreen(row, col);
        
        //ask if we can move north
        if(current.canGoWest()){
            // move up a row
            col--;
            //Get new screen 
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
}
           public void goEast(){
        //get the screen we are on right now 
        Screen current = map.getScreen(row, col);
        
        //ask if we can move north
        if(current.canGoEast()){
            // move up a row
            col++;
            //Get new screen 
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
}
}
