/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise19;

import static java.awt.geom.Point2D.distance;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("this program will compute the area of triangle by the three points");
        System.out.println("enter the x1");
        double x1_tri = input.nextDouble();
        System.out.println("enter the y1");
        double y1_tri = input.nextDouble();
        
        System.out.println("enter the x2");
        double x2_tri = input.nextDouble();
        System.out.println("enter the y2");
        double y2_tri = input.nextDouble();
        
        System.out.println("enter the x3");
        double x3_tri = input.nextDouble();
        System.out.println("enter the y3");
        double y3_tri = input.nextDouble();
        
        double side1 = distance(x1_tri, y1_tri, x2_tri, y2_tri);
        double side2 = distance(x1_tri, y1_tri, x3_tri, y3_tri);
        double side3 = distance(x2_tri, y2_tri, x3_tri, y3_tri);
        
        double s = (side1 + side2 + side3)/2d;
        double areaTriangle = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        System.out.println("the area is equal to " + areaTriangle);
    }
    
}
