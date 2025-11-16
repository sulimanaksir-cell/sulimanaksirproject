/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise21;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter your investment amount: ");
        double investAmount = input.nextDouble();
        System.out.println("enter annual interest rate in percentage:");
        double annual_interest = input.nextDouble();
        System.out.println("enter number of years:");
        double num_of_year = input.nextDouble();
        
        double future_value = investAmount * Math.pow((1 + (annual_interest/1200.0)), (num_of_year * 12));
        System.out.println("investment is " + future_value);

    }
    
}
