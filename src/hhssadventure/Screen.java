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
     * @param locationName stores location name
     * @param input A scanner containing screen info
     */
    public Screen(String locationName, Scanner input) {
        
        // Checks the location
        this.locationName = locationName;
        
        // Checks the direction 
        this.direction = input.next();    
        
        // The image name is scanned 
        String imageName = input.next();

        // Load the image file
        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        // If next word is "true"
        if (input.next().equals("true")) {
            
            // Set clear to "false"
            this.clear = false;
        } else {
            // Set clear to "true"
            this.clear = true;
        }

        // If path is not clear
        if (this.clear) {
            
            // Moves forward to new location 
            this.newLocation = input.next();
            
            // Moves forward to new direction 
            this.newDirection = input.next();         
        }

    }

    /**
     * Gets the location name
     * @return the location name
     */
    public String getLocationName() {
        return this.locationName;
    }

    /**
     * Gets the current direction
     * @return the current direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * Gets the image
     * @return the image
     */
    public BufferedImage getImage() {
        return this.image;
    }

    /**
     * Gets the condition of front being clear
     * @return the condition of front being clear
     */
    public boolean clear() {
        return this.clear;
    }
    
    /**
     * Gets the new location
     * @return the new location
     */
    public String getNewLocation() {
        return this.newLocation;
    }

    /**
     * Gets the new direction
     * @return the new direction
     */
    public String getNewDirecton() {
        return this.newDirection;
    }

}
