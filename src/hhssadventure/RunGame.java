/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author richj0985
 */
public class RunGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the interface
        GUI gui = new GUI();
        // show the interface
        gui.setVisible(true);
        
        // create the map
        Map map = new Map("images/pics.txt");
        
        // create the game controller
        Controller c = new Controller(gui, map, 8, 8);
    }
}
