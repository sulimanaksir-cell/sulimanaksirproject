/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.exercise12;

/**
 *
 * @author Dell
 */
public class Chapter1Exercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("a runner runs 24 miles in 1 hour 40 minutes and 35 seconds.\n"
                + "this program will show the runners speed in kilometers per hour: ");
        
        double distanceInKilometers = 24 * 1.6;
        double time2 = 1.676383;
        
        double speedInKilometers = distanceInKilometers / time2;
        
        System.out.println("the speed is " + speedInKilometers + " kilometers per hour.");
        
    // exercise 13

        System.out.println("this program will solve this linear equation:\n"
                         + "3.4x + 50.2y = 44.5\n"
                         + "2.1x + 5.5y = 5.9");
        if(((3.4 * 5.5) - (50.2 * 2.1)) != 0){
            double x = ((44.5 * 5.5) - (50.2 * 5.9)) / ((3.4 * 5.5) - (50.2 * 2.1));
            double y = ((3.4 * 5.9) - (2.1 * 44.5)) / ((3.4 * 5.5) - (50.2 * 2.1));
            
            System.out.println("the x value is " + x + " and y value is " + y);
        }
        else 
            System.out.println("this equation doesnt have any solution!");
        
        
    }
    
}

    
    
