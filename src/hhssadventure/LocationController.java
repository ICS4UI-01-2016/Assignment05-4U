/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author halll7908
 */
public class LocationController {

    private GUI gui;
    private Map map;
    // area name
    private String area;
    // direction facing
    private String direction;

    public LocationController(GUI gui, Map m, String area, String direction) {
        this.gui = gui;
        this.map = m;
        this.area = area;
        this.direction = direction;

        // make sure GUI can communicate
        gui.setController(this);
        // set starting image
        Screen start = map.getScreen(area, direction);
        gui.setImage(start.getImage());
    }

    public void goNorth() {
        if (direction.equals("W")) {
            moveForward();
        } else {
            // get the screen we are on right now
            Screen current = map.getScreen(area, "W");

            // get the new screen
            Screen newScreen = map.getScreen(area, "W");
            direction = "W";
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    public void goEast() {
        if (direction.equals("E")) {
            moveForward();
        } else {
            // get the screen we are on right now
            Screen current = map.getScreen(area, "E");

            // get the new screen
            Screen newScreen = map.getScreen(area, "E");
            direction = "E";
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    public void goSouth() {
        if (direction.equals("S")) {
            moveForward();
        } else {
            // get the screen we are on right now
            Screen current = map.getScreen(area, "S");

            // get the new screen
            Screen newScreen = map.getScreen(area, "S");
            direction = "S";
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    public void goWest() {
        if (direction.equals("W")) {
            moveForward();
        } else {
            // get the screen we are on right now
            Screen current = map.getScreen(area, "W");

            // get the new screen
            Screen newScreen = map.getScreen(area, "W");
            direction = "W";
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    private void moveForward() {
        // get the screen we are on right now
        Screen current = map.getScreen(area, direction);

        if (!current.isBlocked()) {
            // get the new screen
            Screen newScreen = map.getScreen(current.getNextArea(), current.getNextDirection());
            area = current.getNextArea();
            direction = current.getNextDirection();
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
}