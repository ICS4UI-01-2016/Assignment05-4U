/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author richj0985
 */
public class Controller {
    private GUI gui;
    private Map map;
    
    public Controller(GUI gui, Map map){
        this.gui = gui;
        this.map = map;
        
        gui.setController(this);
        
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){

        
        if(current.canGoNorth()){
            
        }
    }
    
    public void goSouth(){
        
        if(current.canGoSouth()){

        }
    }
    
    public void goEast(){
        
        if(current.canGoEast()){
            
        }
    }
    
    public void goWest(){
                
        if(current.canGoWest()){
            
        }
    }
}
