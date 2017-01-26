package hhssadventure;

import java.awt.image.BufferedImage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Controller {
    private GUI gui;
    private Map map;
    private BufferedImage image;
    private String IMGDes;
    private String IMGNum;
    
    
    public Controller(GUI gui, Map map, String IMGDes, String IMGNum){
        this.gui = gui;
        this.map = map;
        this.image = image;
        this.IMGDes = IMGDes;
        this.IMGNum = IMGNum;
        
        //make sure the GUI can talk to you
        gui.setController(this);
        
        // set the starting image
        Screen start = map.getCurrentScreen(IMGNum);
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){
        // get the screen we are on right now
        Screen current = map.getCurrentScreen(IMGNum);
        //ask if we can move north
        if(current.canGoNorth() == true){
            // move up a row
            // need new location
            // get the new screen
            Screen newScreen = map.getScreen(IMGDes);
            // set the image
            gui.setImage(newScreen.SendHelpN()); //ARG
        }
    }
    
    public void goSouth(){
        // get the screen we are on right now
        Screen current = map.getCurrentScreen(IMGNum);
        //ask if we can move south
        if(current.canGoSouth() == true){
            // get the new screen
            Screen newScreen = map.getScreen(IMGDes); //ARG
            // set the image
            gui.setImage(newScreen.SendHelpS());
        }
    }
    
    public void goEast(){
        // get the screen we are on right now
        Screen current = map.getCurrentScreen(IMGNum);
        //ask if we can move east
        if(current.canGoEast() == true){

            // get the new screen
            Screen newScreen = map.getScreen(IMGDes);
            // set the image
            gui.setImage(newScreen.SendHelpE());
        }
    }
    
    public void goWest(){
        // get the screen we are on right now
        Screen current = map.getCurrentScreen(IMGNum);
        //ask if we can move west
        if(current.canGoWest() == true){

            // get the new screen
            Screen newScreen = map.getScreen(IMGDes);
            // set the image
            gui.setImage(newScreen.SendHelpW());
        }
    }
}
