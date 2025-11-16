/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise12;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("please enter the speed of the airplane in meters per second:");
        double speedOfPlane = input.nextDouble();
        
        System.out.println("please enter the acceleration of the airplane in meters per second square:");
        double accelerationPlane = input.nextDouble();
         
        double lengthOfRunway = (speedOfPlane * speedOfPlane) / (2 * accelerationPlane);
        
        System.out.println("the minimum length of the runway for taking off is " + lengthOfRunway);
 
    }
    
}
