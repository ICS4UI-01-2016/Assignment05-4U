/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hhssadventure;



/**
 *The variables are set
 * @author Ajay
 */
public class Controller {
    private GUI gui;
    private Map map;
    String Location;
    String Direction;
            
   /**
    * Constructor for the controller
    * @param gui the graphics interface that is being used
    * @param map the map that is being used
    */
    public Controller(GUI gui, Map map){
        this.gui = gui;
        this.map = map;
        this.Location = map.getStartLoc();
        this.Direction = map.getStartDir();
        
        
        // make sure the GUI can talk to you
        gui.setController(this);
        //Setup the inital image for the map
        screen start = map.getScreen(Location, Direction);
        gui.setImage(start.getImage());
        gui.Direction(Direction);
        gui.isBlocked(start.isBlocked());
    }
    
    /**
     * Method to move north in the program
     */
    public void north(){                                //method north
        screen start = map.getScreen(Location, Direction);  //the start screen will get the location and direction of the screen
        Direction = "N";                                //direction equals north
        start = map.getScreen(Location, Direction);     //start will return the location and direction of the screen
        gui.setImage(start.getImage());                 //the gui.getImage is under the same method as start.getImage
        gui.Direction(Direction);                       //the gui direction is under the same method as direction
        gui.isBlocked(start.isBlocked());               //the gui.isBlocked is under the same method as start.isBlocked
    }
    
    /**
     * Method to move south in the program
     */
    public void south(){                                //method south
        screen start = map.getScreen(Location, Direction);  //the start screen will get the location and direction of the screen  
        Direction = "S";                                //direction equals south
        start = map.getScreen(Location, Direction);     //start will return the location and direction of the screen
        gui.setImage(start.getImage());                 //the gui.getImage is under the same method as start.getImage
        gui.Direction(Direction);                       //the gui direction is under the same method as direction
        gui.isBlocked(start.isBlocked());               //the gui.isBlocked is under the same method as start.isBlocked
    }
    
    /**
     * Method to move west in the program
     */
    public void west(){                                //method west
        screen start = map.getScreen(Location, Direction);  //the start screen will get the location and direction of the screen
        Direction = "W";                               //direction equals west
        start = map.getScreen(Location, Direction);    //start will return the location and direction of the screen
        gui.setImage(start.getImage());                //the gui.getImage is under the same method as start.getImage
        gui.Direction(Direction);                      //the gui direction is under the same method as direction
//        gui.isBlocked(start.isBlocked());            //the gui.isBlocked is under the same method as start.isBlocked
    }
    
    /**
     * Method to move east in the program
     */
    public void east(){                                 //method east
        screen start = map.getScreen(Location, Direction);  //the start screen will get the location and direction of the screen
        Direction = "E";                                //direction equals East
        start = map.getScreen(Location, Direction);     //start will return the location and direction of the screen
        gui.setImage(start.getImage());                 //the gui.getImage is under the same method as start.getImage
        gui.Direction(Direction);                       //the gui direction is under the same method as direction
        gui.isBlocked(start.isBlocked());               //the gui.isBlocked is under the same method as start.isBlocked
    }
    
    /**
     * Method to move forward in the program
     */
    public void forward(){                              //method forward
    screen start = map.getScreen(Location, Direction);  //the start screen will get the location and direction of the screen
    if(start.isBlocked() == false){                     //if start is blocked, equal false
        Direction = start.getNextDirection();           //direction will get the next direction
        start = map.getScreen(Location, Direction);     //start will return the location and direction of the screen
    }
        gui.setImage(start.getImage());                 //the gui.getImage is under the same method as start.getImage
        gui.Direction(Direction);                       //the gui direction is under the same method as direction
        gui.isBlocked(start.isBlocked());               //the gui.isBlocked is under the same method as start.isBlocked
    } 
   }

