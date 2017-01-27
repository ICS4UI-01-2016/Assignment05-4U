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
    
    private GUI gui;
    private School school;
    private String location;
    private String direction;
    
    public Controller(GUI gui, School school, String location, String direction) {
        
        this.gui = gui;
        this.school = school;
        this.location = location;
        this.direction = direction;
        
        gui.setController(this);
        
        Screen current = school.getScreen(location, direction);
        gui.setImage(current.getImage());
    }
    
    public void goNorth() {
        this.direction = "N";
        Screen newImage = school.getScreen(location, direction);
        gui.setImage(newImage.getImage());
    }
    
    public void goEast() {
        this.direction = "E";
        Screen newImage = school.getScreen(location, direction);
        gui.setImage(newImage.getImage());
    }
    
    public void goSouth() {
        this.direction = "S";
        Screen newImage = school.getScreen(location, direction);
        gui.setImage(newImage.getImage());
    }
    
    public void goWest() {
        this.direction = "W";
        Screen newImage = school.getScreen(location, direction);
        gui.setImage(newImage.getImage());
    }
    
    public void goForwards() {
        Screen current = school.getScreen(location, direction);
        
        if (current.getPathNotBlocked()) {
            
            this.location = current.getSecLocation();
            this.direction = current.getSecDirection();
            
            Screen newImage = school.getScreen(location, direction);
            
            gui.setImage(newImage.getImage());
        }
    }
    
}
