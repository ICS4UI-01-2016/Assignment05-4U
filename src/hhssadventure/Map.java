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

    
    private String intArea;
    private String intDirection;
    
    public Map(String fileName) {
        //initialize the list
        screens = new ArrayList<>();
        try {
            //make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));

            //for each area
            //first areas
            String intArea = input.nextLine();
            String intDirection = input.nextLine();
            //rest of areas/directions
            while (input.hasNext()) {
                String area = input.nextLine();

                for (int i = 0; i < 4; i++) {
                    String direction = input.next();
                    String imageName = input.next();
                    boolean isBlocked = input.nextBoolean();
                    if (isBlocked == false) {
                        String nextArea = input.next();
                        String nextDirection = input.next();
                        Screen s = new Screen(area, direction, imageName, false, nextArea, nextDirection);
                        screens.add(s);
                    } else {
                        Screen s = new Screen(area, direction, imageName, true, null, null);
                    }
                    i++;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Screen getScreen(String area, String direction) {
        // go through each screen
        for (Screen s : screens) {
            // see if the row and col match
            if (s.getArea() == area && s.getDirection() == direction) {
                // I found the screen
                return s;
            }
        }
        // no screen found
        return null;
    }    
    
    public String getIntArea(){
        return intArea;
    }
    
    public String getIntDirection(){
        return intDirection;
    }
}
