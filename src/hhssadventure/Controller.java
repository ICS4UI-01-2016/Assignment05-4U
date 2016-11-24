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

    // Create constants to be used (instance variables)
    private GUI gui;
    private Map map;
    String location;
    String direction;

    public Controller(GUI gui, Map map) {
        this.gui = gui;
        this.map = map;
        this.location = map.getInitialLocation();
        this.direction = map.getInitialDirection();

        // Make sure the GUI can talk to you
        gui.setController(this);
        // Set the starting image
        Screen start = map.getScreen(location, direction);
        gui.setImage(start.getImage());
        gui.setDirection(direction);
        gui.setBlocked(start.isBlocked());
    }

    public void turnNorth() {
        // Get the screen we are on right now
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

    public void turnEast() {
        // Get the screen we are on right now
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

    public void turnSouth() {
        // Get the screen we are on right now
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

    public void turnWest() {
        // Get the screen we are on right now
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

    public void goForward() {
        // Get the screen we are on right now
        Screen current = map.getScreen(location, direction);

        // Swtiching direction to face the new direction which was clicked
        // Ask if we can move west
        if (current.isBlocked() == false) {
            location = current.getNewImageName();
            direction = current.getNewDirection();
            current = map.getScreen(location, direction);
        }

        // Set the image
        gui.setImage(current.getImage());
        gui.setDirection(direction);
        gui.setBlocked(current.isBlocked());
    }
}
