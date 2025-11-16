/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise15;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int comp_num = (int)(Math.random() * 100);
            System.out.println("Enter a two digit number: ");
            int user_num = input.nextInt();
        
            int a15 = comp_num / 10;
            int b15 = comp_num % 10;
        
            int c15 = user_num / 10;
            int d15 = user_num % 10;
            
            if ((c15 == a15) && (b15 == d15))
                System.out.println("That was correct and you won 10000 US Dollors! ");
            else if ((c15 == b15) && (d15 == a15))
                System.out.println("The order wasn't correct but the digits were correct so you won 3000 US Dollors! ");
            else if ((c15 == a15) || (d15 == b15))
                System.out.println("Only one digit was correct so you won 1000 US Dollors! ");
            else if ((c15 == b15) || (d15 == a15))
                System.out.println("Only one digit was correct so you won 1000 US Dollors!");
            else 
                System.out.println("Unfortunately the number you entered didn't match the auto generated number.");
    }
    
}
