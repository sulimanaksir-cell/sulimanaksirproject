/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise13;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("this program will say your account value for six months with 5% annual interest rate!\n"
                         + "enter the amount of monthly savings:");
        int monthlySaving = input.nextInt();
        
        double interestRate = 0.00417;
        double accountValue = 0;
        
        //after first month:
        double firstMonth1 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = firstMonth1;
        System.out.println("after first month account is " + firstMonth1);
        
        double secondMonth2 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = secondMonth2;
        System.out.println("after two months account is " + secondMonth2);
        
        double thirdMonth3 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = thirdMonth3;
        System.out.println("after three months account is " + thirdMonth3);
        
        double forthMonth4 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = forthMonth4;
        System.out.println("after four months account is " + forthMonth4);
        
        double fifthMonth5 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = fifthMonth5;
        System.out.println("after five months account is " + fifthMonth5);
        
        double sixthMonth6 = (monthlySaving + accountValue) * (1 + interestRate);
        accountValue = sixthMonth6;
        System.out.println("after six month account is " + sixthMonth6);

    }
    
}
