/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise8;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the first integer:");
            int one1 = input.nextInt();
            System.out.println("enter the second integer:");
            int two2 = input.nextInt();
            System.out.println("enter the third integer:");
            int three3 = input.nextInt();
            
            if (one1 > two2 && one1 > three3 && two2 > three3)
                System.out.println(one1 + " > " + two2 + " > " + three3);
            else if (two2 > one1 && two2 > three3 && one1 > three3)
                System.out.println(two2 + " > " + one1 + " > " + three3);
            else if (three3 > one1 && three3 > two2 && one1 > two2)
                System.out.println(three3 + " > " + one1 + " > " + two2);
            else if (one1 > three3 && one1 > two2 && three3 > two2)
                System.out.println(one1 + " > " + three3 + " > " + two2);
            else if (two2 > three3 && two2 > one1 && three3 > one1)
                System.out.println(two2 + " > " + three3 + " > " + one1);
            else if (three3 > two2 && three3 > one1 && two2 > one1)
                System.out.println(three3 + " > " + two2 + " > " + one1);

    }
    
}
