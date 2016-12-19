
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class ScreenAdventure {

    private BufferedImage image;
    private String direction;
    private boolean clear;
    private String newLocation;
    private String imageName;
    private String newDirection;

    /**
     * Using a scanner to create a new screen
     *
     * @param input A scanner containing screen info
     */
    public ScreenAdventure(Scanner input) {
       direction = input.next();
       imageName = input.next();
       String check = input.next();
       

        if (check.equals("false")) { 
            clear = false;
            newLocation = input.next();
            newDirection = input.nextLine();
            input.nextLine();
        } else {
            clear = true;
            input.nextLine();
        }
        
        
        
        // load the image file
        try {
            image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0); 
        }


    }
    
    
    public String getDirection() {
        return this.direction;
    }

   
    public String getImageName() {
        return this.imageName;
    }

    
    public String getNewLocation() {
        return this.newLocation;
    }

    public String getNewDirecton(){
        return this.newDirection;
    }
    
    public boolean clear(String direction){
        return this.clear;
    }
      
    
    public BufferedImage getImage() {
        return image;
    }
}
