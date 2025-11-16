/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise22;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the amount of cents to convert them to dollors and cents:");
        int total_cents = input.nextInt();
        
        int dollors = total_cents / 100;
        
        int cents = total_cents % 100;
        System.out.println("this much cents is equal to " + dollors + " dollors and " + cents + " cents");

    }
    
}
