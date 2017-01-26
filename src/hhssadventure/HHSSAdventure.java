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
    public static void main(String[] args) {
        // Creates the interface
        GUI gui = new GUI();

        // Shows the interface
        gui.setVisible(true);

        // Creates the map
        Map map = new Map("images/pics.txt");

        // Gets the starting location
        String startLocation = map.getStartLocation();

        // Gets the starting direction
        String startDirection = map.getStartDirection();

        // Create the controller
        Controller c = new Controller(gui, map, startLocation, startDirection);
    }
}
