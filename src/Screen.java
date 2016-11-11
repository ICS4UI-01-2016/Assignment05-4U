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
    private String place;
    private char direction;
    private BufferedImage image;
    private boolean north;
    private boolean east;
    private boolean south;
    private boolean west;
  
    /**
     * Using a scanner to create a new screen
     * @param input A scanner containing screen info
     */
  public Screen(Scanner input){
      //scan in the place
      String place = input.next();
      
      //go down to the next line
      input.nextLine();
      // scan in the image name 
      String imageName = input.next();
      // split the string to grab 
      String[] split = imageName.split(" ");
      
      // save the row  - gets rid of R, conver to int 
      place = String.(split[1].substring(1));
      // save the col - gets rid of C, likewise
      direction = split[0].charAt(0);
      direction = split[0];
      
      //load the image file 
      try{
          image = ImageIO.read(new File("zelda/"  + imageName + ".gif"));
      }catch(Exception e){
          e.printStackTrace();
      }
      
      // get the possible directions 
      north = input.nextBoolean();
      east = input.nextBoolean();
      south = input.nextBoolean();
      west = input.nextBoolean();
      
      //move to next line 
      input.nextLine();
      
     
      
  }  
  /**
   * get row of the screen
   * @return the row of screen
   */
   public String getPlace(){
          return place;
      }
   
   /**
    * get column of the screen
    * @return the column of the screen
    */
   public int getDirection(){
       return direction;
   }
   
   public boolean canGoNorth(){
       return north;
   }
   
   public boolean canGoEast(){
       return east;
   }
   
   public boolean canGoSouth(){
       return south;
   }
   
   public boolean canGoWest(){
       return west;
   }
   
   public BufferedImage getImage(){
       return image;
   }
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Screen s = new Screen(in);
    }
    
}
