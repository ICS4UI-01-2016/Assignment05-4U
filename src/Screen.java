
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


    
 
    private String imageName;
    
    
    
    private BufferedImage image;
    private String nextPlace;
    private String nextDirection;
    private String direction;
    
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
        
       
        
        String check = input.next();
        
        

        //checks if boolean is false or not
        if (check.equals("false")) {
            frontClear = false;
            nextPlace = input.next();
            nextDirection = input.nextLine();
            
            System.out.println(nextDirection);
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

    public String getNextDirection(){
        return nextDirection;
    }

    public BufferedImage getImage() {
        return image;
    }
    
     public String getImageName(){
        return imageName;
    }

    public boolean isFrontClear(String direction) {
        return frontClear;
    }
    
     

    //I use psvm to repeatedly update this class because for some reason changes can not be applied unless this is played.
    public static void main(String[] args) {
    }
}
