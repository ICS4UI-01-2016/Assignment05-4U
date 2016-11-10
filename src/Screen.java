
import java.awt.image.BufferedImage;
import java.util.Scanner;

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
    private String north;
    private String east;
    private String south;
    private String west;
    private Boolean forwards;

    public Screen(Scanner input) {
        // scan in the direction the photo is facing 
        north = input.next();
        // scan in the image name
        String imageName = input.next();
        // scan in whether you can move forwards
        forwards = input.nextBoolean();
        
        // move to next line
        input.nextLine();

        
        // set all to null - so no error codes for now
        northConnect = null;
        eastConnect = null;
        southConnect = null;
        westConnect = null;
        
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
