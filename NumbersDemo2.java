/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbersdemo2;

/**
 *
 * @author pheth
 */
import java.util.Scanner;
public class NumbersDemo2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Working with num1: " + num1);
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        System.out.println("\nWorking with num2: " + num2);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);


              scanner.close();
    }

    public static void displayTwiceTheNumber(int num) {
        System.out.println("Twice the number: " + (num * 2));
    }

    public static void displayNumberPlusFive(int num) {
        System.out.println("Number plus five: " + (num + 5));
    }

    public static void displayNumberSquared(int num) {
        System.out.println("Number squared: " + (num * num));
    }
}
