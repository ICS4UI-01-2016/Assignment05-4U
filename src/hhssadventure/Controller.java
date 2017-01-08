package hhssadventure;

import java.awt.image.BufferedImage;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class Controller {

    private GUI gui;
    private Map map;
    private String location;
    private String direction;
    
    public Controller(GUI gui, Map map, String location, String direction) {
        this.gui = gui;
        this.map = map;
        this.location = map.getStartLocation();
        this.direction = map.getStartDirection();

        gui.setController(this);
        // set the starting image
        Screen current = map.getScreen(location, direction);
        gui.setImage(current.getImage());

    }

    public void moveForward() {
        Screen current = map.getScreen(location, direction);
        if (current.clear(direction)) {
            this.location = current.getNewLocation();
            this.direction = current.getNewDirecton();
            Screen newScreen = map.getScreen(location, direction);
            gui.setImage(newScreen.getImage());
        }

    }

    public void lookNorth() {
        this.direction = "N";
        Screen newScreen = map.getScreen(location, direction);
        gui.setImage(newScreen.getImage());

    }

    public void lookEast() {
        this.direction = "E";
        Screen newScreen = map.getScreen(location, direction);
        gui.setImage(newScreen.getImage());

    }

    public void lookSouth() {
        this.direction = "S";
        Screen newScreen = map.getScreen(location, direction);
        gui.setImage(newScreen.getImage());

    }

    public void lookWest() {
        this.direction = "W";
        Screen newScreen = map.getScreen(location, direction);
        gui.setImage(newScreen.getImage());

    }
}
