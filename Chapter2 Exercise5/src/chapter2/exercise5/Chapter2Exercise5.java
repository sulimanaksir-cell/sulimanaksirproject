/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("Enter the subtotal price of the product:");
        int price = input.nextInt();
        
        System.out.println("Enter the gratuity percentage:");
        int percentage = input.nextInt();
        
        float gratuity = price * (percentage/100f);
        float total = price + gratuity;
        
        System.out.println("the gratuity is $" + gratuity + " and the total amount is $" + total);

    }
    
}
