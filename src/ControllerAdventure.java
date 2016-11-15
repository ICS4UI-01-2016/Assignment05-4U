/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class ControllerAdventure {
    private GUIAdventure gui;
    private MapAdventure map;
    private String direction;
    private String location;
    
    public ControllerAdventure(GUIAdventure gui, MapAdventure map, String direction, String location){
        this.gui = gui;
        this.map = map;
        this.direction = direction;
        this.location = location;
        
        // make sure the GUI can talk to you
        gui.setController(this); 
        
        // set starting image
        ScreenAdventure start = map.getScreen(direction, location);
        gui.setImage(start.getImage()); 
    }
    
    public void lookNorth(){
        // get the screen we are on right now
        ScreenAdventure current = map.getScreen(direction, location);
        // ask if we can move north
        direction = "north";
            // move up a row
            
            // get the new screen 
            ScreenAdventure newScreen = map.getScreen(direction, location);
            // set the image
            gui.setImage(newScreen.getImage());       
    }
    
}
