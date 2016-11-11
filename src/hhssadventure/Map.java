/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halll7908
 */
public class Map {

    private ArrayList<Screen> screens;

    public Map(String fileName) {
        //initialize the list
        screens = new ArrayList<>();
        try {
            //make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));

            //make screens
            //loop to the end of the file
            while (input.hasNext()) {
                //creating a screen from the scanner
                Screen s = new Screen(input);
                //added the created screen to the list
                screens.add(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  public Screen getScreen()
          
}
