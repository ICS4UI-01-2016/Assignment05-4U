/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hhssadventure;

import java.awt.image.BufferedImage;
import java.util.Scanner;


/**
 *
 * @author Ajay
 */
public class Location {
     private screen[] scenes;
    private String name;

    public Location(Scanner input) {

        scenes = new screen[4];

        name = input.nextLine();
        for (int i = 0; i < 4; i++) {
            screen s = new screen(input);
            scenes[i] = s;
        }
    
}
    //checks if the front is blocked
    public boolean isFrontBlocked(String dir) {
        for (int i = 0; i < 4; i++) {
            if (scenes[i].getDirection().equals(dir)) {
                return scenes[i].isBlocked();
            }
          }
       return true; 
  }
    //this will get the next location if the front is not blocked
    public String getNextLocation(String dir) {
        for (int i = 0; i < 4; i++) {
            if (scenes[i].getDirection().equals(dir)) {
                return scenes[i].getNextLocation();
            }
        }
        return null;
    }
    // this grabs the current image the user is facing 
    public BufferedImage getImage(String dir) {
        for (int i = 0; i < 4; i++) {
            if (scenes[i].getDirection().equals(dir)) {
                return scenes[i].getImage();
            }
        }
        return null;
    }
    public String getName() {
        return this.name;
    }
}