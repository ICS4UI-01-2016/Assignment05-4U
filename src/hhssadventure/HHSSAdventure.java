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
public class HHSSAdventure {    //main method

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    //main method
       //create new interface
       GUI gui = new GUI(); //creates a new gui
       //show the interface
       gui.setVisible(true);    //set the visibility of the gui to be true
       
       //create the map
       Map map = new Map("images/pics.txt");    //the new map will have the pics from uploaded to netbeans
    
       Controller c = new Controller(gui, map); //the variable c is set to the controller
    }       
}
