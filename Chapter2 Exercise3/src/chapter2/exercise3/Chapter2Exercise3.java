/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the amount of feets to convert it to meters:");
        float feets = input.nextFloat();
        
        float meters = feets * 0.305f;
        
        System.out.println(feets + " feets is equal to " +  meters + " meters.");

    }
    
}
