/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise23;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the coordinate of x");
            double xcor23 = input.nextDouble();
            System.out.println("enter the coordinate of y");
            double ycor23 = input.nextDouble();
            
            xcor23 = Math.abs(xcor23);
            ycor23 = Math.abs(ycor23);
            
            if(xcor23 < 5.0 && ycor23 < 2.5)
                System.out.println("the point is inside the rectangle");
            else
                System.out.println("the point is outside of the rectangle");
    }
    
}
