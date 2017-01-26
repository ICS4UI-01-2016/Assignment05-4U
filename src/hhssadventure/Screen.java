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
 * @author Brendan
 */
public class Screen {

    private String direction;
    private String locationName;

    private BufferedImage image;

    private boolean pathNotBlocked;

    private String secLocation;
    private String secDirection;

    public Screen(String locationName, Scanner in) {

        this.locationName = locationName;
        this.direction = in.next();

        String imageName = in.next();

        try {
            this.image = ImageIO.read(new File("images/" + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (in.next().equals("true")) {
            this.pathNotBlocked = false;
        } else {
            this.pathNotBlocked = true;
        }

        if (this.pathNotBlocked) {
            this.secLocation = in.next();
            this.secDirection = in.next();
        }
    }

    public String getLocation() {
        return this.locationName;
    }

    public String getDirection() {
        return this.direction;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public boolean getPathNotBlocked() {
        return this.pathNotBlocked;
    }

    public String getSecLocation() {
        return this.secLocation;
    }

    public String getSecDirection() {
        return this.secDirection;
    }
}
