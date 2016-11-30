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
 * @author brayden
 */
public class Screen {
    
    private String Area;
    private String direction;
    private BufferedImage image;
    private boolean canMove;
    private String aftrArea;
    private String aftrDir;
    
    public Screen (Scanner in){
        
        this.Area = in.next();
        
        this.direction = in.next();
        
        String imageName = in.next();
        
        try{
            image = ImageIO.read(new File("images/" + imageName));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        this.canMove = (!in.nextBoolean());
        
        if(this.canMove){
            this.aftrArea = in.next();
            this.aftrDir = in.next();
        }
        
        
        System.out.println("area: " + this.Area);
        System.out.println("direction: " + this.direction);
        System.out.println("image: " + imageName);
        System.out.println("canMove: " + this.canMove);
        System.out.println("aftrArea: " + this.aftrArea);
        System.out.println("aftrDir: " + this.aftrDir);        
    }
    
    public String getArea(){
        return this.Area;
    }
    public String getDirection(){
        return this.direction;
    }
    public BufferedImage getImage(){
        return this.image;
    }
    public boolean getCanMove(){
        return this.canMove;
    }
    public String getAftrArea(){
        return this.aftrArea;
    }
    public String getAftrDir(){
        return this.aftrDir;
    }
}
