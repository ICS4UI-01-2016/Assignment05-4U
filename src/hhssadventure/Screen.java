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

    private BufferedImage image;
    private String direction;
    private boolean clear;
    private String newLocation;
    private String locationName;
    private String newDirection;

    /**
     * Using a scanner to create a new screen
     *
     * @param locationName
     * @param input A scanner containing screen info
     */
    public Screen(String locationName, Scanner input) {
        this.direction = input.next();
        this.locationName = locationName;
        String imageName = input.next();

        // load the image file
        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();

        }

        if (input.next().equals("true")) {
            this.clear = false;
        } else {
            this.clear = true;
        }

        if (this.clear == false) {
            this.newLocation = input.next();
            this.newDirection = input.next();         
        }

    }

    public String getLocationName() {
        return this.locationName;
    }

    public String getDirection() {
        return this.direction;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public boolean clear() {
        return this.clear;
    }

    public String getNewLocation() {
        return this.newLocation;
    }

    public String getNewDirecton() {
        return this.newDirection;
    }

}
