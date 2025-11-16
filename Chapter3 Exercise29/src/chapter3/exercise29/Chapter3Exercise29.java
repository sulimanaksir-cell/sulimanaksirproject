/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise29;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
            double x129 = input.nextDouble();
            double y129 = input.nextDouble();
            double r129 = input.nextDouble();

            System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
            double x229 = input.nextDouble();
            double y229 = input.nextDouble();
            double r229 = input.nextDouble();

            double dx29 = x129 - x229;
            double dy29 = y129 - y229;
            double distance = Math.sqrt(dx29 * dx29 + dy29 * dy29);

            if (distance <= Math.abs(r129 - r229)) {
                System.out.println("circle2 is inside circle1");
            } else if (distance <= (r129 + r229)) {
                System.out.println("circle2 overlaps circle1");
            } else {
                System.out.println("circle2 does not overlap circle1");
            }
    }
    
}
