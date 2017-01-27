/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;


/**
 *
 * @author Brendan
 */
public class Controller {
    
        private GUI gui;
        private School school;
        private String location;
        private String direction;
    
        public Controller(GUI gui, School school, String location, String direction){
            
            this.gui = gui;
            this.school = school;
            this.location = location;
            this.direction = direction;
            
            gui.setController(this);
            
            Screen current = school.getScreen(location, direction);
            gui.setImage(current.getImage());
        }
}
