/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author Munt
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //carte new graphics interface
        GUI gui = new GUI();
        //set the gui to be visible
        gui.setVisible(true);
        //create the map 
        Map map = new Map("images/pics.txt");//error
        System.out.println(map);
        //create the statring location
        String firstLoc = map.getFirstLocation();
        //set the startin location 
        String firstDirection = map.getFirstDirection();
        //actually craete the controller 
        Controller c = new Controller(gui, map, firstLoc, firstDirection);

    }

}
