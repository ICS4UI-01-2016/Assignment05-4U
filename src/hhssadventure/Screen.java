package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Screen {
    
    // instance variables
    private String locationName;
    private String direction;
    private BufferedImage image;
    private boolean clear;
    private String newLocation;
    private String newDirection;
    
    /**
     * Using a scanner to create a new screen
     *
     * @param locationName
     * @param input A scanner containing screen info
     */
    public Screen(String locationName, Scanner input) {
        // checks the direction and location
        this.locationName = locationName;
        this.direction = input.next();      
        String imageName = input.next();

        // load the image file
        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        // if next word is "true"
        if (input.next().equals("true")) {
            // set clear to false
            this.clear = false;
        } else {
            // set clear to true
            this.clear = true;
        }

        // if path is not clear
        if (this.clear == false) {
            // moves forward
            this.newLocation = input.next();
            this.newDirection = input.next();         
        }

    }

    /**
     * gets the location name
     * @return the location name
     */
    public String getLocationName() {
        return this.locationName;
    }

    /**
     * gets the current direction
     * @return the current direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * gets the image
     * @return the image
     */
    public BufferedImage getImage() {
        return this.image;
    }

    /**
     * gets the condition of front being clear
     * @return the condition of front being clear
     */
    public boolean clear() {
        return this.clear;
    }
    
    /**
     * gets the new location
     * @return the new location
     */
    public String getNewLocation() {
        return this.newLocation;
    }

    /**
     * gets the new direction
     * @return the new direction
     */
    public String getNewDirecton() {
        return this.newDirection;
    }

}
