/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author tatad6701
 */
public class Screen {
    
    // Creating the constants to be used (instance variables)
    private String  direction;
    private String  imageName;
    private BufferedImage image;
    private boolean blockedMovement;
    private String  newLocation;
    private String  newDirection;
/*
    private boolean east;
    private boolean south;
    private boolean west;
    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;
*/
    
/*
Upstairs1
N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)
E IMG_0046.JPG true
S IMG_0047.JPG false Upstairs2 S(IMG_0052.JPG)
W IMG_0049.JPG true
*/
    public Screen(Scanner input) {
        
        // Read a line from the file of the form
        // N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)
        String line = ""; 
        try {
           line = input.nextLine();
        } catch (Exception e) {
           e.printStackTrace();
        }

        // Split the line into it's pieces
        String[] split = line.split(" ");

        // load up the locations object variables
        direction       = split[0];
        imageName       = split[1];
        blockedMovement = Boolean.parseBoolean( split[2] );
        
        // if this direction is not blocked than there will be a 
        // new location and direction
        if ( ! blockedMovement ) {
            newLocation  = split[3];
            System.out.println("New Location: " + newLocation);
            newDirection = split[4].substring(0, 1);
            System.out.println("New Direction: " + newDirection);
        }
   
        // Load the image file 
        try {
            System.out.println("");
            System.out.println("Image: " + imageName);
            image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }

        
/*        
        // Setting the direction of the pictures based off of pic.txt file 
        if (split[0].equals("N")) {
            direction = 0;
        }
        else if (split[0].equals("E")) {
            direction = 1;
        }
        else if (split[0].equals("S")) {
            direction = 2;
        }
        else if (split[0].equals("W")) {
            direction = 3;
        }
        // Getting the very first letter of the pics.txt file which is the direction
        direction = split[0].charAt(0);


        // Intake the place above the direction && Intake the place ALWAYS beside false
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
 */
    }

   
    /**
     * Acknowledging the location of the user
     *
     * @return the current location of the user
     */
    public String getImageName() {
       return imageName;
    }

    /*
     *
     * Acknowledging the direction of the user
     *
     * @return the current direction of the user
     */
    public String getDirection() {
        return direction;
    }
    
    public String getNewImageName(){
        
    }
    /**
     * Depicts whether the user can go north or not
     *
     * @return if user is able to move north (true) or not (false)
     */
    public boolean canGoNorth() {
    //    return north;
        return false;
    }

    /**
     * Depicts whether the user can go east or not
     *
     * @return if the user can move east (true) or not (false)
     */
    public boolean canGoEast() {
    //    return east;
        return false;
    }

    /**
     * Depicts whether the user can go south or not
     *
     * @return if the user can move south (true) or not (false)
     */
    public boolean canGoSouth() {
    //    return south;
        return false;
    }

    /**
     * Depicts whether the user can go west or not
     *
     * @return if the user can move west (true) or not (false)
     */
    public boolean canGoWest() {
     //   return west;
        return false;
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
