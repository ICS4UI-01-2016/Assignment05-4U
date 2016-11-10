
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
 * @author watsk8668
 */
public class Screen {
    // instance variables
    private Screen northConnect;
    private Screen eastConnect;
    private Screen southConnect;
    private Screen westConnect;
    private BufferedImage northImage;
    private BufferedImage eastImage;
    private BufferedImage southImage;
    private BufferedImage westImage;
    private String northImageName;
    private String eastImageName;
    private String southImageName;
    private String westImageName;
    private String north;
    private String east;
    private String south;
    private String west;
    private Boolean forward;
    private String name;

    public Screen(Scanner input) {
        // scan in the name of the location
        name = input.next();
        // move to next line
        input.nextLine();
        
        // scan in the direction the photo is facing 
        north = input.next();
        // scan in the north image name
        northImageName = input.next();
        // load the north image file
        try {
            northImage = ImageIO.read(new File("images/" + northImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move forwards
        forward = input.nextBoolean();
        // move to next line
        input.nextLine(); 

        // scan in the direction the photo is facing 
        east = input.next();
        // scan in the east image name
        eastImageName = input.next();
        // load the east image file
        try {
            eastImage = ImageIO.read(new File("images/" + eastImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move forwards
        forward = input.nextBoolean();
        // move to next line
        input.nextLine(); 

        // scan in the direction the photo is facing 
        south = input.next();
        // scan in the south image name
        southImageName = input.next();
        // load the east image file
        try {
            southImage = ImageIO.read(new File("images/" + southImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move forwards
        forward = input.nextBoolean();
        // move to next line
        input.nextLine(); 

        // scan in the direction the photo is facing 
        west = input.next();
        // scan in the west image name
        westImageName = input.next();
        // load the east image file
        try {
            westImage = ImageIO.read(new File("images/" + westImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move forwards
        forward = input.nextBoolean();
        // move to next line
        input.nextLine(); 

        
        // set all to null - so no error codes for now
        northConnect = null;
        eastConnect = null;
        southConnect = null;
        westConnect = null;
        
    }

    /**
     * Method to get whether you can move forward
     * @return true if you can move forward, false if you 
     */
    public boolean canGoForward(){
        return this.forward;
    }
    
    /**
     * 
     * @return 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Connect to the north screen
     *
     * @param s The current screen
     */
    public void setNorthConnect(Screen s) {
        this.northConnect = s;
    }

    /**
     * Connect to the east screen
     *
     * @param s The current screen
     */
    public void setEastConnect(Screen s) {
        this.eastConnect = s;
    }

    /**
     * Connect to the south screen
     *
     * @param s The current screen
     */
    public void setSouthConnect(Screen s) {
        this.southConnect = s;
    }

    /**
     * Connect to the west screen
     *
     * @param s The current screen
     */
    public void setWestConnect(Screen s) {
        this.westConnect = s;
    }

    /**
     * Get the north image
     *
     * @return the south image
     */
    public BufferedImage setNorthImage() {
        return northImage;
    }

    /**
     * Get the east image
     *
     * @return the east image
     */
    public BufferedImage setEastImage() {
        return eastImage;
    }

    /**
     * Get the south image
     *
     * @return the south image
     */
    public BufferedImage setSouthImage() {
        return southImage;
    }

    /**
     * Get the west image
     *
     * @return the west image
     */
    public BufferedImage setWestImage() {
        return westImage;
    }
}
