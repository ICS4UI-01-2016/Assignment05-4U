/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Ajay
 */
public class screen {
   
    private BufferedImage image;
    private String img;
    private String Direction;
    private String Location;
    private String newimg;
    private String nextDirection;
    private String nextLocation;
    private boolean blocked;
            
    /**
     * This method takes the images and splits them apart from the "_" to return the direction and image number
     * @param input 
     */
    screen(Scanner input){  
        //setup the scanner
        //scan int image name
     String imageName = input.next();  
     try {
            imageName = input.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
     
     //load in the image file
     try{
         this.image = ImageIO.read(new File("images/" + imageName ));
     }catch(Exception e){
         e.printStackTrace();
     }
    }  
  
    /**
     * This method gets the available directions for the next move
     * @return the direction
     */
    public String Direction(){
        return this.Direction;
    }
    
    /**
     * This gets the initial location
     * @return the initial location
     */
    public String Location(){
        return this.Location;
    }
   
    /**
     * This method gets the next location/image that will be moved to
     * @return the next location 
     */
    public String nextLocation(){
        return this.nextLocation;
    }
    
    /**
     * This method gets the initial image
     * @return the image
     */
    public String getimg() {
        return this.img;
    }
    
    /**
     * This method is to get the new image
     * @return the new image
     */ 
    public String getnewimg() {
        return this.newimg;
    }
    
    /**
     * This method is to find whether or not the next move is blocked
     * @return blocked
     */
     public boolean isBlocked() {
        return this.blocked;
    }
    
    /**
     * The method to get the next direction
     * @return the next direction
     */
    public String getNextDirection() {
        return this.nextDirection;
    }
    
 
    /**
     * the getImage method
     * @return the image
     */
    public BufferedImage getImage(){
        return image;
    }          
}

