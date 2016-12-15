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
    private String nextArea;
    private String nextDirection;
    private String intArea;
    private String intDirection;
    private boolean isBlocked;

    public Map(String fileName) {
        //initialize the list
        screens = new ArrayList<>();
        try {
            //make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));

            //for each area
            //first areas
            intArea = input.nextLine();
            intDirection = input.nextLine();
            //rest of areas/directions
            while (input.hasNext()) {
                String area = input.nextLine();
                System.out.println("AREA: " + area);

                for (int i = 0; i < 4; i++) {
                    String direction = input.next();
                    // print out what i got
                    System.out.println("Direction: " + direction);
                    String imageName = input.next();
                    // testing print out
                    System.out.println("image: " + imageName);
                    boolean isBlocked = input.nextBoolean();
                    // test what variable holds
                    System.out.println("Blocked? " + isBlocked);
                    if (isBlocked == false) {
                        nextArea = input.next();
                        System.out.println("nextAREA: " + nextArea);
                        nextDirection = input.next();
                        System.out.println("nextDirection: " + nextDirection);
                        Screen s = new Screen(area, direction, imageName, false, nextArea, nextDirection);
                        screens.add(s);
                    } else {
                        Screen s = new Screen(area, direction, imageName, true, null, null);
                        screens.add(s);
                    }
                    input.nextLine();
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
            if (area.equals(s.getArea()) && direction.equals(s.getDirection())) {
                // I found the screen
                return s;
            }
        }
        // no screen found
        return null;
    }

    public String getIntArea() {
        return intArea;
    }

    public String getIntDirection() {
        return intDirection;
    }

    public String getNextArea() {
        return nextArea;
    }

    public String getNextDirection() {
        return nextDirection;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public static void main(String[] args) {
    }
}