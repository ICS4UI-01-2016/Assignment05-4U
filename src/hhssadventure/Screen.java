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
 * @author moore3607
 */
public class Screen {

    private BufferedImage image;
    public int IMGNum;
    public String IMGDes;
    public String IMGDirect;
    public boolean north;
    public boolean south;
    public boolean east;
    public boolean west;

    /**
     * Using a scanner to create a new screen
     *
     * @param input A scanner containing screen info
     */
    public Screen(Scanner input) {
        // scan in the image name
        String imageName = input.next();
        //use the split to grab the image number
        String[] Split = imageName.split(" ");

        int IMGNum = Integer.parseInt(Split[1].substring(4, 8));
        String IMGDes = Split[3].substring(0, Split[3].length());
        String IMGDirect = Split[4].substring(0, Split[4].length());

        this.IMGNum = IMGNum;
        this.IMGDes = IMGDes;
        this.IMGDirect = IMGDirect;





        // loading the image file
        try {
            image = ImageIO.read(new File("images/" + imageName + ".JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }


        //get the possible directions
        north = input.nextBoolean();
        east = input.nextBoolean();
        south = input.nextBoolean();
        west = input.nextBoolean();

        //move to the next line
        input.nextLine();
    }
    
    public String getIMGDirect(){
        return IMGDirect;
    }

    public String getIMGDes() {
        return IMGDes;
    }

    public int getIMGNum() {
        return IMGNum;
    }

    public boolean canGoNorth() {
        return north;
    }

    public boolean canGoSouth() {
        return south;
    }

    public boolean canGoEast() {
        return east;
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
        


        System.out.println(s.canGoNorth());
        System.out.println(s.canGoSouth());
        System.out.println(s.canGoEast());
        System.out.println(s.canGoWest());
        System.out.println(s.getImage());
    }
}
