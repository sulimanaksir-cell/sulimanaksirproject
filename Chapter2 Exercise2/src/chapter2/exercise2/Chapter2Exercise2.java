/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Ente the radius of the cylinder:");
        double radiusOfCylinder = input.nextDouble();
        System.out.println("Enter the length of the cylinder:");
        double lengthOfCylinder = input.nextDouble();
        
        double areaOfCylinder = radiusOfCylinder * radiusOfCylinder * Math.PI;
        double volumeOfCylinder = areaOfCylinder * lengthOfCylinder; 
         
        System.out.println("the area of this cylinder is " + areaOfCylinder + " and volume of this cylinder is " + volumeOfCylinder);
 
    }
    
}
