/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.exercise8;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter1Exercise8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the radius of the circle to calculate the perimeter and area:");
        double radius = input.nextDouble();
        
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("the perimeter of this circle is " + perimeter + " and the area of the circle is " + area + ".");
    }
    
}
