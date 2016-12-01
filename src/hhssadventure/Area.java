/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brayden
 */
public class Area {
    //private arrays assigned to the tile
    private ArrayList<Screen> screens;

    /**
     * construct the tile that will have 4 sub tiles attached to it each with a
     * direction
     *
     * @param tileName the name of the tile given in the pics.txt file
     * @param in the scanner being used to record the data
     */
    public Area(String areaName, Scanner in) {
        
        //create the arraylist containing all of the screens for the given area
        screens = new ArrayList<>();
        
        //make the 3 screens for the area
        for(int i = 0; i <= 3; i++){
            //make a new screen with the area name and the scanner
            Screen s = new Screen(areaName, in);
            //add the screen to the arrayList
            screens.add(s);
        }        
    }
    /**
     * return the arrayList
     * @return the screens arrayList
     */
    public ArrayList getScreens(){
        return screens;
    }
}
