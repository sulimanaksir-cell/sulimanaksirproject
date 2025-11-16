/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise16;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the length of one side of the hexagon to compute the area:");
        double sideHex = input.nextDouble();
        double areahex =  (3 * Math.sqrt(3) * sideHex * sideHex) / 2.0;
        System.out.println("the area of this hexagon is: " + areahex);
    }
    
}
