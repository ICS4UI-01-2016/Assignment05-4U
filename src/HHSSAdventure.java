/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author lamon
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIAdventure gui = new GUIAdventure();
        gui.setVisible(true);
        MapAdventure map = new MapAdventure("images/pics.txt");
        String location = map.getStartLocation();
        String direction = map.getStartDirection();
        ControllerAdventure c = new ControllerAdventure(gui, map, location, direction);
    }
    
}
