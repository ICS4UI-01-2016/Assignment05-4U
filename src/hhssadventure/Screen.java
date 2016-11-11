/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author halll7908
 */
public class Screen {

    private int row;
    private int col;
    private BufferedImage image;
    private boolean north;
    private boolean east;
    private boolean south;
    private boolean west;

    /**
     * Using a scanner to create new screen
     *
     * @param input A scanner containing screen info
     */
    public Screen(Scanner input) {
        // Scan in the image name
        String imageName = input.next();
        // read in direction facing and then find corresponding image

        
        // load the image
        try {
            File file = new File("file.txt");
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                System.out.println(s.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // get possible directions
        north = input.nextBoolean();
        east = input.nextBoolean();
        south = input.nextBoolean();
        west = input.nextBoolean();

        // move to next Line
        input.nextLine();
    }

    public boolean canGoNorth() {
        return north;
    }

    public boolean canGoEast() {
        return east;
    }

    public boolean canGoSouth() {
        return south;
    }

    public boolean canGoWest() {
        return west;
    }

    public BufferedImage getImage() {
        return image;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Screen s = new Screen(in);
        
        // direction?
        System.out.println(s.canGoEast());
        System.out.println(s.getImage());
    }
    
    
}
