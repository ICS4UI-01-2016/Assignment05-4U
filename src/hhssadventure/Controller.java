package hhssadventure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brayden
 */
public class Controller {

    //create the private variables
    private GUI gui;
    private Map map;
    private String Area;
    private String Direction;

    /**
     * the constructor for the controller
     *
     * @param gui graphics interface unit being used
     * @param map map being used
     * @param Area the current area the player is on
     * @param Direction the current direction the player is facing
     */
    public Controller(GUI gui, Map map, String Area, String Direction) {
        //assign all of the variables
        this.gui = gui;
        this.map = map;
        this.Area = Area;
        this.Direction = Direction;

        // make sure the GUI can talk to you
        gui.setController(this);

        // set the starting image
        Screen current = map.getScreen(Area, Direction);
        gui.setImage(current.getImage());
    }

    /**
     * turn the screen north
     */
    public void turnNorth() {
        // make the current direction as north
        this.Direction = "N";
        //get the new screen with the given direction
        Screen newImage = map.getScreen(Area, Direction);
        //set the new image
        gui.setImage(newImage.getImage());

    }

    /**
     * turn the screen east
     */
    public void turnEast() {
        // make the current direction as east
        this.Direction = "E";
        //get the new screen with the given direction
        Screen newImage = map.getScreen(Area, Direction);
        //set the new image
        gui.setImage(newImage.getImage());

    }

    /**
     * turn the screen south
     */
    public void turnSouth() {
        // make the current direction as south
        this.Direction = "S";
        //get the new screen with the given direction
        Screen newImage = map.getScreen(Area, Direction);
        //set the new image
        gui.setImage(newImage.getImage());

    }

    /**
     * turn the screen west
     */
    public void turnWest() {
        // make the current direction as west
        this.Direction = "W";
        //get the new screen with the given direction
        Screen newImage = map.getScreen(Area, Direction);
        //set the new image
        gui.setImage(newImage.getImage());

    }

    /**
     * move the player forward one area tile
     */
    public void moveForwards() {
        //the current screen is obtained with the area and direction variables
        Screen current = map.getScreen(Area, Direction);
        //if the the player is able to move forward
        if (current.getCanMove()) {
            //move foward
            this.Area = current.getAftrArea();
            //get the new direction
            this.Direction = current.getAftrDir();
            //get the new image for the present tile
            Screen newImage = map.getScreen(Area, Direction);
            //set the new image
            gui.setImage(newImage.getImage());
        }
    }

}
