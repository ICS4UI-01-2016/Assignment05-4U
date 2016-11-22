/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the interface
        GUI gui = new GUI();

        // Show the interface
        gui.setVisible(true);

        // Create the map and grab images from the "images" folder
        Map map = new Map("images/pics.txt");

        // Create the game controller and connect it to both the GUI and the map
        Controller c = new Controller(gui, map);
    }
}
