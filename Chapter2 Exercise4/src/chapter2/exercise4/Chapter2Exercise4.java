/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter amount of pounds to convert to kilograms:");
        float pounds = input.nextFloat();
        
        float kilograms = pounds * 0.454f;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
    }
    
}
