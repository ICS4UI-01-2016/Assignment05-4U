/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hhssadventure;


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
    }
}