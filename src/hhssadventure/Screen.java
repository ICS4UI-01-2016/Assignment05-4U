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
    
    private boolean checkImgs(){
        if(northImageName == null || eastImageName == null || southImageName == null || westImageName == null){
            return true;
        }else{
            return false;
        }
    }
    
    public Screen(Scanner input) {
        // scan in the name of the location
        name = input.next();
        // move to next line
        input.nextLine();
            String in = input.next();
        while (checkImgs()){
            
            if (in.equals("N")) {
                // scan in the north image name
                northImageName = input.next();
                System.out.println(northImageName);
                // load the north image file
                try {
                    northImage = ImageIO.read(new File("images/" + northImageName));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // scan in whether you can move North
                if (input.next().equals("false")) {
                    //store connect name
                    northConnectName = input.next();
                    //store connect direction
                    northMoveDir = input.next();
                } else {
                    northConnectName = null;
                }
                // move to next line
                input.nextLine();
                if(checkImgs()){
                    in = input.next();
                }
            }
            if (in.equals("E")) {
                // scan in the east image name
                this.eastImageName = input.next();
                System.out.println(eastImageName);
                // load the east image file
                try {
                    this.eastImage = ImageIO.read(new File("images/" + this.eastImageName));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // scan in whether you can move forwards
                if (input.next().equals("false")) {
                    //store connect name
                    eastConnectName = input.next();
                    //store move dir
                    eastMoveDir = input.next();
                } else {
                    eastConnectName = null;
                }
                // move to next line
                input.nextLine();
                if(checkImgs()){
                    in = input.next();
                }
            }
            if (in.equals("S")) {
                // scan in the south image name
                southImageName = input.next();
                System.out.println(southImageName);
                // load the east image file
                try {
                    southImage = ImageIO.read(new File("images/" + southImageName));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // scan in whether you can move forwards
                if (input.next().equals("false")) {
                    //store connect name
                    southConnectName = input.next();
                    //store move direction
                    southMoveDir = input.next();
                } else {
                    southConnectName = null;
                }
                // move to next line
                input.nextLine();
                if(checkImgs()){
                    in = input.next();
                }
            }

            if (in.equals("W")) {
                // scan in the west image name
                westImageName = input.next();
                System.out.println(westImageName);
                // load the east image file
                try {
                    westImage = ImageIO.read(new File("images/" + westImageName));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // scan in whether you can move forwards
                if (input.next().equals("false")) {
                    //store connect name
                    westConnectName = input.next();
                    //store move direction
                    westMoveDir = input.next();
                } else {
                    westConnectName = null;
                }
                // move to next line
                input.nextLine();
                if(checkImgs()){
                    in = input.next();
                }
            }
        }


        // set all to null - so no error codes for now
        northConnect = null;
        eastConnect = null;
        southConnect = null;
        westConnect = null;

    }

    /**
     * Method to get whether you can move forward
     *
     * @return true if you can move forward, false if you
     */
    public boolean canGoForward() {
        return false;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the north connection name
     *
     * @return the north connection name
     */
    public String getNorthConnectName() {
        return this.northConnectName;
    }

    /**
     * Get the east connection name
     *
     * @return the east connection name
     */
    public String getEastConnectName() {
        return this.eastConnectName;
    }

    /**
     * Get the south connection name
     *
     * @return the south connection name
     */
    public String getSouthConnectName() {
        return this.southConnectName;
    }

    /**
     * Get the west connection name
     *
     * @return the west connection name
     */
    public String getWestConnectName() {
        return this.westConnectName;
    }

    /**
     * Get the north connection
     *
     * @return the north connection
     */
    public Screen getNorthConnect() {

        return this.northConnect;
    }

    /**
     * Get the east connection
     *
     * @return the east connection
     */
    public Screen getEastConnect() {
        return this.eastConnect;
    }

    /**
     * Get the south connection
     *
     * @return the south connection
     */
    public Screen getSouthConnect() {
        return this.southConnect;
    }

    /**
     * Get the west connection
     *
     * @return the west connection
     */
    public Screen getWestConnect() {
        return this.westConnect;
    }

    /**
     * Get the north direction
     *
     * @return the north direction
     */
    public String getNorthMoveDir() {
        return this.northMoveDir;
    }

    public String getEastMoveDir() {
        return this.eastMoveDir;
    }

    public String getSouthMoveDir() {
        return this.southMoveDir;
    }

    public String getWestMoveDir() {
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
