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
    String location;
    String direction;

    public Controller(GUI gui, Map map) {
        this.gui = gui;
        this.map = map;
        this.location = map.getInitialLocation();
        this.direction = map.getInitialDirection();

        // make sure the GUI can talk to you
        gui.setController(this);
        // set the starting image
        Screen start = map.getScreen(location, direction);
        gui.setImage(start.getImage());
    }

    public void turnNorth() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        Screen current = map.getScreen(location, direction);
        direction = "N";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
        gui.setDirection(direction);
        gui.setBlocked(current.isBlocked());
    }
    
//    public void goNorth() {
//        // get the screen we are on right now
//        Screen current = map.getScreen(location, direction);
//        // Swtiching direction to face the new direction which was clicked
//        // ask if we can move west
//        if (current.isBlocked() == false) {
//            location = current.getNewImageName();
//            direction = current.getNewDirection();
//            current = map.getScreen(location, direction);
//
//        }
//        // set the image
//        gui.setImage(current.getImage());
//        
//    }

    public void turnEast() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        Screen current = map.getScreen(location, direction);
        direction = "E";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
        gui.setDirection(direction);
        gui.setBlocked(current.isBlocked());
    }
    
//    public void goEast() {
//        // get the screen we are on right now
//        Screen current = map.getScreen(location, direction);
//        // Swtiching direction to face the new direction which was clicked
//        // ask if we can move west
//        if (current.isBlocked() == false) {
//            location = current.getNewImageName();
//            direction = current.getNewDirection();
//            current = map.getScreen(location, direction);
//        }
//        // set the image
//        gui.setImage(current.getImage());
//        
//    }

    public void turnSouth() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        Screen current = map.getScreen(location, direction);
        direction = "S";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
        gui.setDirection(direction);
        gui.setBlocked(current.isBlocked());
    }
    
//    public void goSouth() {
//        // get the screen we are on right now
//        Screen current = map.getScreen(location, direction);
//        // Swtiching direction to face the new direction which was clicked
//        // ask if we can move west
//        if (current.isBlocked() == false) {
//            location = current.getNewImageName();
//            direction = current.getNewDirection();
//            current = map.getScreen(location, direction);
//        }
//        
//        // set the image
//        gui.setImage(current.getImage());
//    }

    public void turnWest() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        Screen current = map.getScreen(location, direction);
        direction = "W";
        current = map.getScreen(location, direction);
        // set the image
        gui.setImage(current.getImage());
        gui.setDirection(direction);
        gui.setBlocked(current.isBlocked());
    }
    
//    public void goWest() {
//        // get the screen we are on right now
//        Screen current = map.getScreen(location, direction);
//        
//        // Swtiching direction to face the new direction which was clicked
//        // ask if we can move west
//        if (current.isBlocked() == false) {
//            location = current.getNewImageName();
//            direction = current.getNewDirection();
//            current = map.getScreen(location, direction);
//        }
//        
//        // set the image
//        gui.setImage(current.getImage());
//    }
    
    public void goForward() {
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        
        // Swtiching direction to face the new direction which was clicked
        // ask if we can move west
        if (current.isBlocked() == false) {
            location = current.getNewImageName();
            direction = current.getNewDirection();
            current = map.getScreen(location, direction);
        }
        
        // set the image
        gui.setImage(current.getImage());
        gui.setDirection(direction);
        gui.setBlocked(current.isBlocked());
    }
    
    
}
