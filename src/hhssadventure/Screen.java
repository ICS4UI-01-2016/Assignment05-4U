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

    private String location;
    private String direction;
    private BufferedImage image;
    private int height;
    private int width;
    private boolean north;
    private boolean east;
    private boolean south;
    private boolean west;

    public Screen(Scanner input) {
                
        // Scan in the image name
        String location = input.next();
        
        String Direction = input.next();
//        // Split the string to grab row and column 
//        String[] split = imageName.split(" ");
//        // Save the location - gets rid of ... 
//        location = Integer.parseString(split[1].substring(1));
//        // Save the direction = gets rid of ...
//        direction = Integer.parseInt(split[2].substring(1));
        
        // Load the image file 
        try {
            image = ImageIO.read(new File("images/" + imageName + ".JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Getting the possible directions
//        north = input.nextBoolean();
//        east = input.nextBoolean();
//        south = input.nextBoolean();
//        west = input.nextBoolean();
        
        boolean blocked = input.nextBoolean();

        // Move to the next line
        input.nextLine();
    }

    public String getLocation() {
        return location;
    }

    public String getDirection() {
        return direction;
    }

    public void north(){
        
    }
    
    /**
     * Depicts whether the user can go north or not
     *
     * @return *******************************************
     */
    public boolean canGoNorth() {
        return north;
    }

    /**
     * Depicts whether the user can go east or not
     *
     * @return ********************************************
     */
    public boolean canGoEast() {
        return east;
    }

    /**
     * Depicts whether the user can go south or not
     *
     * @return ********************************************
     */
    public boolean canGoSouth() {
        return south;
    }

    /**
     * Depicts whether the user can go west or not
     *
     * @return ********************************************
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
