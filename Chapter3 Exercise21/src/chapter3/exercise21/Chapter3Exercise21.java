/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise21;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter the year");
            int year21 = input.nextInt();
            System.out.println("enter the month in form of numbers from 1 to 12");
            int month21 = input.nextInt();
            System.out.println("enter the day of the month:");
            int daymonth21 = input.nextInt();
            
            
            if (month21 == 1){
                month21 = 13;
                year21 -= 1;
            }
            else if(month21 == 2){
                month21 = 14;
                year21 -= 1;
            }
            
            int h = ((daymonth21 + ((26 * (month21 + 1)) / 10) + (year21 % 100) + ((year21 % 100) / 4) + ((year21 / 100) / 4) + ((year21 / 100) * 5)) % 7); 
            
            String dayname21 = "";
            switch(h){
                case 0: dayname21 = "saturday"; break;
                case 1: dayname21 = "sunday"; break;
                case 2: dayname21 = "monday"; break;
                case 3: dayname21 = "tuesday"; break;
                case 4: dayname21 = "wednesday"; break;
                case 5: dayname21 = "thursday"; break;
                case 6: dayname21 = "friday"; break;
            }
            System.out.println("day of the week is " + dayname21);

    }
    
}
