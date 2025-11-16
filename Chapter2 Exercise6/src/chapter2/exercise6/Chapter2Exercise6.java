/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise6;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number between 1 to 999 to sum up it's digits: ");
        int number = input.nextInt();
        
        int a,b,c;
        a = number%10;
        number /= 10;
        b = number%10;
        c = number/10;
       
        
        System.out.println("The sum of the digits of this number is: " + (a+b+c));
    }
    
}
