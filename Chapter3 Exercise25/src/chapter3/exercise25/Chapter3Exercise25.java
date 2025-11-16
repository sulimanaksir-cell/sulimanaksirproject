/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise25;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
            double x125 = input.nextDouble();
            double y125 = input.nextDouble();
            double x225 = input.nextDouble();
            double y225 = input.nextDouble();
            double x325 = input.nextDouble();
            double y325 = input.nextDouble();
            double x425 = input.nextDouble();
            double y425 = input.nextDouble();

            
            double a125 = y125 - y225;
            double b125 = -(x125 - x225);
            double c125 = a125 * x125 + b125 * y125;

            double a225 = y325 - y425;
            double b225 = -(x325 - x425);
            double c225 = a225 * x325 + b225 * y325;

            double det = a125 * b225 - a225 * b125;

            if (det == 0) {
                System.out.println("The two lines are parallel.");
            } else {
                double x25 = (c125 * b225 - c225 * b125) / det;
                double y25 = (a125 * c225 - a225 * c125) / det;
                System.out.printf("The intersecting point is at (%.5f, %.5f)%n", x25, y25);
            }

    }
    
}
