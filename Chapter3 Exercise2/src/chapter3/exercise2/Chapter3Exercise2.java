/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);
            int num3 = (int)(Math.random() * 10);
            
            int compResult = num1 + num2 + num3;
            System.out.println("what is the result of " + num1 + " + " + num2 + " + " + num3 + "?");
            int userResult = input.nextInt();
            
            if (compResult == userResult)
                System.out.println("that was correct!");
            else 
                System.out.println("wrong answer!");
    }
    
}
