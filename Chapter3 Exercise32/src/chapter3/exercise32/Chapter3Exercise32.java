/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise32;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the x and y coordinates of point one of the line:");
            double pointonex = input.nextDouble();
            double pointoney = input.nextDouble();
            System.out.println("enter the x and y coordinates of point two of the line:");
            double pointtwox = input.nextDouble();
            double pointtwoy = input.nextDouble();
            System.out.println("enter the x and y coordinates of the point to check its poisiton according to the line:");
            double pointxOf = input.nextDouble();
            double pointyOf = input.nextDouble();
            
            double cheking = ((pointtwox - pointonex)*(pointyOf - pointoney)) - ((pointxOf - pointonex)*(pointtwoy - pointoney));
            if(cheking > 0)
                System.out.println("the point is on the left side of the line");
            else if(cheking == 0)
                System.out.println("the point is on the same line");
            else if(cheking < 0)
                System.out.println("the point is on the right side of the line");
 
    }
    
}
