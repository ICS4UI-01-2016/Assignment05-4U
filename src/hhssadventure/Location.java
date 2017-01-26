package hhssadventure;



import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Location {

    // A way to store all possible screens in an array 
    private ArrayList<Screen> screens;

    /**
     * constructor to initialize all possible screens 
     * @param locationName
     * @param input 
     */
    public Location (String locationName, Scanner input) {
        // Initialize array, since there are 4 lines, and 4 directions
        screens = new ArrayList<>();
         
        // Makes 3 screens 
        for (int i = 0; i <= 3; i++) {
            Screen scrn = new Screen(locationName, input);          
            screens.add(scrn);
        }
   
    }
    
    /**
     * gets ArrayList of possible screens
     * @return ArrayList of possible screens 
     */
    public ArrayList getScreens(){
        return screens;
    }
}
