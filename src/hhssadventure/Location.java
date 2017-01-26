/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brendan
 */
public class Location {

    private ArrayList<Screen> screens;

    public Location(String locationName, Scanner in) {
        screens = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Screen s = new Screen(locationName, in);
            screens.add(s);
        }
    }

    public ArrayList getNextScreen() {
        return screens;
    }

}
