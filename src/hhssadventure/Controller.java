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
    private GUI gui;
    private Map map;
    private String Area;
    private String Direction;
    
    public Controller(GUI gui, Map map, String Area, String Direction){
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
    
    public void turnNorth(){
        // get the screen we are on right now
        this.Direction = "N";
        Screen newImage = map.getScreen(Area, Direction);
        gui.setImage(newImage.getImage());
        
    }
    public void turnEast(){
        // get the screen we are on right now
        this.Direction = "E";
        Screen newImage = map.getScreen(Area, Direction);
        gui.setImage(newImage.getImage());
        
    }
    public void turnSouth(){
        // get the screen we are on right now
        this.Direction = "S";
        Screen newImage = map.getScreen(Area, Direction);
        gui.setImage(newImage.getImage());
        
    }
    public void turnWest(){
        // get the screen we are on right now
        this.Direction = "W";
        Screen newImage = map.getScreen(Area, Direction);
        gui.setImage(newImage.getImage());
        
    }
    public void moveForwards(){
        Screen current = map.getScreen(Area, Direction);
        if(current.getCanMove()){
            this.Area = current.getAftrArea();
            this.Direction = current.getAftrDir();
            Screen newImage = map.getScreen(Area, Direction);
            gui.setImage(newImage.getImage());
        }
    }
    
}
