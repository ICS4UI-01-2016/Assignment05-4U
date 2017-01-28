/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import hhssadventure.GUI;
import hhssadventure.Map;
import hhssadventure.Screen;

/**
 *
 * @author moraj0721
 */
public class Controller {

    //all the private varibales 

    private GUI gui;
    private Map map;
    private String Location;
    private String Direction;

    /**
     * main builder for controller
     *
     * @param gui gui being used
     * @param map the map being used
     * @param Location the location the player is at
     * @param Direction the direction the player faces
     */
    public Controller(GUI gui, Map map, String Location, String Direction) {
        //set all variables 
        this.gui = gui;
        this.map = map;
        this.Location = Location;
        this.Direction = Direction;
        //create contact between controller and gui 
        gui.setController(this);

        //set the first screen and image  
        Screen first = map.getScreen(Location, Direction);
        gui.setImage(first.getImage());

    }

    /**
     * turn north direction
     */
    public void turnNorth() {
        this.Direction = "N";
        Screen newLoc = map.getScreen(Location, Direction);
        gui.setImage(newLoc.getImage());

    }

    /**
     * turn east direction
     */
    public void turnEast() {
        this.Direction = "E";
        Screen newLoc = map.getScreen(Location, Direction);
        gui.setImage(newLoc.getImage());

    }

    /**
     * turn south direction
     *
     */
    public void turnSouth() {
        this.Direction = "S";
        Screen newLoc = map.getScreen(Location, Direction);
        gui.setImage(newLoc.getImage());

    }

    /**
     * turn west direction
     */
    public void turnWest() {
        this.Direction = "W";
        Screen newLoc = map.getScreen(Location, Direction);
        gui.setImage(newLoc.getImage());

    }

    /**
     * move to the next location
     */
    public void moveNextLocation() {
        //get the screeen from the players location 
        Screen first = map.getScreen(Location, Direction);
        //check to see if player can move forward 
        if (first.getisClear()) {
            this.Location = first.getNextLoc();
            this.Direction = first.getNextDirection();
            //get image for new location
            Screen newLoc = map.getScreen(Location, Direction);
            //set the image for next location 
            gui.setImage(newLoc.getImage());
        }
    }

}
