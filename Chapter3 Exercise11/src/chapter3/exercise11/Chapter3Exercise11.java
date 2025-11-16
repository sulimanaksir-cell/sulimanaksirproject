/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise11;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the month as a number between 1 to 12");
            int month11 = input.nextInt();
            System.out.println("enter the year");
            int year11 = input.nextInt();
            
            boolean febr = ((year11 % 400 == 0) || (year11 % 4 == 0 && year11 % 100 != 0)); 
            String monthName11 = "";
            
            switch (month11){
                case 1: monthName11 = "January"; break;
                case 2: monthName11 = "February"; break;
                case 3: monthName11 = "March"; break;
                case 4: monthName11 = "April"; break;
                case 5: monthName11 = "May"; break;
                case 6: monthName11 = "June"; break;
                case 7: monthName11 = "July"; break;
                case 8: monthName11 = "August"; break;
                case 9: monthName11 = "September"; break;
                case 10: monthName11 = "October"; break;
                case 11: monthName11 = "November"; break;
                case 12: monthName11 = "December";
            }
            
            int daysnumber = 0;
            if (month11 == 1 || month11 == 3 || month11 == 5 || month11 == 7 || month11 == 8 || month11 == 10 || month11 == 12)
                daysnumber =  31;
            else if (month11 == 4 || month11 == 6 || month11 == 9 || month11 == 11)
                daysnumber = 30;
            else if (month11 == 2) 
                daysnumber = febr? 29: 28;
            
            System.out.println(monthName11 + " " + year11 + " has " + daysnumber + " days");

    }
    
}
