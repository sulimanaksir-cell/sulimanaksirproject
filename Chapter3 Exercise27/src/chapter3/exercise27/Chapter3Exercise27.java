/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise27;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
            double x = input.nextDouble();
            double y = input.nextDouble();

            boolean inside = (x >= 0) && (y >= 0) && (y <= (-0.5 * x + 100));

            if (inside) {
                System.out.println("The point is inside the triangle.");
            } else {
                System.out.println("The point is not inside the triangle.");
            }
    }
    
}
