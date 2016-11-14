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
            String direction = fileCreate.next();
            //loop to make arraylist of screens
            while(fileCreate.hasNext()){
                //make a new screen
                Screen s = new Screen(fileCreate);
                //add to list
                screens.add(s);
            }
            //close scanner
            fileCreate.close();
            //
            int ii;
            for(int i = 0; i < screens.size(); i++){
                //connect north
                ii=0;
                while(screens.get(i).getNorthConnect()==null){
                    if(screens.get(ii).getName().equals(screens.get(i).getNorthConnectName())){
                        screens.get(i).setNorthConnect(screens.get(ii));
                    }
                    ii++;
                }
                //connect east
                ii=0;
                while(screens.get(i).getEastConnect()==null){
                    if(screens.get(ii).getName().equals(screens.get(i).getEastConnectName())){
                        screens.get(i).setEastConnect(screens.get(ii));
                    }
                    ii++;
                }
                //connect south
                ii=0;
                while(screens.get(i).getSouthConnect()==null){
                    if(screens.get(ii).getName().equals(screens.get(i).getSouthConnectName())){
                        screens.get(i).setSouthConnect(screens.get(ii));
                    }
                    ii++;
                }
                //connect west
                ii=0;
                while(screens.get(i).getWestConnect()==null){
                    if(screens.get(ii).getName().equals(screens.get(i).getWestConnectName())){
                        screens.get(i).setWestConnect(screens.get(ii));
                    }
                    ii++;
                }
            }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
}
