package hhssadventure;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author prevw5940
 */
public class ImageComponent extends JComponent{
    private BufferedImage image;
    
    public ImageComponent(){
        image = null;
    }
    
    @Override
    public void paintComponents(Graphics g){
        if(image != null){
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
    
    public void setImage(BufferedImage img){
        image = img;
        repaint();
    }
}
