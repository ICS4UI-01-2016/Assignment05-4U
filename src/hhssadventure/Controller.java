/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author richj0985
 */
public class Controller {
    private GUI gui;
    private Map map;
    int location;
    int direction;
    
    public Controller(GUI gui, Map map, int location, int direction){
        this.gui = gui;
        this.map = map;
        this.location = location;
        this.direction = direction;
        
        // make sure the GUI can talk to you
        gui.setController(this);
        // set the starting image
        Screen start = map.getScreen(location, direction);
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // ask if we can move north
        if(current.canGoNorth()){
            // get the new screen
            Screen newScreen = map.getScreen(location, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goSouth(){
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // ask if we can move south
        if(current.canGoSouth()){
            // get the new screen
            Screen newScreen = map.getScreen(location, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goEast(){
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // ask if we can move east
        if(current.canGoEast()){
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }
    }
    public void goWest(){
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // ask if we can move west
        if(current.canGoWest()){
            // get the new screen
            Screen newScreen = map.getScreen(location, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
}
