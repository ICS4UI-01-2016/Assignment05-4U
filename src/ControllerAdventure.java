/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class ControllerAdventure {

        private GUIAdventure gui;
        private MapAdventure map;
        private String location;
        private String direction;

        public ControllerAdventure(GUIAdventure gui, MapAdventure map, String location, String direction) {
            this.gui = gui;
            this.map = map;
            this.location = map.getStartLocation();
            this.direction = map.getStartDirection();

            gui.setController(this); 
            // set the starting image
            ScreenAdventure start = map.getLocation(location, direction);
            gui.setImage(start.getImage());

        }
        
        public void moveForward(){
            ScreenAdventure current = map.getLocation(location, direction);
            if(current.clear() == false){
                location = current.getNewLocation();
                direction = current.getNewDirecton();
            }
            ScreenAdventure newScreen = map.getLocation(location, direction);
            gui.setImage(newScreen.getImage());          
        }
        
        public void lookNorth(){
            ScreenAdventure current = map.getLocation(location, direction);
            direction = "North";
            gui.setImage(current.getImage());
            
        }
        
        public void lookEast(){
            ScreenAdventure current = map.getLocation(location, direction);
            direction = "East";
            gui.setImage(current.getImage());
            
        }
        
        public void lookSouth(){
            ScreenAdventure current = map.getLocation(location, direction);
            direction = "South";
            gui.setImage(current.getImage());
            
        }
        
        public void lookWest(){
            ScreenAdventure current = map.getLocation(location, direction);
            direction = "West";
            gui.setImage(current.getImage());
            
        }
    }

