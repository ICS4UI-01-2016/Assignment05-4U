package hhssadventure;


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
    //Connection screens
    private Screen northConnect;
    private Screen eastConnect;
    private Screen southConnect;
    private Screen westConnect;
    //Connection screen names
    private String northConnectName;
    private String eastConnectName;
    private String southConnectName;
    private String westConnectName;
    //images for each direction
    private BufferedImage northImage;
    private BufferedImage eastImage;
    private BufferedImage southImage;
    private BufferedImage westImage;
    //image file location locations
    private String northImageName;
    private String eastImageName;
    private String southImageName;
    private String westImageName;
    //direction faced after moving 
    private String northMoveDir;
    private String eastMoveDir;
    private String southMoveDir;
    private String westMoveDir;
    //name of this screen
    private String name;

    public Screen(Scanner input) {
        // scan in the name of the location
        name = input.next();
        // move to next line
        input.nextLine();
        
        // skip direction
        input.next();
        // scan in the north image name
        northImageName = input.next();
        // load the north image file
        try {
            northImage = ImageIO.read(new File("images/" + northImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move North
        if(input.nextBoolean()){
            //store connect name
            northConnectName = input.next();
            //store connect direction
            northMoveDir = input.next();
        }
        // move to next line
        input.nextLine(); 

        // skip direction
        input.next();
        // scan in the east image name
        eastImageName = input.next();
        // load the east image file
        try {
            eastImage = ImageIO.read(new File("images/" + eastImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move forwards
        if(input.nextBoolean()){
            //store connect name
            eastConnectName = input.next();
            //store move dir
            eastMoveDir = input.next();
        }
        // move to next line
        input.nextLine(); 

        // skip direction
        input.next();
        // scan in the south image name
        southImageName = input.next();
        // load the east image file
        try {
            southImage = ImageIO.read(new File("images/" + southImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move forwards
        if(input.nextBoolean()){
            //store connect name
            southConnectName = input.next();
            //store move direction
            southMoveDir = input.next();
        }
        // move to next line
        input.nextLine(); 

        // skip direction
        input.next();
        // scan in the west image name
        westImageName = input.next();
        // load the east image file
        try {
            westImage = ImageIO.read(new File("images/" + westImageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scan in whether you can move forwards
        if(input.nextBoolean()){
            //store connect name
            westConnectName = input.next();
            //store move direction
            westMoveDir = input.next();
        }
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
        return false;
    }
    
    /**
     * 
     * @return 
     */
    public String getName(){
        return this.name;
    }
    
    public String getNorthConnectName(){
        return this.northConnectName;
    }
    
    public String getEastConnectName(){
        return this.eastConnectName;
    }
    
    public String getSouthConnectName(){
        return this.southConnectName;
    }
    
    public String getWestConnectName(){
        return this.westConnectName;
    }
    
    public Screen getNorthConnect(){
        return this.northConnect;
    }
    
    public Screen getEastConnect(){
        return this.eastConnect;
    }
    
    public Screen getSouthConnect(){
        return this.southConnect;
    }
    
    public Screen getWestConnect(){
        return this.westConnect;
    }
    
    public String getNorthMoveDir(){
        return this.northMoveDir;
    }
    
    public String getEastMoveDir(){
        return this.eastMoveDir;
    }
    
    public String getSouthMoveDir(){
        return this.southMoveDir;
    }
    
    public String getWestMoveDir(){
        return this.westMoveDir;
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
    public BufferedImage getNorthImage() {
        return northImage;
    }

    /**
     * Get the east image
     *
     * @return the east image
     */
    public BufferedImage getEastImage() {
        return eastImage;
    }

    /**
     * Get the south image
     *
     * @return the south image
     */
    public BufferedImage getSouthImage() {
        return southImage;
    }

    /**
     * Get the west image
     *
     * @return the west image
     */
    public BufferedImage getWestImage() {
        return westImage;
    }
}
