/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class Map {
    
    //
    private ArrayList<Screen> screens;
    private Screen location;
    private String direction;
    
    
    public Map(String fileName){
        // initialize the list
        screens = new ArrayList<>();
        try{
            //make a scanner to make screens
            Scanner fileCreate = new Scanner(new File(fileName));
            //read start position
            String start = fileCreate.next();
            fileCreate.nextLine();
            //read start direction
            this.direction = fileCreate.next();
            fileCreate.nextLine();
            //loop to make arraylist of screens
            while(fileCreate.hasNext()){
                //make a new screen
                Screen s = new Screen(fileCreate);
                //add to list
                screens.add(s);
            }
            //close scanner
            fileCreate.close();
            //connect all of the nodes
            for(int i = 0; i < screens.size(); i++){
                //connect north
                if(screens.get(i).getNorthConnectName() != null){
                    for(int ii = 0;screens.get(i).getNorthConnect()==null && ii != screens.size();ii++){
                        if(screens.get(ii).getName().equals(screens.get(i).getNorthConnectName())){
                            screens.get(i).setNorthConnect(screens.get(ii));
                        }
                    }
                }
                //connect east
                if(screens.get(i).getEastConnectName() != null){
                    for(int ii = 0;screens.get(i).getEastConnect()==null && ii != screens.size();ii++){
                        if(screens.get(ii).getName().equals(screens.get(i).getEastConnectName())){
                            screens.get(i).setEastConnect(screens.get(ii));
                        }
                    }
                }
                //connect south
                if(screens.get(i).getSouthConnectName() != null){
                    for(int ii = 0;screens.get(i).getSouthConnect()==null && ii != screens.size();ii++){
                        if(screens.get(ii).getName().equals(screens.get(i).getSouthConnectName())){
                            screens.get(i).setSouthConnect(screens.get(ii));
                        }
                    }
                }
                //connect west
                if(screens.get(i).getWestConnectName() != null){
                    for(int ii = 0;screens.get(i).getWestConnect()==null && ii != screens.size();ii++){
                       if(screens.get(ii).getName().equals(screens.get(i).getWestConnectName())){
                            screens.get(i).setWestConnect(screens.get(ii));
                        }
                    }
                }
            }
            //set starting location
            for(int i = 0; i<screens.size();i++){
                if(screens.get(i).getName().equals(start)){
                    location = screens.get(i);
                }
            }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Convert directions from strings to integer
     * @param dir single character string that represent the cardinal directions
     * @return integer from 0-3 representing the cardinal directions
     */
    private int dir(String dir){
        //if direction is equal to North, South, East or West
        switch (dir) {
            case "N":
                return 0;
            case "E":
                return 1;
            case "S":
                return 2;
            case "W":
                return 3;
            default:
                break;
        }
            return -1;
        }
    /**
     * changes direction to turn left
     */
    public void turnLeft(){
        switch(dir(this.direction)){
            case 0:
                this.direction = "W";
                break;
            case 1:
                this.direction = "N";
                break;
            case 2:
                this.direction = "E";
                break;
            case 3:
                this.direction = "S";
                break;
            default:
                break;
        }
    }
    /**
     * changes direction to turn right
     */
    public void turnRight(){
        switch(dir(this.direction)){
            case 0:
                this.direction = "E";
                break;
            case 1:
                this.direction = "S";
                break;
            case 2:
                this.direction = "W";
                break;
            case 3:
                this.direction = "N";
                break;
            default:
                break;
        }
    }
    /**
     * move location in facing direction and change direction
     */
    public void move(){
        switch(dir(this.direction)){
            case 0:
                if(this.location.getNorthConnect() != null){
                    this.direction = this.location.getNorthMoveDir();
                    this.location = this.location.getNorthConnect();
                }
                break;
            case 1:
                if(this.location.getEastConnect() != null){
                    this.direction = this.location.getEastMoveDir();
                    this.location = this.location.getEastConnect();
                }
                break;
            case 2:
                if(this.location.getSouthConnect() != null){
                    this.direction = this.location.getSouthMoveDir();
                    this.location = this.location.getSouthConnect();
                }
                break;
            case 3:
                if(this.location.getWestConnect() != null){
                    this.direction = this.location.getWestMoveDir();
                    this.location = this.location.getWestConnect();
                }
                break;
            default:
                break;
        }
    }
    
    public BufferedImage getImage(){
        switch(this.direction){
            case "N":
                return location.getNorthImage();
            case "E":
                return location.getEastImage();
            case "S":
                return location.getSouthImage();
            case "W":
                return location.getWestImage();
            default:
                return null;
        }
    }
}
