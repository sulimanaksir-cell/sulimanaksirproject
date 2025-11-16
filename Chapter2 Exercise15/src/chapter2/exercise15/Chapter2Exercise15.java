/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise15;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the x1:");
        int x1 = input.nextInt();
        System.out.println("enter the y1:");
        int y1 = input.nextInt();
        
        System.out.println("enter the x2:");
        int x2 = input.nextInt();
        System.out.println("enter the y2:");
        int y2 = input.nextInt();
        
        double xcordinate = x2 - x1;
        double ycordinate = y2 - y1;
        
        double distance = Math.sqrt(Math.pow(xcordinate, 2) + Math.pow(ycordinate, 2));
        System.out.println("distance between these two points is " + distance);

    }
    
}
