/*
 * Controller Class allows for the user to click on the buttons (which are interconnected to the GUI)
 * and then move according to the directions. Methods of the directions are found here.
 */
package hhssadventure;

/**
 *
 * @author richj0985, starwarslover1998, tatad6701
 */
public class Controller {

    // Create constants to be used (instance variables)
    private GUI gui;
    private Map map;
    String location;
    String direction;

    /**
     * Constructor for the controller
     *
     * @param gui Interconnects the controller and GUI
     * @param map Interconnects the controller and map
     */
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

    /**
     * Method that allows for the user to turn North
     */
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

    /**
     * Method that allows the user to turn East
     */
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

    /**
     * Method that allows the user to turn South
     */
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

    /**
     * Method that allows the user to turn West
     */
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

    /**
     * Method that allows the user to move forward
     */
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
