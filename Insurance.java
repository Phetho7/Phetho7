/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pheth
 */
import java.util.Scanner;
public class Insurance {
    public static void main(String[] args){
        int currentYear;
        int birthYear;
        int premium;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter currentYear: ");
        currentYear = scanner.nextInt();
        
        System.out.println("Enter birthYear: ");
        birthYear = scanner.nextInt();
        
        premium = calculatePremium(currentYear, birthYear);
        System.out.println("Your insurance premium is: $" + premium);
    }
    public static int calculatePremium(int currentYear, int birthYear){
        int age = currentYear - birthYear;
        int decades = age/10;
        return (decades + 15)* 20;
    }
    
}
