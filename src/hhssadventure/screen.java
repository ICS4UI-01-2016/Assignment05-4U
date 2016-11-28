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
    private BufferedImage image;
    private String img;
    private boolean blocked;
    private String nextDirection;
    private String newimg;
            
    screen(Scanner input){
        //scan int image name
     String imageName = "";  
     try {
            imageName = input.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
     String[] split = imageName.split(" ");
     Direction = split[0];
     img = split [1];
     blocked = Boolean.parseBoolean(split[2]);
     
     if(!blocked){
         newimg = split[3];
         nextDirection = split[4];
     }
     
     //load in the image file
     try{
         image = ImageIO.read(new File("images/" + imageName ));
     }catch(Exception e){
         e.printStackTrace();
     }
    }  
  
    public String Direction(){
        return this.Direction;
    }
    
    public String getimg() {
        return this.img;
    }
    
     public String getnewimg() {
        return this.newimg;
    }
    
    public boolean isBlocked() {
        return this.blocked;
    }
    
    public String getNextDirection() {
        return this.nextDirection;
    }
    
 
    public BufferedImage getImage(){
        return image;
    }          
}

