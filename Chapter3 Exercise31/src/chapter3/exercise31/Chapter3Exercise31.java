/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise31;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the exchange rate from dollors to RMB:");
            double exchangeRate = input.nextDouble();
            System.out.println("enter 0 to convert dollors to RMB and 1 for vice versa:");
            int decision31 = input.nextInt();
            if(decision31 == 0){
                System.out.println("enter the dollor amount:");
                double dollors = input.nextDouble();
                double converted = dollors * exchangeRate;
                System.out.println("this much dollors is equal to " + converted + " RBM");
            }
            else if(decision31 == 1){
                System.out.println("enter the amount of RBM:");
                double RBM = input.nextDouble();
                double converted = RBM / exchangeRate;
                System.out.printf("this much RMB is equal to $%.2f\n", converted);
            }

    }
    
}
