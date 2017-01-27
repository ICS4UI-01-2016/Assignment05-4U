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

    private BufferedImage image;

    public ImageComponent() {
        image = null;
    }

    public void drawComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    public void drawImage(BufferedImage img) {
        image = img;
        repaint();
    }
}
