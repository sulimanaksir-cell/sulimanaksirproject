/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise18;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the wieght of the package to display the cost of shipping");
            int packageWeight = input.nextInt();
            
            if(packageWeight > 0 && packageWeight <= 1)
                System.out.println("the cost is $3.5");
            else if(packageWeight > 1 && packageWeight <= 3)
                System.out.println("the cost is $5.5");
            else if(packageWeight > 3 && packageWeight <= 10)
                System.out.println("the cost is $8.5");
            else if(packageWeight > 10 && packageWeight <= 20)
                System.out.println("the cost is $10.5");
            else if (packageWeight > 20)
                System.out.println("the package can not be shipped!");
            else 
                System.out.println("an invalid value was entered");

    }
    
}
