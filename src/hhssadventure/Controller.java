/*
 * Controller Class allows for the user to click on the buttons on the interface (which are interconnected to the GUI)
 * and then move according to the direction clicked on. Methods of the directions are found here.
 */
package hhssadventure;

/**
 *
 * @author richj0985, starwarslover1998, and tatad6701
 */
public class Controller {

    // Create constants to be used (instance variables)
    // Create gui variable within controller
    private GUI gui;
    // Create map variable within controller
    private Map map;
    // Location variable within controller
    private String location;
    // Direction variable within controller
    private String direction;

    /**
     * Constructor for the controller
     *
     * @param gui Interconnects the controller and GUI
     * @param map Interconnects the controller and map
     */
    public Controller(GUI gui, Map map) {
        // Set instance variables with constructor
        this.gui = gui;
        this.map = map;
        
        // Set initial location and direction
        this.location = map.getInitialLocation();
        this.direction = map.getInitialDirection();

        // Make sure the GUI can talk to you!
        gui.setController(this);

        // Set the starting image
        Screen start = map.getScreen(location, direction);

        // Sets image, the the location/direction, and if it is blocked so it can be accessed in gui
        gui.setImage(start.getImage());
        gui.setScreenLabel();
        gui.setBlocked(start.isBlocked());
    }

    /**
     * Method that allows GET of current location
     */
    public String getLocation() {
        // return the current location
        return location;
    }

    /**
     * Method that allows GET of current direction
     */
    public String getDirection() {
        // return the current direction
        return direction;
    }

    /**
     * Method that allows for the user to turn North
     */
    public void turnNorth() {
        // Set direction to equal N
        direction = "N";
        
        // Find new screen
        Screen current = map.getScreen(location, direction);

        // Sets image, the the location/direction, and if it is blocked so it can be accessed in gui
        gui.setImage(current.getImage());
        gui.setScreenLabel();
        gui.setBlocked(current.isBlocked());
    }

    /**
     * Method that allows the user to turn East
     */
    public void turnEast() {
        // Set direction to equal E
        direction = "E";
        
        // Find new screen
        Screen current = map.getScreen(location, direction);

        // Sets image, the the location/direction, and if it is blocked so it can be accessed in gui
        gui.setImage(current.getImage());
        gui.setScreenLabel();
        gui.setBlocked(current.isBlocked());
    }

    /**
     * Method that allows the user to turn South
     */
    public void turnSouth() {
        // Set direction to equal S
        direction = "S";
        
        // Find new screen
        Screen current = map.getScreen(location, direction);

        // Sets image, the the location/direction, and if it is blocked so it can be accessed in gui
        gui.setImage(current.getImage());
        gui.setScreenLabel();
        gui.setBlocked(current.isBlocked());
    }

    /**
     * Method that allows the user to turn West
     */
    public void turnWest() {
        // Set direction to equal W
        direction = "W";
        
        // Find new screen
        Screen current = map.getScreen(location, direction);

        // Sets image, the the location/direction, and if it is blocked so it can be accessed in gui
        gui.setImage(current.getImage());
        gui.setScreenLabel();
        gui.setBlocked(current.isBlocked());
    }

    /**
     * Method that allows the user to move forward
     */
    public void goForward() {
        // Get the screen we are on right now
        Screen current = map.getScreen(location, direction);

        // Switching direction to face the new direction which was clicked
        // Ask if we can move forward
        if (current.isBlocked() == false) {
            // Set new location to the new Name
            location = current.getNewImageName();

            // Set new direction
            direction = current.getNewDirection();

            // Find new screen
            current = map.getScreen(location, direction);
        }

        // Sets image, the location/direction, and if it is blocked so it can be accessed in gui
        gui.setImage(current.getImage());
        gui.setScreenLabel();
        gui.setBlocked(current.isBlocked());
    }
}