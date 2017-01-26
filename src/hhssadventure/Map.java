package hhssadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * An object to store the entire map of the world
 *
 * @author moore3607
 */
public class Map {
    public ArrayList<Screen> screens;
    public ArrayList<Screen> miniscreens;
    private String IMGDes;
    private String North;
    private String East;
    private String South;
    private String West;

    public Map(String Name) {
        // initialize the list
        java.io.File fileName = new java.io.File(Name);
        screens = new ArrayList<>();
        miniscreens = new ArrayList<>();
        System.out.println(fileName);
        
        try {
            // make the scanner for the text file
            Scanner input = new Scanner(fileName);

            while (input.hasNextLine()) {
                //creating a screen from the scanner
                System.out.println(input);
                Screen s = new Screen(input);
                // added the created screen to the list
                System.out.println(input);
                System.out.println("Anything");
                screens.add(s);
                //HELP THIS LINE
                input.nextLine();
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Retrieve a specific screen from the map
     *
     * @param row the row which the screen appears
     * @param col the column which the screen appears
     * @return the screen at(row, col) or null if not found
     */
    public Screen getScreen(String IMGDes) { //This processes and finds the necessary thing (start destination, I.e. "Dowstairs"
        //go through each screen
        for (Screen s : screens) { //Goes through whole screens array
            // see if the image number matches
            if (s.getIMGDirect().equals(IMGDes)) { //s.getIMGDirect == IMGDirect - checks the first string(the start to the end of split 0) for the new Destination
                return s;
            }
        }
        // no screen found
        return null;
    }
    
    public Screen findScreen(String IMGDes, String IMGDirect2) throws FileNotFoundException{
        
        for(Screen s: screens){
            
            if(s.getIMGDirect().equals(IMGDes)){
                Scanner input = new Scanner(new File("Russell.jpg"));
                for(int i = 0; i < 4; i++){
                    Screen t = new Screen(input);
                }
                
                return s;
                
            }
        }
        // no screen found
        return null;
    }
}
