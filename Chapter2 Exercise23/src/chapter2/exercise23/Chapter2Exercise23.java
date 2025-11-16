/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise23;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the distance you want to travel:");
        double distance_car = input.nextDouble();
        System.out.println("enter the car's usage of fuel in  miles per gallon:");
        double car_usage = input.nextDouble();
        System.out.println("enter the cost of each gallon of the fuel:");
        double fuel_cost = input.nextDouble();
        
        double fuel_total_cost = (distance_car / car_usage) * fuel_cost;
        System.out.println("the total cost will be: " + fuel_total_cost);
          
    }
    
    public static double distance(double x1, double y1, double x2, double y2){
    
        double distance = 0;
        
        double xcordinate = x2 - x1;
        double ycordinate = y2 - y1;
        
        distance = Math.sqrt(Math.pow(xcordinate, 2) + Math.pow(ycordinate, 2));
        
        return distance;
    }
}

class ShowCurrentTime {
    public static String ShowCurrentTime(int hour, int minute) {
    
        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = (totalSecond / 60) + minute;
        long currentMinute = totalMinute % 60;
        long totalHour = (totalMinute / 60) + hour;
        long currentHour = totalHour % 24;
        
        String time = currentHour + ":" + currentMinute + ":" + currentSecond;
        
        return time;
    }
    
}

    
    

