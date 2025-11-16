/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise28;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
            double x128 = input.nextDouble();
            double y128 = input.nextDouble();
            double w128 = input.nextDouble();
            double h128 = input.nextDouble();

            System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
            double x228 = input.nextDouble();
            double y228 = input.nextDouble();
            double w228 = input.nextDouble();
            double h228 = input.nextDouble();

            double dx28 = Math.abs(x128 - x228);
            double dy28 = Math.abs(y128 - y228);

            if (dx28 <= (w128 / 2 - w228 / 2) && dy28 <= (h128 / 2 - h228 / 2)) {
                System.out.println("r2 is inside r1");
            } else if (dx28 <= (w128 / 2 + w228 / 2) && dy28 <= (h128 / 2 + h228 / 2)) {
                System.out.println("r2 overlaps r1");
            } else {
                System.out.println("r2 does not overlap r1");
            }
    }
    
}
