
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * An object to represent a single screen in a level
 *
 * @author hadik9595
 */
public class Screen {

    private String place;
    private String currentPlace;
 
    private BufferedImage image;
    private String nextPlace;
    private String nextDirection;
    private String direction;
    private String check;
    private boolean frontClear;

    /**
     * Using a scanner to create a new screen
     *
     * @param input A scanner containing screen info
     */
    public Screen(Scanner input) {

        //scans in the direction
        direction = input.next();

        //scan in the image 
        String imageName = input.next();


        //checks if boolean is false or not
        if (check.equals("false")) {
            frontClear = false;
            nextPlace = input.next();
            nextDirection = input.next();

        } else {
            frontClear = true;
            input.nextLine();
        }


        //move to next line 
        input.nextLine();


        //load the image file 
        try {
            image = ImageIO.read(new File("images/" + imageName + ".JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }








    }

    /**
     * get row of the screen
     *
     * @return the row of screen
     */

    public String getDirection(){
        return direction;
    }
    
    public String getNextPlace(){
        return nextPlace;
    }

    public String getCurrentPlace() {
        return currentPlace;
    }

    public BufferedImage getImage() {
        return image;
    }

    public boolean isFrontClear() {
        return frontClear;
    }

    public static void main(String[] args) {
    }
}
