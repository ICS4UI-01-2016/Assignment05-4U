/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;


import javafx.stage.Screen;

/**
 *
 * @author lamon
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       //create new interface
       GUI gui = new GUI();
       //show the interface
       gui.setVisible(true);
       
       //create the map
       Map map = new Map("images/pics.txt");
    }
    
    
        
}
