/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise10;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        float water1, initialTemp, finalTemp, energy;
        System.out.println("enter amount of waters in kilograms:");
        water1 = input.nextFloat();
        
        System.out.println("enter the waters initial temperature:");
        initialTemp = input.nextFloat();
        
        System.out.println("enter the waters final temperature:");
        finalTemp = input.nextFloat();
        
        energy = water1 * (finalTemp - initialTemp) * 4184;
        
        System.out.println("amount of energy needed to heat the water is " + energy + " jouls.");

    }
    
}
