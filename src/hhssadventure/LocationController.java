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
    private char area;
    // direction facing
    private char direction;

    public LocationController(GUI gui, Map m, char area, char direction) {
        this.gui = gui;
        this.map = map;
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
        if (current.canGoNorth()) {
            
            // get the new screen
            Screen newScreen = map.getScreen(area, direction);
            // set the image
            gui.setImage(newScreen.getImage());
        }
}
