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
    private int row;
    private int col;
    
    public Controller(GUI gui, Map map, int row, int col){
        this.gui = gui;
        this.map = map;
        this.row = row;
        this.col = col;
        
        // make sure the GUI can talk to you
        gui.setController(this);
        
        screen start = map.getScreen(row);
       gui.setImage(start.getImage());
    
    }
    
    public void goNorth(){
        //get the screen we are on rn
        screen current = map.getScreen(row);
        //ask if we can go north
        if(current.canGoNorth()){
         //move up a row
         row--;
         //get the new screen
         screen newscreen = map.getScreen(row);
         //set the imgae 
         gui.setImage(newscreen.getImage());
        }
    }
}
