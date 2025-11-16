/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise22;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the cordinate of x");
            double xcor22 = input.nextDouble();
            System.out.println("enter the cordinate of y");
            double ycor22 = input.nextDouble();
            
            double distance22 = Math.sqrt(Math.pow(xcor22, 2) + Math.pow(ycor22, 2));
            if (distance22 < 10)
                System.out.println("the point is inside the circle");
            else if(distance22 == 10)
                System.out.println("the point is on the perimeter of the circle");
            else if(distance22 > 10)
                System.out.println("the point is outside of the circle");
    }
    
}
