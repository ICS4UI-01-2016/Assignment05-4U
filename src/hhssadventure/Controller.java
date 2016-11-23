package hhssadventure;

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
    private int IMGNum;
    private String IMGDes;
    
    public Controller(GUI gui, Map map, int IMGNum, String IMGDes){
        this.gui = gui;
        this.map = map;
        this.IMGNum = IMGNum;
        this.IMGDes = IMGDes;
        
        //make sure the GUI can talk to you
        gui.setControler(this);
        
        // set the starting image
        Screen start = map.getScreen(IMGNum);
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){
        // get the screen we are on right now
        Screen current = map.getScreen(IMGNum);
        //ask if we can move north
        if(current.canGoNorth()){
            // move up a row
            //need new location
            // get the new screen
            Screen newScreen = map.getScreen(IMGNum);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goSouth(){
        // get the screen we are on right now
        Screen current = map.getScreen(IMGNum);
        //ask if we can move south
        if(current.canGoSouth()){
            // move down a row
            row++;
            // get the new screen
            Screen newScreen = map.getScreen(IMGNum);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goEast(){
        // get the screen we are on right now
        Screen current = map.getScreen(IMGNum);
        //ask if we can move east
        if(current.canGoEast()){
            // move to the right column
            row--;
            // get the new screen
            Screen newScreen = map.getScreen(IMGNum);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goWest(){
        // get the screen we are on right now
        Screen current = map.getScreen(IMGNum);
        //ask if we can move west
        if(current.canGoWest()){
            // move to the left column
            row--;
            // get the new screen
            Screen newScreen = map.getScreen(IMGNum);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
}
