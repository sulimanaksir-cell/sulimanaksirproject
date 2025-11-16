/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise7;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("Enter minutes to see how much years and days it is: ");
        double minutes = input.nextDouble();
        
        int years = (int)minutes / 525600;
        int remain = (int)minutes % 525600;
        int days = remain / 1440;
        
        System.out.println("This much minutes " + minutes + " is equal to " + years + " years and " + days + " days.");
    }
    
}
