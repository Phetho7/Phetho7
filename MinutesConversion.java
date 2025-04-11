/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutesconversion;
import java.util.Scanner;
/**
 *
 * @author 25024102
 */
public class MinutesConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double days;
        double minutes;
        double hours;
        
        System.out.println("Enter your minutes: ");
        minutes = sc.nextInt();
        
        hours = minutes/60;
        days = hours/24;
        
        System.out.println("Your hours are: "+ hours);
        System.out.println("Your days are: "+ days);
        
        
        
    }        
        

}
           
   