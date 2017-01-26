package hhssadventure;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Controller {

    // Create instance variables to be used
    // Create gui variable within controller
    private GUI gui;
    // Create map variable within controller
    private Map map;
    // Location variable within controller
    private String location;
    // Direction variable within controller
    private String direction;

    /**
     * constructor for controller
     *
     * @param guiInterconnects the controller and GUI
     * @param map Interconnects the controller and map
     * @param location
     * @param direction
     */
    public Controller(GUI gui, Map map, String location, String direction) {
        // Set instance variables with constructor
        this.gui = gui;
        this.map = map;

        // Set initial location and direction
        this.location = map.getStartLocation();
        this.direction = map.getStartDirection();

        // Make sure gui can talk to you
        gui.setController(this);

        // Set the starting image
        Screen current = map.getScreen(location, direction);
        gui.setImage(current.getImage());

    }

    /**
     * Method that allows the user to move forward
     */
    public void moveForward() {
        // Get the screen we are on right now
        Screen current = map.getScreen(location, direction);

        // Switching direction to face the new direction which was clicked
        // Ask if we can move forward
        if (current.clear()) {

            // Set new location to the new Name
            this.location = current.getNewLocation();

            // Set new direction
            this.direction = current.getNewDirecton();

            // Get the new screen we are on right now
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }

    }

    /**
     * Method allows for the user to turn North
     */
    public void lookNorth() {
        // Set direction to equal North 
        this.direction = "N";
        // Find new screen
        Screen newScreen = map.getScreen(location, direction);
        // Set the new image
        gui.setImage(newScreen.getImage());

    }

    /**
     * Method allows for the user to turn East
     */
    public void lookEast() {
        // Set direction to equal East 
        this.direction = "E";
        // Find new screen
        Screen newScreen = map.getScreen(location, direction);
        // Set the new image
        gui.setImage(newScreen.getImage());

    }

    /**
     * Method allows for the user to turn South
     */
    public void lookSouth() {
        // Set direction to equal South 
        this.direction = "S";
        // Find new screen
        Screen newScreen = map.getScreen(location, direction);
        // Set the new image
        gui.setImage(newScreen.getImage());

    }

    /**
     * Method allows for the user to turn West
     */
    public void lookWest() {
        // Set direction to equal West 
        this.direction = "W";
        // Find new screen
        Screen newScreen = map.getScreen(location, direction);
        // Set the new image
        gui.setImage(newScreen.getImage());

    }
}
