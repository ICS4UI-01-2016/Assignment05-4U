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
   
    public Controller(GUI gui, Map map){
        this.gui = gui;
        this.map = map;
        
        
        // make sure the GUI can talk to you
        gui.setController(this);
        
        
    }

    Controller(GUI gui, Map map, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    }

