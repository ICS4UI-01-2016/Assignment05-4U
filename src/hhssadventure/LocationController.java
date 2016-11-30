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
    // scan in the 4 possible directions of where you could be facing for that spot

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
        // get the screen we are on right now
        Screen current = map.getScreen(area, direction);
        if (direction.equals("N")) {
            // get the new screen
            Screen newScreen = map.getScreen(map.getNextArea(), map.getNextDirection());
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goEast() {
        // get the screen we are on right now
        Screen current = map.getScreen(area, direction);
            if (direction.equals("E")) {
            // get the new screen
            Screen newScreen = map.getScreen(map.getNextArea(), map.getNextDirection());
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goSouth() {
        // get the screen we are on right now
        Screen current = map.getScreen(area, direction);
        if (direction.equals("S")) {
            // get the new screen
            Screen newScreen = map.getScreen(map.getNextArea(), map.getNextDirection());
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goWest() {
        // get the screen we are on right now
        Screen current = map.getScreen(area, direction);
        if (direction.equals("W")) {
            // get the new screen
            Screen newScreen = map.getScreen(map.getNextArea(), map.getNextDirection());
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
}