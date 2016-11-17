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

            //starting location
            String startArea = input.nextLine();
            String startDirection = input.nextLine();
           
            //for each area
            while(true){
            String area = input.nextLine();
            String direction = input.nextLine();  
            String imageName = input.next();
            Boolean bool = input.nextBoolean();
            if(bool == false){
            String nextArea = input.next();
            String nextDirection = input.next();
            }
            break;
             }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Screen getScreen() {
        // go through the pics.txt file and 'locate' our next screen
        for (Screen s : screens){
            // compare new direction to directions underneath title of screen
            
        }
        // no screen found
        return null;
    }
}
