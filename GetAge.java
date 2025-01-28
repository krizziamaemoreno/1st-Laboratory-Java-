/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getage;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class GetAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Ask for the current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        //Ask for the user's birth year 
        System.out.print("Enter your birthday: ");
        int birthYear = scanner.nextInt();
        
        //Calculate Age
        int age = currentYear - birthYear;
        
        //Print the age
        System.out.print("You are " + age + " years old");
        
        scanner.close();
    }
    
}
