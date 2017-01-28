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
 * @author Muntake
 */
public class Location {

    //new private array for one location 

    private ArrayList<Screen> screens;

    /**
     *
     * @param locationName the name of the location (image file)
     * @param input //the scanner
     */
    public Location(String locationName, Scanner input) {
        //actually create array
        screens = new ArrayList<>();
        //makes the 3 screens for each location 
        for (int i = 0; i <= 3; i++) {
        Screen s= new Screen(locationName, input);//error 
            
            //add the screens to the array 
            screens.add(s);
        }
    }

    /**
     * return the screens
     *
     * @return screens
     */
    public ArrayList<Screen> getScreens() {
        return screens;
    }

}
