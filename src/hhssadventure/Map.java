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
 * @author Ajay
 */
public class Map {
    private ArrayList<screen> screens;
   
     
     public Map(String fileName){
       //initializ the list
         screens = new ArrayList<>();
         try {
             //make the scanner
             Scanner input = new Scanner (new File(fileName));
             //make screens
             //loop to the end of file
             while(input.hasNext()){
              //creating a screen from the scanner   
              screen s = new screen(input);   
              //added the created screen from the listy
              screens.add(s);
             }
         
         } catch (FileNotFoundException ex) {
             ex.printStackTrace();
         }
     }
     
    
     public screen getScreen(String Location, String Direction){
         //go through each screen
         for(screen s: screens){
          // checks if everything matches
              
         }
         return null;
     }
     
}
