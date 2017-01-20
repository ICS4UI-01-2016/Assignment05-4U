
import java.util.Scanner;

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
        // create the interface
        HHSSAdventureFrame gui = new HHSSAdventureFrame();
        // show the interface
        gui.setVisible(true);

        //create the map by loading in the "images/pics.txt" in order to read coordinates
        Map map = new Map("images/pics.txt");

        //initial spawn of the game, sets coordinates, and calls the map as well as the GUI
        Controller c = new Controller(gui, map);

    }

}
