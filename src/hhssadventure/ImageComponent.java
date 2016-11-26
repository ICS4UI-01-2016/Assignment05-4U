/*
 * ImageComponent Class allows for the images within the "pics.txt." file to be used and
 * printed on the screen where the user can see them and then make moves based off them. 
 */
package hhssadventure;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author richj0985, starwarslover1998, tatad6701
 */
public class ImageComponent extends JComponent {

    // Creating the constant to be used
    private BufferedImage image;

    /**
     * Constructor for the image component
     */
    public ImageComponent() {
        // Create image to be nothing
        image = null;
    }
    
    /**
     * Method for paint component
     * @param g Graphics for paint component
     */
    @Override
    public void paintComponent(Graphics g) {
        // If there is an image than draw the image
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    /**
     * Method to set the image onto the screen
     *
     * @param img Setting image to the image from text file to be passed in
     */
    public void setImage(BufferedImage img) {
        // Sets the image
        image = img;
        // So we see the change being made
        repaint();
    }
}
