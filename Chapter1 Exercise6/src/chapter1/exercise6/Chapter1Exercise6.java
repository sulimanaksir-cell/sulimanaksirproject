
package chapter1.exercise6;

import java.util.Scanner;

public class Chapter1Exercise6 {

    public static void main(String[] args) {
  
        Scanner input = new Scanner (System.in);
     System.out.println("enter a number to calculate the summation from one to the selected number:");
        int num = input.nextInt();
        
        int sum = (num * (num + 1)) / 2;
        
        System.out.println("the sum of this numbers is " + sum);

    }
    
}
