
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

    private String currentPlace;
    private String currentDirection;
    private BufferedImage image;
    private String nextPlace;
    private String nextDirection;
    private boolean frontClear;

    /**
     * Using a scanner to create a new screen
     *
     * @param input A scanner containing screen info
     */
    public Screen(Scanner input) {
        
        String checkPlace = input.next();
         //checks if first word is more than 1 letter (because if it is, then that's where we need to call location) 
        if(checkPlace.length() > 1){
            currentPlace = checkPlace;
            input.nextLine();
        }else if (input.next() != null){
         
         currentDirection = input.next();
        
        
        
       
 
        // scan in the image name 
        String imageName = input.next();

        String check2 = input.next();
        
      //checks if boolean is false or not
        if (check2.equals("false")) {
            frontClear = false;
            nextPlace = input.next();
            nextDirection = input.next();
            
        }else{
            frontClear = true;
            input.next();
        }
           

        //move to next line 
        input.nextLine(); 
         //load the image file 
        try {
            image = ImageIO.read(new File("images/" +  imageName + ".JPG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        }else{
           input.nextLine();
       }
       
        
       


     
        
        }
    

    /**
     * get row of the screen
     *
     * @return the row of screen
     */

    public String spawn(Scanner input) {
        //scan in spawn
        String spawnPlace = input.nextLine();
        String spawnDirection = input.nextLine();
        return spawnPlace;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public String getCurrentPlace() {
        return currentPlace;
    }

    public String getNextDirection() {
        return nextDirection;
    }

    public String getNextPlace() {
        return nextPlace;
    }

    public BufferedImage getImage() {
        return image;
    }

    public boolean isFrontClear() {
        return frontClear;
    }

  

}
