/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise10;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
            
            int compresult10 = number1 + number2;
            
            System.out.println("what is the result of " + number1 + " + " + number2 + "?" );
            int userresult10 = input.nextInt();
            
            if(compresult10 == userresult10)
                System.out.println("correct!");
            else 
                System.out.println("wrong!");
    }
    
}
