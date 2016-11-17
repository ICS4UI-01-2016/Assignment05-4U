
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Spawn {
    
    private String currentPlace;
    private String currentDirection;
    
    public void Spawn(Scanner input){
        
        currentPlace = input.nextLine();
        currentDirection = input.nextLine();
        
        
        
        System.out.println(currentPlace);
        System.out.println(currentDirection);
    }
    
    public static void main(String[] args) {
        
    }
    
    
}
