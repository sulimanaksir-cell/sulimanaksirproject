/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise7;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter total amount of cents: ");
            int totalCents = input.nextInt();
 

            int numberOfOneDollars = totalCents / 100;
            totalCents = totalCents % 100;

            int numberOfQuarters = totalCents / 25;
            totalCents = totalCents % 25;

            int numberOfDimes = totalCents / 10;
            totalCents = totalCents % 10;

            int numberOfNickels = totalCents / 5;
            totalCents = totalCents % 5;

            int numberOfPennies = totalCents;

            if (numberOfOneDollars > 0)
                System.out.println(numberOfOneDollars + " " + (numberOfOneDollars == 1 ? "dollar" : "dollars"));

            if (numberOfQuarters > 0)
                System.out.println(numberOfQuarters + " " + (numberOfQuarters == 1 ? "quarter" : "quarters"));

            if (numberOfDimes > 0)
                System.out.println(numberOfDimes + " " + (numberOfDimes == 1 ? "dime" : "dimes"));

            if (numberOfNickels > 0)
                System.out.println(numberOfNickels + " " + (numberOfNickels == 1 ? "nickel" : "nickels"));

            if (numberOfPennies > 0)
                System.out.println(numberOfPennies + " " + (numberOfPennies == 1 ? "penny" : "pennies"));

    }
    
}
