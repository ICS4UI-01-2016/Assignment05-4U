/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Brendan
 */
public class Screen {

    // instance variables 
    private String direction;
    private String locationName;
    private BufferedImage image;
    private boolean pathNotBlocked;
    private String secLocation;
    private String secDirection;

    /**
     * constructor of the screen
     * @param locationName the variable that contains the name of the location
     * @param in represents the scanner
     */
    public Screen(String locationName, Scanner in) {

        // take in the locations name and the direction of the first screen
        this.locationName = locationName;
        this.direction = in.next();
        // scan the name of the image in
        String imageName = in.next();
        /**
         * printStackTrace exception
         */
        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // if front is not clear then the path is blocked 
        if (in.next().equals("true")) {
            this.pathNotBlocked = false;
        // if the path is not blocked then it is true
        } else {
            this.pathNotBlocked = true;
        }
        // if it can move forwards then scan in the next location and direction
        if (this.pathNotBlocked) {
            this.secLocation = in.next();
            this.secDirection = in.next();
        }
    }
    /**
     * method to get the current location
     * @return the locations name
     */
    public String getLocation() {
        return this.locationName;
    }
    /**
     * method to get the current direction
     * @return the direction
     */
    public String getDirection() {
        return this.direction;
    }
    /**
     * method to get the current image
     * @return the current image
     */
    public BufferedImage getImage() {
        return this.image;
    }
    /**
     * method to determine whether or not the front is clear
     * @return whether or not the front is clear
     */
    public boolean getPathNotBlocked() {
        return this.pathNotBlocked;
    }
    /**
     * method to get the next location
     * @return the next location
     */
    public String getSecLocation() {
        return this.secLocation;
    }
    /**
     * method to get the next direction
     * @return the next direction
     */
    public String getSecDirection() {
        return this.secDirection;
    }
}
