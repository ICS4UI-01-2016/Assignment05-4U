
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
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

    //create private variable storing name of the image
    private String imageName;
    //create private variable storing the image of the screen
    private BufferedImage image;
    //create private variable that stores next location associated with it
    private String nextPlace;
    //create private variable that stores next direction/screen associated with it
    private String nextDirection;
    //create private variable that stores the current direction of the screen
    private String direction;
    //create private variable that stores if the front is clear
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
         imageName = input.next();
          
        //string that checks if it is possible to move forward
        String check = input.next();

        //checks if boolean is false or not, and sets frontClear, nextPlace and nextDirection variable accordngly
        //if the front is not clear
        if (check.equals("false")) {
            frontClear = false;
            nextPlace = input.next();
            nextDirection = input.nextLine();
            
            //else if front is not clear, go to the next line down to scan in the next screen
        } else {
            frontClear = true;
            input.nextLine();
        }
        
        
      
   

        //load the image file 
         try{
            image = ImageIO.read(new File("images/" + imageName));
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }

    }

    /**
     * Returns the direction of the screen
     * @return the direction of the screen
     */
    public String getDirection(){
        return direction;
    }
    /**
     * Returns the name of the corresponding/next location
     * @return the name of the corresponding/next location
     */
    public String getNextPlace(){
        return nextPlace;
    }
    
    /**
     * Returns the corresponding/next direction in the next location
     * @return the corresponding/next direction in the next location
     */
    public String getNextDirection(){
        return nextDirection;
    }

    /**
     * Returns the image of the screen
     * @return the image of the screen
     */
    public BufferedImage getImage() {
        return image;
    }
    
   
    /**
     * Returns if the front is clear
     * @param direction the direction the character is facing
     * @return if the front is clear
     */
    public boolean isFrontClear(String direction) {
        return frontClear;
    }
    
     

    //I use psvm to repeatedly update this class because for some reason changes can not be applied unless this is played.
    public static void main(String[] args) {
    }
}
