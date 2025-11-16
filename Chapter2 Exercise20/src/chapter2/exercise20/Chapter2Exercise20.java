/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise20;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the balance:");
        double balance0 = input.nextDouble();
        System.out.println("enter the interest rate without the percentage:");
        double interestrate44 = input.nextDouble();
        
        double interest00 = balance0 * (interestrate44 / 1200.0);
        System.out.println("the interest is " + interest00);

    }
    
}
