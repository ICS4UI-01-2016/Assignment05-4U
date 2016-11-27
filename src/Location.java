
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class Location {
    //Storing a list of all screens in the location in a private variable
    private ArrayList<Screen> screens;
    //A way to store all possible screens in an array in a private variable
    private Screen[] locationScreens;
    //String that stores the name of the place in private variable
    private String locationName;
    // contains all directions in a private variable
    private String[] directions;
    //direction is stored as an integer so that it can be easily manipulated 
    int currentDirection;

    /**
     * constructor for location that scans in all 4 corresponding screens
     *
     * @param input the input used to read in the images
     */
    public Location(Scanner input) {
        //initialize array, since there are 4 lines, and 4 directions
        //having directions coorelate to numbers make orientation much easier, each slot contains a corresponding direction
        directions = new String[]{"N", "E", "S", "W"};
        //initialize variable that stores location name
        locationName = input.next();
        //initialize location array to store 4 screens
        locationScreens = new Screen[4];
        //initialize list to store screens
        screens = new ArrayList<>();

        //make screens 4 times            
        for (int i = 0; i < 4; i++) {
            Screen s = new Screen(input);
            // each slot of an array represents direction, each direction is given a screen
            screens.add(s);
        }

    }

    /**
     * Returns the location name
     *
     * @return the location name
     */
    public String getLocationName() {
        return this.locationName;
    }

    /**
     * Returns screen corresponding to the direction
     * @param direction the current direction
     * @return the screen corresponding to the direction
     */
    public Screen getScreen(String direction) {
        //go through the list of screens
        for (Screen s : screens) {
            //when the match in directions is found return the corresponding screen
            if (s.getDirection().equals(direction)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }

}
