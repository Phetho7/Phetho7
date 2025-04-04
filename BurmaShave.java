/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burmashave;

/**
 *
 * @author 25024102
 */

import javax.swing.JOptionPane;

public class BurmaShave {
    public static void main(String[] args){
        String[] rhyme ={
            "shaving brushes",
            "You'll soon see 'em",
            "On a shelf",
            "In some museum",
            "In some museum",
            "Burma Shave", }; 
        
        for(String line : rhyme){
            JOptionPane.showMessageDialog(null,line);
            
        }
        
    }
}