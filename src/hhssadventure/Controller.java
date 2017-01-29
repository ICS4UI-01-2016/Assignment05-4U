/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author Brendan
 */
public class Controller {
    
    // the variables for the GUI class
    private GUI gui;
    private School school;
    private String location;
    private String direction;
    
    /**
     * constructor for the controller of the game
     * @param gui gui that is getting used 
     * @param school the map of the pictures being used
     * @param location the current location of the school
     * @param direction the direction that is being faced
     */
    public Controller(GUI gui, School school, String location, String direction) {
        
        // assigning the variables to their respective variables
        this.gui = gui;
        this.school = school;
        this.location = location;
        this.direction = direction;
        
        // making the gui be able to talk to the controller 
        gui.setController(this);
        
        // set the starting image to the first image
        Screen current = school.getScreen(location, direction);
        gui.setImage(current.getImage());
    }
    
    /**
     * makes the screen turn north
     */
    public void goNorth() {
        // make the direction equal north
        this.direction = "N";
        // get the new direction for the new screen
        Screen newImage = school.getScreen(location, direction);
        // set the new image if moved north
        gui.setImage(newImage.getImage());
    }
    
    /**
     * makes the screen turn east 
     */
    public void goEast() {
        // make the direction equal east
        this.direction = "E";
        // get the new direction for the new screen
        Screen newImage = school.getScreen(location, direction);
        // set the new image if moved east
        gui.setImage(newImage.getImage());
    }
    
    public void goSouth() {
        // make the direction equal south
        this.direction = "S";
        // get the new direction for the new screen
        Screen newImage = school.getScreen(location, direction);
        // set the new image if moved south
        gui.setImage(newImage.getImage());
    }
    
    public void goWest() {
        // make the direction equal west
        this.direction = "W";
        // get the new direction for the new screen
        Screen newImage = school.getScreen(location, direction);
        // set the new image if moved west
        gui.setImage(newImage.getImage());
    }
    
    /**
     * move one screen forwards if it is possible 
     */
    public void goForwards() {
        // the screen that is selected is gained along with the location and direction
        Screen current = school.getScreen(location, direction);
        // if the path is not blocked do the following
        if (current.getPathNotBlocked()) {
            // get the new location
            this.location = current.getSecLocation();
            // get the new direction
            this.direction = current.getSecDirection();
            // get the new image for the part of the school
            Screen newImage = school.getScreen(location, direction);
            // set the new image
            gui.setImage(newImage.getImage());
        }
    }
    
}
