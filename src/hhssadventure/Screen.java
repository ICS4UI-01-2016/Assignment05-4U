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
 * @author brayden
 */
public class Screen {

    //instance variables
    private String areaName;
    private String direction;
    private BufferedImage image;
    private boolean canMove;
    private String aftrArea;
    private String aftrDir;

    /**
     * Constructor of the screen
     *
     * @param AreaName string containing the area name
     * @param in the scanner
     */
    public Screen(String AreaName, Scanner in) {
        //pass in area name and direction of intial area
        this.areaName = AreaName;
        this.direction = in.next();
        //scan in image name
        String imageName = in.next();
        //catch printStackTrace exception
        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //if front is not clear set canMove to false
        if (in.next().equals("true")) {
            this.canMove = false;
            //if front is clear set canMove to true
        } else {
            this.canMove = true;
        }
        //can canMove is true scan in the following area and direction
        if (this.canMove) {
            this.aftrArea = in.next();
            this.aftrDir = in.next();
        }
    }

    /**
     * accessor method to get current area
     *
     * @return current area
     */
    public String getAreaName() {
        return this.areaName;
    }

    /**
     * accessor method to get current direction
     *
     * @return current direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * accessor method to get current image
     *
     * @return current image
     */
    public BufferedImage getImage() {
        return this.image;
    }

    /**
     * accessor method to get whether front is clear
     *
     * @return can move boolean
     */
    public boolean getCanMove() {
        return this.canMove;
    }

    /**
     * accessor method to get next area
     *
     * @return next area
     */
    public String getAftrArea() {
        return this.aftrArea;
    }

    /**
     * accessor method to get next direction
     *
     * @return next direction
     */
    public String getAftrDir() {
        return this.aftrDir;
    }

}
