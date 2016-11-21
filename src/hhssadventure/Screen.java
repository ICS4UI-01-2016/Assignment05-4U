/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author halll7908
 */
public class Screen {

    private BufferedImage image;
    private String area;
    private String direction;
    private boolean isBlocked;
    private String nextArea;
    private String nextDirection;

    /**
     * Using a scanner to create new screen
     *
     * @param input A scanner containing screen info
     */
    public Screen(String name, Scanner input) {
             
        // load the image
        try {
            File file = new File("file.txt");
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                System.out.println(s.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // move to next Line
        input.nextLine();
        
    }

    // automatically not blocked
    public boolean isBlocked() {
        return false;
    }

    public BufferedImage getImage() {
        return image;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Screen s = new Screen(in);
        
        // display image
        System.out.println(s.getImage());
    }
    
    
}
