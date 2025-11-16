/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise20;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the temprature in fahrenhiet between -58 and 41:");
            double degreeFah = input.nextDouble();
            System.out.println("enter the wind speed in miles per hour (should be greater than or equal to 2 miles per hour)");
            double windspeed = input.nextDouble();
            
            if((degreeFah >= -58 && degreeFah <= 41) && (windspeed >= 2)){
                double windChill = 35.74 + (0.6215 * degreeFah) - (35.75 * Math.pow(windspeed, 0.16)) + (0.4275 * degreeFah * Math.pow(windspeed, 0.16));
                System.out.println("the windchill temprature is " + windChill);
            }
            else if((degreeFah < -58 || degreeFah > 41) && windspeed < 2) 
                System.out.println("the temprature and speed are not in the range!");
            else if ((degreeFah < -58 || degreeFah > 41))
                System.out.println("the temprature is not in the range!");
            else if(windspeed < 2)
                System.out.println("the wind speed is not in the range!");

    }
    
}
