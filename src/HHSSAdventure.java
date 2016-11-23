
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class HHSSAdventure {
    
        private String currentPlace;
    private String currentDirection;
    
    
    
    public HHSSAdventure(Scanner input){
    
        currentPlace = input.nextLine();
         currentDirection = input.nextLine();
        
        
}
    
    
    
    
    
    public void gg(String[] args) {
        
        
        
        // creat the interface
        HHSSAdventureFrame gui = new HHSSAdventureFrame();
        // show the interface
        gui.setVisible(true);
        
        //create the map
        Map map = new Map("images/pics.txt");
        
        
        
        //initial spawn of the game, sets coordinates, and calls the map as well as the GUI
        Controller c = new Controller(gui,map, );
        
        
        
        
    }
   
}
