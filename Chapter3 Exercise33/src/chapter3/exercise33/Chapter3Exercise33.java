/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise33;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the weight and price of the first package:");
            double weightRice = input.nextDouble();
            double priceRice =  input.nextDouble();
            System.out.println("enter the weight and price of the second package:");
            double weightRice2 = input.nextDouble();
            double priceRice2 = input.nextDouble();
            
            double pricePerKilo1 = priceRice / weightRice;
            double pricePerKilo2 = priceRice2 / weightRice2;
            
            if(pricePerKilo1 < pricePerKilo2)
                System.out.println("package one is better!");
            else if(pricePerKilo2 < pricePerKilo1)
                System.out.println("package two is better!");
            else if(pricePerKilo1 == pricePerKilo2)
                System.out.println("both packages have the same price");

    }
    
}
