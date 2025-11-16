/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise9;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        float v1, v2, t, averageAcceleration;
        System.out.println("enter the stating velocity:");
        v1 = input.nextFloat();
        
        System.out.println("enter current velocity:");
        v2 = input.nextFloat();
        
        System.out.println("enter the time span:");
        t = input.nextFloat();
        
        averageAcceleration = (v2 - v1) / t;
        System.out.println("the average acceleration is " + averageAcceleration);

    }
    
}
