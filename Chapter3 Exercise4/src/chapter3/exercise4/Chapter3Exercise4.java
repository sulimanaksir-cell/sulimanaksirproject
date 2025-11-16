/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise4;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int randomMonth = (int)((Math.random() * 12) + 1);
            String monthName = "";
            switch (randomMonth){
                case 1: monthName = "January"; break;
                case 2: monthName = "February"; break;
                case 3: monthName = "March"; break;
                case 4: monthName = "April"; break;
                case 5: monthName = "May"; break;
                case 6: monthName = "June"; break;
                case 7: monthName = "July"; break;
                case 8: monthName = "August"; break;
                case 9: monthName = "September"; break;
                case 10: monthName = "October"; break;
                case 11: monthName = "November"; break;
                case 12: monthName = "December";
            }
            System.out.println(monthName);

    }
    
}
