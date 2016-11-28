
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class MapAdventure {

    private ArrayList<LocationAdventure> locations;
    private String location;
    private String direction;
    
    public MapAdventure(String fileName) {

        locations = new ArrayList<>();
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            location = input.next();
            direction = input.next();
            
            // Make screens
            // loop to the end of the file
            while (input.hasNext()) {
                // creating a screen from the scanner
                LocationAdventure scrn = new LocationAdventure(input);
                // added the created screen to the list
                location.add(scrn);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(); 
        }

    }

    
   
}
