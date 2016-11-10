/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author richj0985
 */
public class Map {

    private ArrayList<Screen> screens;

    public Map(String fileName) {
        // initialize the list
        screens = new ArrayList<>();
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            // Make screens
            // loop to the end of the file
            while (input.hasNext()) {
                // creating a screen from the scanner
                Screen s = new Screen(input);
                // added the created screen to the list
                screens.add(s);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Screen getScreen(int location, int direction) {
        // go through each screen each time ******************
        for (Screen s : screens) {
            // see if the row and col match
            if (s.getLocation() == location && s.getDirection() == direction) {
                // I found the screen
                return s;
            }
        }
        // no screen found
        return null;
    }
}
