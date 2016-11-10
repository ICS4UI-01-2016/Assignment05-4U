/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class HHSSAdventure {
    
    
    public static void main(String[] args) {
        // creat the interface
        HHSSAdventureFrame gui = new HHSSAdventureFrame();
        // show the interface
        gui.setVisible(true);
        
        //create the map
        Map map = new Map("images/pics.txt");
        
        Controller c = new Controller(gui,map,8,8);
    }
}
