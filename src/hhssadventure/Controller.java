package hhssadventure;

import java.util.ArrayList;

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
    private String IMGDirect;
    private String IMGBool;
    private ArrayList<Screen> screens;

    public Controller(GUI gui, Map map, int IMGNum, String IMGDes) {
        this.gui = gui;
        this.map = map;
        this.IMGNum = IMGNum;
        this.IMGDes = IMGDes;

        //make sure the GUI can talk to you
        gui.setController(this);

        // set the starting image
        Screen start = map.getScreen(IMGDes);
        gui.setImage(start.getImage());
    }

    public void goNorth() {
        // get the screen we are on right now
        Screen current = map.getScreen(IMGDes);
        //ask if we can move north
        if (current.canGoNorth()) {
            // move up a row
            if (IMGDirect.equals("N")) {
            }
        }
        //need new location
        // get the new screen
        Screen newScreen = map.getScreen(IMGDes);
        // set the image
        gui.setImage(newScreen.getImage());
    }

    public void goSouth() {
        // get the screen we are on right now
        Screen current = map.getScreen(IMGDes);
        //ask if we can move south
        if (current.canGoSouth()) {
            // get the new screen
            Screen newScreen = map.getScreen(IMGDes);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    public void goEast() {
        // get the screen we are on right now
        Screen current = map.getScreen(IMGDes);
        //ask if we can move east
        if (current.canGoEast()) {
            // get the new screen
            Screen newScreen = map.getScreen(IMGDes);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }

    public void goWest() {
        // get the screen we are on right now
        Screen current = map.getScreen(IMGDes);
        //ask if we can move west
        if (current.canGoWest()) {
            // get the new screen
            Screen newScreen = map.getScreen(IMGDes);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
}
