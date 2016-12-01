/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author brayden
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        // create the interface
        GUI gui = new GUI();
        // show the interface
        gui.setVisible(true);

        // create the map
        Map map = new Map("images/pics.txt");

        //get the starting area for the user
        String startArea = map.getStartArea();

        //get the starting direction for the user
        String startDirection = map.getStartDirection();

        // create the game controller
        Controller c = new Controller(gui, map, startArea, startDirection);

    }

}
