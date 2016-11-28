/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hhssadventure;

import javafx.stage.Screen;



/**
 *
 * @author Ajay
 */
public class Controller {
    private GUI gui;
    private Map map;
    String Location;
    String Direction;
            
   
    public Controller(GUI gui, Map map){
        this.gui = gui;
        this.map = map;
        this.Location = map.getStartLoc();
        this.Direction = map.getStartDir();
        
        
        // make sure the GUI can talk to you
        gui.setController(this);
        screen start = map.getScreen(Location, Direction);
        gui.setImage(start.getImage());
        gui.Direction(Direction);
        gui.isBlocked(start.isBlocked());
    }
    
    public void north(){
        screen start = map.getScreen(Location, Direction);
        Direction = "N";
        start = map.getScreen(Location, Direction);
        gui.setImage(start.getImage());
        gui.Direction(Direction);
        gui.isBlocked(start.isBlocked());
    }
    
    public void south(){
        screen start = map.getScreen(Location, Direction);
        Direction = "S";
        start = map.getScreen(Location, Direction);
        gui.setImage(start.getImage());
        gui.Direction(Direction);
        gui.isBlocked(start.isBlocked());
    }
    
    public void west(){
        screen start = map.getScreen(Location, Direction);
        Direction = "W";
        start = map.getScreen(Location, Direction);
        gui.setImage(start.getImage());
        gui.Direction(Direction);
        gui.isBlocked(start.isBlocked());
    }
    
    public void east(){
        screen start = map.getScreen(Location, Direction);
        Direction = "E";
        start = map.getScreen(Location, Direction);
        gui.setImage(start.getImage());
        gui.Direction(Direction);
        gui.isBlocked(start.isBlocked());
    }
    
    public void forward(){
    screen start = map.getScreen(Location, Direction);
    if(start.isBlocked() == false){
        Direction = start.getNextDirection();
        start = map.getScreen(Location, Direction);
    }
        gui.setImage(start.getImage());
        gui.Direction(Direction);
        gui.isBlocked(start.isBlocked());
    }
    
    
    }

