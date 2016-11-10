import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595 & Kevin Y
 */
public class ImageComponent extends JComponent {
    private BufferedImage image;
    
    public ImageComponent(){
        image = null;      
    }
    
    @Override
    public void paintComponent(Graphics g){
        if(image != null){
            g.drawImage(image,0, 0, this.getWidth(), this.getHeight(), null);
        }
    }
    
    
    public void setImage(BufferedImage img){
        image = img;
        //To see a change done to the component itself
        repaint();
    }
}
