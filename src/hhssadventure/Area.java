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
        
        screens = new ArrayList<>();
        
        for(int i = 0; i <= 3; i++){
            Screen s = new Screen(areaName, in);
        }        
    }
    public ArrayList getScreens(){
        return screens;
    }
}
