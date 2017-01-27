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
     */
    public static void main(String[] args) throws FileNotFoundException {

        GUI gui = new GUI();
        
        gui.setVisible(true);
        
        School school = new School("images/pics.txt");
        
        String initialLocation = school.getInitialLocation();
        
        String initialDirection = school.getInitialDirection();
        
        Controller c = new Controller(gui, school, initialLocation, initialDirection);
    }
    
}
