
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class ControllerAdventure {

    private GUIAdventure gui;
    private MapAdventure map;
    private String location;
    private String direction;
    
    public ControllerAdventure(GUIAdventure gui, MapAdventure map, String location, String direction) {
        this.gui = gui;
        this.map = map;
        this.location = map.getStartLocation();
        this.direction = map.getStartDirection();

        gui.setController(this);
        // set the starting image
        ScreenAdventure current = map.getLocation(location, direction);
        gui.setImage(current.getImage());

    }

    public void moveForward() {
        ScreenAdventure current = map.getLocation(location, direction);
        if (current.clear(direction) == false) {
            this.location = current.getNewLocation();
            this.direction = current.getNewDirecton();
            ScreenAdventure newScreen = map.getLocation(location, direction);
            gui.setImage(newScreen.getImage());
        }

    }

    public void lookNorth() {
        this.direction = "N";
        ScreenAdventure newScreen = map.getLocation(location, direction);
        gui.setImage(newScreen.getImage());

    }

    public void lookEast() {
        this.direction = "E";
        ScreenAdventure newScreen = map.getLocation(location, direction);
        gui.setImage(newScreen.getImage());

    }

    public void lookSouth() {
        this.direction = "S";
        ScreenAdventure newScreen = map.getLocation(location, direction);
        gui.setImage(newScreen.getImage());

    }

    public void lookWest() {
        this.direction = "W";
        ScreenAdventure newScreen = map.getLocation(location, direction);
        gui.setImage(newScreen.getImage());

    }
}
