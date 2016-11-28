
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

    private ArrayList<ScreenAdventure> screens;
    private ArrayList<ScreenAdventure> location;

    public MapAdventure(String fileName) {
        // initialize the list
        screens = new ArrayList<>();
        location = new ArrayList<>();
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(new File(fileName));
            // Make screens
            // loop to the end of the file
            while (input.hasNext()) {
                // creating a screen from the scanner
                ScreenAdventure scrn = new ScreenAdventure(input);
                // added the created screen to the list
                location.add(scrn);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(); 
        }

    }

    
   
}
