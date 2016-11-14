/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

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
                
                for(int ii = 0;screens.get(i).getNorthConnect()==null;ii++){
                    if(screens.get(ii).getName().equals(screens.get(i).getNorthConnectName())){
                        screens.get(i).setNorthConnect(screens.get(ii));
                    }
                }
                //connect east
                for(int ii = 0;screens.get(i).getEastConnect()==null;ii++){
                    if(screens.get(ii).getName().equals(screens.get(i).getEastConnectName())){
                        screens.get(i).setEastConnect(screens.get(ii));
                    }
                }
                //connect south
                for(int ii = 0;screens.get(i).getSouthConnect()==null;ii++){
                    if(screens.get(ii).getName().equals(screens.get(i).getSouthConnectName())){
                        screens.get(i).setSouthConnect(screens.get(ii));
                    }
                }
                //connect west
                for(int ii = 0;screens.get(i).getWestConnect()==null;ii++){
                    if(screens.get(ii).getName().equals(screens.get(i).getWestConnectName())){
                        screens.get(i).setWestConnect(screens.get(ii));
                    }
                }
            }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    public int dir(String dir){
        //if direction is equal to North, South, East or West
            if(dir.equals("N")){
                return 0;
            }else if(dir.equals("E")){
                return 1;
            }else if(dir.equals("S")){
                return 2;
            }else if(dir.equals("W")){
                return 3;
            }
            return -1;
        }
}
