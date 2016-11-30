/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guanv6321
 */
public class ControllerAdventure {

    public class Controller {

        private GUIAdventure gui;
        private MapAdventure map;
        private String location;
        private String direction;

        public Controller(GUIAdventure gui, MapAdventure map, String location, String direction) {
            this.gui = gui;
            this.map = map;
            this.location = map.getStartLocation();
            this.direction = map.getStartDirection();

            
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
        
    }
}
