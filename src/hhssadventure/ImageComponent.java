/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author richj0985
 */
public class ImageComponent extends JComponent {

    // Creating the constant to be used
    private BufferedImage image;

    /**
     * Constructor for the image
     */
    public ImageComponent() {
        // Create image to be nothing
        image = null;
    }

    @Override
    public void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0,
                    this.getWidth(), this.getHeight(), null);
        }
    }

    /**
     * Method to set the image onto the screen
     *
     * @param img Setting image to the image from text file to be passed in
     */
    public void setImage(BufferedImage img) {
        image = img;
        // So we see the change being made
        repaint();
    }
}
