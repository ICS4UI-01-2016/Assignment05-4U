/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author lamon
 */
public class RunGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create GUI (interface
        GUI gui = new GUI();
        
        //show the interface
        gui.setVisible(true);
        
        //create map
        Map map = new Map("images/pics.txt");
        
        LocationController c = new LocationController(gui, map, Caf1, N);
    }
    
}
