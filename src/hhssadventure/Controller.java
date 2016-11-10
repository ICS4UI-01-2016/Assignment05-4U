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
        
        gui.setController(this);
        Screen start = map.getScreen(location, direction);
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){
        Screen current = map.getScreen(location, direction);
        
        if(current.canGoNorth()){
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goSouth(){
        Screen current = map.getScreen(location, direction);
        if(current.canGoSouth()){
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goEast(){
        Screen current = map.getScreen(location, direction);
        if(current.canGoEast()){
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goWest(){
        Screen current = map.getScreen(location, direction);
        if(current.canGoWest()){
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }
    }
}
