/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise11;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("this program will tell that how much is the population of the USA in the next years:");
        double current_population = 312032486;
        
        double birthPerYear = 4505142;
        double diePerYear = 2425846;
        double newImmigrants = 700800;
        
        double change = birthPerYear - diePerYear + newImmigrants;
         
        System.out.println("enter the number of years:");
        int numYears = input.nextInt();
        
        double population2 = (change * numYears) + current_population;
        
        System.out.println("after " + numYears + " years the population is " + population2);
    }
    
}
