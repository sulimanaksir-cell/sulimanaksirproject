/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise12;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter a three digit integer to check if it is palindrome:");
            int threedigit12 = input.nextInt();
            
            int firstdigit = threedigit12 / 100;
            int lastdigit = threedigit12 % 10;
            
            if (firstdigit == lastdigit)
                System.out.println(threedigit12 + " is palindrome");
            else 
                System.out.println(threedigit12 + " is not palindrome");
    }
    
}
