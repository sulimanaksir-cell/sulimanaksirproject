/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise8;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your timezone based on GMT. \n"
                         + "first enter the hours:");
        int hours1 = input.nextInt();
        
        System.out.println("now enter the minutes:");
        int minutes1 = input.nextInt();
        
        System.out.println("your local time is: " + ShowCurrentTime.ShowCurrentTime(hours1, minutes1));
    }
    
}
