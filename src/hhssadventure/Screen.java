/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author brayden
 */
public class Screen {

    private String areaName;
    private String direction;
    private BufferedImage image;
    private boolean canMove;
    private String aftrArea;
    private String aftrDir;

    public Screen(String AreaName, Scanner in) {

        this.areaName = AreaName;

        this.direction = in.next();

        String imageName = in.next();

        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (in.next().equals("true")) {
            this.canMove = false;
        } else {
            this.canMove = true;
        }

        if (this.canMove) {
            this.aftrArea = in.next();
            this.aftrDir = in.next();
        }
    }

    public String getAreaName() {
        return this.areaName;
    }

    public String getDirection() {
        return this.direction;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public boolean getCanMove() {
        return this.canMove;
    }

    public String getAftrArea() {
        return this.aftrArea;
    }

    public String getAftrDir() {
        return this.aftrDir;
    }
    
}
