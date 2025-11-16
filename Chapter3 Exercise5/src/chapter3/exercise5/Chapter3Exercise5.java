/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter today's day:");
            int todaysDay = input.nextInt();
            System.out.println("enter the number of days elapsed since today:");
            int elapsedDays = input.nextInt();
            
            int totalDays = todaysDay + elapsedDays;
            if (totalDays >= 7){
                int cc = totalDays % 7;
                switch (cc){
                    case 0: System.out.println("saturday"); break;
                    case 1: System.out.println("sunday"); break;
                    case 2: System.out.println("monday"); break;
                    case 3: System.out.println("tuesday"); break;
                    case 4: System.out.println("wednesday"); break;
                    case 5: System.out.println("thursday"); break;
                    case 6: System.out.println("friday"); break;
                }
            }
            else if(totalDays < 7){
                switch (totalDays){
                    case 0: System.out.println("saturday"); break;
                    case 1: System.out.println("sunday"); break;
                    case 2: System.out.println("monday"); break;
                    case 3: System.out.println("tuesday"); break;
                    case 4: System.out.println("wednesday"); break;
                    case 5: System.out.println("thursday"); break;
                    case 6: System.out.println("friday"); break;
                }
            }

    }
    
}
