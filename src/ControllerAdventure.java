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
        Screen start = map.getScreen(row, col);
        gui.setImage(start.getImage()); 
    }
    
    public void goNorth(){
        // get the screen we are on right now
        ScreenAdventure current = map.getScreen(row, col);
        // ask if we can move north
        if(){
            // move up a row
            row--;
            // get the new screen 
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage()); 
        }
    }
    
}
