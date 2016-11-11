/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author tatad6701
 */
public class Screen {

    // Creating the constants to be used (instance variables)
    private char location;
    private int direction;
    private BufferedImage image;
    private boolean north;
    private boolean east;
    private boolean south;
    private boolean west;
    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    public Screen(Scanner input) {
        // Scan in the image name
        String imageName = input.nextLine();

        // Split the string to grab location and direction
        String[] split = imageName.split("false");
        // Save the location - gets rid of ... 

        // Setting the direction of the pictures based off of pic.txt file 
        if (split[0].equals("N")) {
            direction = 0;
        }
        if (split[0].equals("E")) {
            direction = 1;
        }
        if (split[0].equals("S")) {
            direction = 2;
        }
        if (split[0].equals("W")) {
            direction = 3;
        }
        // Getting the very first letter of the pics.txt file which is the direction
        direction = split[0].charAt(0);


        //* Intake the place above the direction && Intake the place ALWAYS beside false
        if (split[0].equals(split[1])) {
            location = 
        }
        location = Integer.parseInt(split[2].substring(1));

        // Load the image file 
        try {
            image = ImageIO.read(new File("images/" + imageName + ".JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Getting the possible directions
        north = input.nextBoolean();
        east = input.nextBoolean();
        south = input.nextBoolean();
        west = input.nextBoolean();

        // boolean blocked = input.nextBoolean();

        // Move to the next line
        input.nextLine();
    }

    /**
     * Acknowledging the location of the user
     *
     * @return the current location of the user
     */
    public String getLocation() {
        return location;
    }

    /**
     * Acknowledging the direction of the user
     *
     * @return the current direction of the user
     */
    public int getDirection() {
        return direction;
    }

    public void north() {
    }

    /**
     * Depicts whether the user can go north or not
     *
     * @return if user is able to move north (true) or not (false)
     */
    public boolean canGoNorth() {
        return north;
    }

    /**
     * Depicts whether the user can go east or not
     *
     * @return if the user can move east (true) or not (false)
     */
    public boolean canGoEast() {
        return east;
    }

    /**
     * Depicts whether the user can go south or not
     *
     * @return if the user can move south (true) or not (false)
     */
    public boolean canGoSouth() {
        return south;
    }

    /**
     * Depicts whether the user can go west or not
     *
     * @return if the user can move west (true) or not (false)
     */
    public boolean canGoWest() {
        return west;
    }

    /**
     * Load in the image of the adventure
     *
     * @return the image needed to be used
     */
    public BufferedImage getImage() {
        return image;
    }

    public static void main(String[] args) {
    }
}
