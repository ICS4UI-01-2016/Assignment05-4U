package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author munta
 */
public class Screen {
//insatnce variables 

    private BufferedImage image;
    private String locationName;
    private String direction;
    private boolean IsClear;
    private String nextLoc;
    private String nextDirection;

    public Screen(String LocationName, Scanner in) {
        //grab the first location
        this.locationName = LocationName;
        //scan the direction of location 
        this.direction = in.next();
        //scan in the image 
        String imageName=in.next();

        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
        }

        //check too see if front is clear 
        if (in.next().equals("true")) {
            this.IsClear = false;
            //else you can move
        } else {
            //set true 
            this.IsClear = true;
        }
        //if you have moved (was true) then you set the new direction and location 
        if (this.IsClear) {
            this.nextDirection = in.next();
            this.nextLoc = in.next();
        }

    }

    /**
     * get the current location
     *
     * @return the location
     */
    public String getlocationName() {
        return locationName;
    }

    /**
     * get the current direction
     *
     * @return the direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * builder to get the image
     *
     * @return the image
     */
    public BufferedImage getImage() {
        return this.image;
    }

    /**
     * get, if the front is clear or not
     *
     * @return isClear
     */
    public boolean getisClear() {
        return this.IsClear;
    }

    /**
     * get the next direction
     *
     * @return next direction
     */
    public String getNextDirection() {
        return this.nextDirection;
    }

    /**
     * get the next location
     *
     * @return next location
     */
    public String getNextLoc() {
        return this.nextLoc;
    }
}
