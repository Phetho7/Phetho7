/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbersdemo;

/**
 *
 * @author pheth
 */
import java.util.Scanner;
public class NumbersDemo {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        
        System.out.println("Working with num1: " + num1);
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        
        System.out.println("Working with num2: " + num2);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
        
        public static void displayTwiceTheNumber(int num ){
            System.out.println("Twice the number: "+ (num*2) );}
        public static void displayNumberPlusFive(int num ){
            System.out.println("Number plus 5: " + (num + 5));}
        public static void displayNumberSquared(int num){
        System.out.println("Number squered 5: " + (num + 5));}
            
    }


        