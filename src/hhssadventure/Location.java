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

    //A way to store all possible screens in an array 
    private ArrayList<Screen> screens;
    //String that stores the name of the place   

    public Location (String locationName, Scanner input) {
        //initialize array, since there are 4 lines, and 4 directions
        screens = new ArrayList<>();
             
        for (int i = 0; i <= 3; i++) {
            Screen scrn = new Screen(locationName, input);          
            screens.add(scrn);
        }
   
    }
    
    public ArrayList getScreens(){
        return screens;
    }
}
