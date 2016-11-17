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
    private String direction;
    private String imageName;
    private BufferedImage image;
    private boolean blockedMovement;
    private String  newImageName;
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
    
    /**
     * Scans in all of the information for each screen from the text file
     * @param input scanner for the text to be scanned into
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
        direction = split[0];
        imageName = split[1];
        blockedMovement = Boolean.parseBoolean(split[2]);

        // if this direction is not blocked than there will be a 
        // new location and direction
        if (!blockedMovement) {
            newImageName = split[3];

            newDirection = split[4].substring(0, 1);
        }

        // Load the image file 
        try {

            image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    /**
     * Acknowledging the location of the user
     *
     * @return the current location of the user
     */
    public String getImageName() {
        return imageName;
    }
    
    /**
     * Acknowledging the new location of the user
     * @return 
     */
    public String getNewImageName(){
        return newImageName;
    }
    
    // Acknowledging the new direction of the user
    public String getNewDirection(){
        return newDirection;
    }
    
    // Acknowledging if the direction one is choosing is blocked 
    public boolean isBlocked(){
        return blockedMovement;
    }

    /**
     * Load in the image of the adventure
     *
     * @return the image needed to be used
     */
    public BufferedImage getImage() {
        return image;
    }
}
