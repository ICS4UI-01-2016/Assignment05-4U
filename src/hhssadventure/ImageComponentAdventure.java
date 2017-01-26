package hhssadventure;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503, guanv6321
 */
public class ImageComponentAdventure extends JComponent {

    private BufferedImage image;

    /**
     * Construct the image
     */
    public ImageComponentAdventure() {
        image = null;
    }

    @Override
    public void paintComponent(Graphics g) {

        if (image != null) {
            // If the image is null
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    /**
     * The image is painted to the screen
     *
     * @param img the image being painted
     */
    public void setImage(BufferedImage img) {
        image = img;
        // So the changes made are seen 
        repaint();
    }
}
