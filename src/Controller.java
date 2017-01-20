
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Controller {

    //create gui as a private variable
    private HHSSAdventureFrame gui;
    //create map as a private variable
    private Map map;
    //create current place as a private variable 
    private String currentPlace;
    //create current direction as a private variable 
    private String currentDirection;
    //create a list of all locations as a private variable 
    private ArrayList<Location> locations = new ArrayList<>();
    //create an array of 4 directions as a private variable 
    private String[] directions;
    //create current location variable
   

    /**
     * constructor for the controller
     *
     * @param gui the GUI used in controller
     * @param m the map used to store the layout of the school
     */
    public Controller(HHSSAdventureFrame gui, Map m) {
        //initialize variables
        this.gui = gui;
        this.map = m;
        this.currentPlace = map.getStartingPlace();
        this.currentDirection = map.getStartingDirection();

        //set direction array to have corresponding spots with each direction
        directions = new String[]{"N", "E", "S", "W"};

        //make sure the GUI can talk to you
        gui.setController(this);

        //set the  place and direction where the character starts/spawns at
        Screen start = map.getLocation(this.currentPlace, this.currentDirection);
        //sets the spawn's image by using the newScreen
        gui.setImage(start.getImage());

    }

    /**
     * Set the next location moving forward
     */
    public void goForward() {
        //get the screen we are on right now by passing in the currentPlace and currentDirection 
        Screen current = map.getLocation(currentPlace, currentDirection);

        //if we can move forward, set the current place variable as the next place attached to it
        if (!current.isFrontClear(currentDirection)) {
            currentPlace = current.getNextPlace();
            //sets the current direction to the direction that is next to it (in same line but after the boolean)
            currentDirection = current.getNextDirection();
    
        }
        
       //Gets the new updated screen by calling map and sends it the new place and direction
        Screen newScreen = map.getLocation(currentPlace, currentDirection);
        // set the image by using the newScreen
        gui.setImage(newScreen.getImage());
       
    }

  
    /**
     * Turns character to the screen "left" of it
     */
    public void turnLeft() {

        //go through direction array comparing to current direction
        //subtract 1 position from direction array to set as new direction
        //have exception for N since it is at position 0, so it is set manually to W
        for (int i = 0; i < directions.length; i++) {
            if (currentDirection.equals(directions[i])) {
                if (currentDirection.equals("N")) {
                    currentDirection = "W";
                    break;
                } else {
                    currentDirection = directions[i - 1];
                    break;
                }
            }
        }

        //Gets the new updated screen by calling map and sends it the new place and direction
        Screen newScreen = map.getLocation(currentPlace, currentDirection);
        // set the image
        gui.setImage(newScreen.getImage());

    }

    /**
     * Turns character to the screen "right" of it
     */
    public void turnRight() {
        //go through direction array comparing to current direction
        //add 1 position from direction array to set as new direction
        //have exception for W since it is at position 3, so it is set manually to N
        for (int i = 0; i < directions.length; i++) {
            //once there is a match for currentDirection and direction 
            if (currentDirection.equals(directions[i])) {
                if (currentDirection.equals("W")) {
                    currentDirection = "N";
                    break;
                } else {
                    currentDirection = directions[i + 1];
                    break;
                }
            }
        }
        //Gets the new updated screen by calling map and sends it the new place and direction
        Screen newScreen = map.getLocation(currentPlace, currentDirection);
        //By using the newScreen, updates the image 
        gui.setImage(newScreen.getImage());

    }

    //a way to update the class when changes are made
    public static void main(String[] args) {

    }
}
