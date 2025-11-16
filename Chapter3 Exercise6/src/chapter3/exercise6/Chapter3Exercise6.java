/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise6;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter weight in pounds: ");
            double weight = input.nextDouble();

            System.out.println("Enter height feet: ");
            int feet = input.nextInt();
            System.out.println("enter the inchese:");
            int inches = input.nextInt();

            int totalInches = feet * 12 + inches;

            double weightInKilograms = weight * 0.45359237;
            double heightInMeters = totalInches * 0.0254;

            double bmi = weightInKilograms / (heightInMeters * heightInMeters);

            System.out.println("BMI is " + bmi);

            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25.0)
                System.out.println("Normal");
            else if (bmi < 30.0)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
    }
    
}
