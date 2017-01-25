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
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // creates the interface
        GUI gui = new GUI();
        // shows the interface
        gui.setVisible(true);
        // creates the map
        Map map = new Map("images/pics.txt");
        // gets starting location and direction
        String startLocation = map.getStartLocation();
        String startDirection = map.getStartDirection();
        // create the controller
        Controller c = new Controller(gui, map, startLocation, startDirection);
    }
    
}
