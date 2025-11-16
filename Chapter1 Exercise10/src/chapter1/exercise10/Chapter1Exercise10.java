/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.exercise10;

/**
 *
 * @author Dell
 */
public class Chapter1Exercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("a runner runs 14 kilometers in 45 minutes and 30 seconds.\n"
                + "this program will show this runners speed in miles per hour:");
        double distance = 14.0 / (1.6);
        double time = 45.5 / 60.0;
       
        double speed = distance / time;
        System.out.println("this runners average speed is " + speed + " miles per hour.");
    }
    
}
