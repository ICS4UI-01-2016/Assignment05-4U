/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.util.Scanner;

/**
 *
 * @author tatad6701
 */
public class Screen {

    private int row;
    private int col;
    private BufferedImage image;
    private int height;
    private int width;
    private boolean north;
    private boolean east;
    private boolean south;
    private boolean west;

    public Screen(Scanner input) {
        // Scan in the image name
        String imageName = input.next();

    }
}
