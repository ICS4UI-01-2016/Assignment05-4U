import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * An object to represent a single screen in a level 
 * @author hadik9595
 */
public class Screen {
    private String currentPlace;
    private String currentDirection;
    private BufferedImage image;
    private String nextPlace;
    private String nextDirection;
    private boolean frontClear;

   
  
    /**
     * Using a scanner to create a new screen
     * @param input A scanner containing screen info
     */
  public Screen(Scanner input){
      
      //scan in spawn
      String spawnPlace = input.next();
      String spawnDirection = input.next();
      String check = input.next();
      
      
      
      //scan in the place
       String place = input.next();
       String direction = input.next();
        
      
      
      // scan in the image name 
      String imageName = input.next();
      
      
      
      
      
      
      //load the image file 
      try{
          image = ImageIO.read(new File("images/"  + imageName));
      }catch(Exception e){
          e.printStackTrace();
      }
      
      // get the possible directions 
     
      
      //move to next line 
      input.nextLine();
      
     
      
  }  
  /**
   * get row of the screen
   * @return the row of screen
   */
   
   
  
   public String getCurrentDirection(){
       return currentDirection;
   }
  
   public String getCurrentPlace(){
       return currentPlace;
   }
   
   public String getNextDirection(){
       return nextDirection;
   }
   
   public String getNextPlace(){
       return nextPlace;
   }
  
   
   public BufferedImage getImage(){
       return image;
   }
   
  public boolean isFrontClear(){
      return frontClear;
  }
  
  public void checks(Scanner input){
       String spawnPlace = input.next();
      String spawnDirection = input.next();
      String check = input.next();
      
      System.out.println(check);
      System.out.println("yo");
  }
   
  
  
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Screen s = new Screen(in);
        
        System.out.println("Test");
        
        s.checks(in);
        s.isFrontClear();
        
    }
    
}
