/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise14;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter your weight in pounds:");
        double weightP = input.nextDouble();
        System.out.println("enter your height in inches:");
        double heightI = input.nextDouble();
        
        double BMI = (weightP * 0.45359237) / ((heightI * 0.0254) * (heightI * 0.0254));
        System.out.printf("BMI is %.4f\n", BMI);

    }
    
}
