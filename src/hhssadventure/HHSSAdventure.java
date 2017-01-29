/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.FileNotFoundException;

/**
 *
 * @author lamon
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        // creating the interface
        GUI gui = new GUI();
        // making the interface visible 
        gui.setVisible(true);
        // creating the map and the file which the pictures are in
        School school = new School("images/pics.txt");
        // getting the intial location for the school
        String initialLocation = school.getInitialLocation();
        // getting the intial direction for the school
        String initialDirection = school.getInitialDirection();
        // creating the controller for the game
        Controller c = new Controller(gui, school, initialLocation, initialDirection);
    }
    
}
