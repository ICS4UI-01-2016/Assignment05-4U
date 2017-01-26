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
    public String IMGNum;
    public String IMGDes;
    public String IMGBool;
    public String IMGDirect;
    public String IMGDirect2;
    public boolean north;
    public boolean south;
    public boolean east;
    public boolean west;
    public String NorthFaceIMG;
    public String EastFaceIMG;
    public String SouthFaceIMG;
    public String WestFaceIMG;

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

        this.IMGNum = (Split[1].substring(4, 8));
        this.IMGDirect = Split[0].substring(0, Split[0].length());
        this.IMGBool = Split[2].substring(0, Split[2].length());
        
        if (IMGBool.equals("false")) {
            this.IMGDes = Split[3].substring(0, Split[3].length());
            this.IMGDirect2 = Split[4].substring(0, Split[4].length());
        }

        // loading the image file
        try {
            image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }


        //get the possible directions
        if (IMGDirect.equals("N")) {
            if (IMGBool.equals("true")) {
                north = false;
            } else {
                north = true;
            }
        }
        if (IMGDirect.equals("E")) {
            if (IMGBool.equals("true")) {
                east = false;
            } else {
                east = true;
            }
        }
        if (IMGDirect.equals("S")) {
            if (IMGBool.equals("true")) {
                south = false;
            } else {
                south = true;
            }
        }
        if (IMGDirect.equals("W")) {
            if (IMGBool.equals("true")) {
                west = false;
            } else {
                west = true;
            }
        }

        //move to the next line

        String NorthFaceIMG = input.nextLine();
        input.nextLine();
        String EastFaceIMG = input.nextLine();
        input.nextLine();
        String WestFaceIMG = input.nextLine();
        input.nextLine();
        String SouthFaceIMG = input.nextLine();
    }

    /**
     * Locate and convert the file
     *
     * @return the buffered image for the screen
     */
    public BufferedImage SendHelpN() {
        try {
            image = ImageIO.read(new File("images/" + NorthFaceIMG));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    public BufferedImage SendHelpE() {
        try {
            image = ImageIO.read(new File("images/" + EastFaceIMG));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    public BufferedImage SendHelpS() {
        try {
            image = ImageIO.read(new File("images/" + WestFaceIMG));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    public BufferedImage SendHelpW() {
        try {
            image = ImageIO.read(new File("images/" + SouthFaceIMG));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    public String getIMGDirect() {
        return IMGDirect;
    }

    public String getIMGDes() {
        return IMGDes;
    }

    public String getIMGNum() {
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
