/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise14;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         int headortail = (int) (Math.random() * 2);
            
            System.out.println("guess if it's head or tail?\n"
                             + " 1 for head and 0 for tail");
            int userguess14 = input.nextInt();
            
            if ((headortail == userguess14) && headortail == 1)
                System.out.println("great it was tail");
            else if ((headortail == userguess14) && headortail == 0)
                System.out.println("great it was head");
            else 
                System.out.println("wrong guess!");
    }
    
}
