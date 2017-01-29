/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author Brendan
 */
public class ImageComponent extends JComponent {
    // creating a variable for the image
    private BufferedImage image;
    /**
     * constructing the image
     */
    public ImageComponent() {
        image = null;
    }
    /**
     * a method for drawing the image
     * @param g variable to represent the graphics
     */
    public void drawComponent(Graphics g) {
        // if there is an image to draw do the following 
        if (image != null) { // 
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    /**
     * draw the image on the screen 
     * @param img variable to represent the image
     */
    public void drawImage(BufferedImage img) {
        image = img;
        repaint();
    }
}
