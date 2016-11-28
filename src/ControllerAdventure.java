/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class ControllerAdventure {

   public class Controller {

    private GUIAdventure gui;
    private MapAdventure map;
    private String location;
    private String direction;

    public Controller(GUIAdventure gui, MapAdventure map, String location, String direction) {
        this.gui = gui;
        this.map = map;
        this.location = location;
        this.direction = direction;

        // make sure the GUI can talk to you
        gui.setController(this);
        // set the starting image
        ScreenAdventure start = map.getScreen(location, direction);
        gui.setImage(start.getImage());
        
    }

    public void turnNorth() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        ScreenAdventure current = map.(location, direction);
        if(current.equals("true")){
            location = current.getNewLocation();
            //Get new screen, set at next place according  to "getNextPlace"
            ScreenAdventure newScreen = map.getLocation(current.getNewLocation(), current.getDirection());
        }
        direction = "N";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
    }
    
    public void goNorth() {
        // get the screen we are on right now
        ScreenAdventure current = map.getScreen(location, direction);
        // Swtiching direction to face the new direction which was clicked
        // ask if we can move west
        if (current.clear() == false) {
            location = current.getNewLocation();
            direction = current.getDirection();
            current = map.getScreen(location, direction);

        }
        // set the image
        gui.setImage(current.getImage());
        
    }

    public void turnEast() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        ScreenAdventure current = map.getScreen(location, direction);
        direction = "E";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
    }
    
    public void goEast() {
        // get the screen we are on right now
        ScreenAdventure current = map.getScreen(location, direction);
        // Swtiching direction to face the new direction which was clicked
        // ask if we can move west
        if (current.clear() == false) {
            location = current.getNewLocation();
            direction = current.getDirection();
            current = map.getScreen(location, direction);
        }
        // set the image
        gui.setImage(current.getImage());
        
    }

    public void turnSouth() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        ScreenAdventure current = map.getScreen(location, direction);
        direction = "S";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
    }
    
    public void goSouth() {
        // get the screen we are on right now
        ScreenAdventure current = map.getScreen(location, direction);
        // Swtiching direction to face the new direction which was clicked
        // ask if we can move west
        if (current.clear() == false) {
            location = current.getNewLocation();
            direction = current.getDirection();
            current = map.getScreen(location, direction);
        }
        
        // set the image
        gui.setImage(current.getImage());
    }

    public void turnWest() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        ScreenAdventure current = map.getScreen(location, direction);
        direction = "W";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
    }
    
    public void goWest() {
        // get the screen we are on right now
        ScreenAdventure current = map.getScreen(location, direction);
        
        // Swtiching direction to face the new direction which was clicked
        // ask if we can move west
        if (current.clear() == false) {
            location = current.getNewLocation();
            direction = current.getDirection();
            current = map.getScreen(location, direction);
        }
        
        // set the image
        gui.setImage(current.getImage());
    }
    
   }   
}
