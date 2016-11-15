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
   
    private int row;
    private BufferedImage image;
    private String direction;
    private boolean north;
    private boolean south;
    private boolean east;
    private boolean west;
    private boolean turnLeft;
    private boolean turnRight;
    private String isBlocked;
    private boolean blocked;
    private String nextLocation;
    private String nextDirection;
            
    screen(Scanner input){
        //scan int image name
     String imageName = input.next();  
   
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
        
      //get the possible directions
     north = input.nextBoolean();
     east = input.nextBoolean();
     south = input.nextBoolean();
     west = input.nextBoolean();
     
     //move to next line
     input.nextLine();
    }  
    
    public int getRow(){
        return row;
    }
    
    public String getDirection() {
        return this.direction;
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
    
    
    public boolean canTurnRight(){
        return turnRight;
    }
    
    public boolean canTurnLeft(){
        return turnLeft;
    }
    
    public boolean canGoNorth(){
        return north;
    }
    
    public boolean canGoSouth(){
        return south;
    }
    
    public boolean canGoEast(){
        return east;
    }
    
    public boolean canGoWest(){
        return west;
    }
    
    public BufferedImage getImage(){
        return image;
    }
          
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        screen s = new screen(in);
        
        System.out.println(s.getRow());
        System.out.println(s.canGoEast());
    }
}

