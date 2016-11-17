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

    public void goNorth() {
        System.out.println("Go North Clicked");
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // ask if we can move north
        if (current.isBlocked() == false) {

            location = current.getNewImageName();
            direction = current.getNewDirection();
            System.out.println("New Location: " + location);
            System.out.println("New Direction: " + direction);
            // get the new screen
            Screen newScreen = map.getScreen(location, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    public void turnNorth() {
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        direction = current.getNewDirection();
    }

    public void goSouth() {
        System.out.println("Go South Clicked");
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // ask if we can move south
        if (current.isBlocked() == false) {

            location = current.getNewImageName();
            direction = current.getNewDirection();
            // get the new screen
            Screen newScreen = map.getScreen(location, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    public void goEast() {
        System.out.println("Go East Clicked");
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // ask if we can move east
        if (current.isBlocked() == false) {

            location = current.getNewImageName();
            direction = current.getNewDirection();
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }
    }

    public void goWest() {
        System.out.println("Go West Clicked");
        // get the screen we are on right now
        Screen current = map.getScreen(location, direction);
        // Swtiching direction to face the new direction which was clicked
        // ask if we can move west
        if (current.isBlocked() == false) {
            System.out.println("Hello:");
            location = current.getNewImageName();
            // get the new screen
            System.out.println("New West: " + current);
            // set the image
            gui.setImage(current.getImage());
        }
    }

    public void turnWest() {
        // get the screen we are on right now
        // Set direction to equal W
        // Print screen
        Screen current = map.getScreen(location, direction);
        System.out.println("Current img: " + current.getImageName());
        System.out.println("Start Direction: " + direction);
        direction = current.getNewDirection();
        System.out.println("New Direction: " + direction);
        current = map.getScreen(location, direction);
        System.out.println("New West: " + current);
        // set the image
        gui.setImage(current.getImage());
    }
}
