/*
 * Screem Class Stores all Of the information of a specific screen within
 * the location (Map --> Location --> Screen).
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 EXAMPLE OF HOW USER MOVES THROUGH SCREEN
 N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)  <- Screen N
 */

/**
 *
 * @author richj0985, starwarslover1998, and tatad6701
*/
public class Screen {

    // Creating the constants to be used (instance variables)
    private String direction;
    private String imageName;
    private BufferedImage image;
    private boolean blockedMovement;
    private String newImageName;
    private String newDirection;

    /*
     Upstairs1
     N IMG_0045.JPG false Downstairs S(IMG_0138.JPG)
     E IMG_0046.JPG true
     S IMG_0047.JPG false Upstairs2 S(IMG_0052.JPG)
     W IMG_0049.JPG true
     */
    /**
     * Scans in all of the information for each screen from the text file
     *
     * @param input scanner for the text to be scanned into
     */
    public Screen(Scanner input) {

        // Read a line from the file of the form
        String line = "";
        try {
            line = input.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Split the line into it's pieces
        String[] split = line.split(" ");

        // Grab the specific direction
        direction = split[0];
        // Grab the specific image name
        imageName = split[1];
        // Grab the boolean if it is blocked or not
        blockedMovement = Boolean.parseBoolean(split[2]);

        // If this direction is not blocked than there will be a new location and direction
        if (!blockedMovement) {
            // Grab new image
            newImageName = split[3];
            // Grab the direction of the new image
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
     * Method that acknowledges the direction of the user
     *
     * @return the current direction of the user
     */
    public String getDirection() {
        // Return the direction of the image
        return direction;
    }

    /**
     * Method that acknowledges the location of the user
     *
     * @return the current location of the user
     */
    public String getImageName() {
        // Return the image name
        return imageName;
    }

    /**
     * Method that acknowledges the new location of the user
     *
     * @return the new location of the user
     */
    public String getNewImageName() {
        // Return the new location
        return newImageName;
    }

    /**
     * Method that acknowledges the new direction of the user
     *
     * @return the new direction of the image
     */
    public String getNewDirection() {
        // Return the new direction of the user
        return newDirection;
    }

    /**
     * Acknowledging if the direction one is choosing is blocked
     *
     * @return whether or not the movement is blocked
     */
    public boolean isBlocked() {
        // Return whether or not the user can move
        return blockedMovement;
    }

    /**
     * Load in the images of the HHSS adventure game
     *
     * @return the image needed to be used
     */
    public BufferedImage getImage() {
        // Return the image needed to be used
        return image;
    }
}
