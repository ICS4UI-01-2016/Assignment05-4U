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
 *The ImageComponent extends to the JComponent
 * @author Ajay
 */
public class ImageCompontent extends JComponent{
    private BufferedImage image;
    
    /**
     * The ImageComponent is null
     */
    public ImageCompontent(){
        image = null;
    }
    /**
     * When the image is not null, the images will be displayed to the screen given the width and height
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g){
        if(image != null){
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
    
    /**
     * The image for the screen is set and repainted time after time to see the changes
     * @param img 
     */
    public void setImage(BufferedImage img){
        image = img;
        repaint(); // so we see the change being made
    }
}