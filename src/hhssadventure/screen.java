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
   
    private String Direction;
    private int Location;
    private BufferedImage image;
    private String curLocation;
    private String curDirection;
    private String isBlocked;
    private boolean blocked;
    private String nextLocation;
    private String nextDirection;
            
    screen(Scanner input){
        //scan int image name
     String imageName = input.next();  
   
     String[] split = imageName.split("_");
     Location = Integer.parseInt(split[1].substring(1));
     
     
     //load in the image file
     try{
         image = ImageIO.read(new File("IMG_" + imageName + ".JPG"));
     }catch(Exception e){
         e.printStackTrace();
     }
     
     isBlocked = input.next();
        if (isBlocked.equals("true")) {
            blocked = true;
            input.nextLine();
        } else {
            nextLocation = input.next();
            nextDirection = input.next();
            input.nextLine();
        }
        
  

     
     //move to next line
     input.nextLine();
    }  
  
    
    public String getDirection() {
        return this.curDirection;
    }
    
    public String getLocation() {
        return this.curLocation;
    }

    public boolean isBlocked() {
        return this.blocked;
    }
    
    public String getNextLocation() {
        return this.nextLocation;
    }

    public String getNextDirection() {
        return this.nextDirection;
    }
    
 
    public BufferedImage getImage(){
        return image;
    }
          
    public static void main(String[] args){
        
    }
}

