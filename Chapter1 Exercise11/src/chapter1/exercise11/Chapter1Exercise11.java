/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.exercise11;

/**
 *
 * @author Dell
 */
public class Chapter1Exercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("this program will tell that how much is the population of the USA in the next five years:");
        double current_population = 312032486;
        
        double birthPerYear = 4505142;
        double diePerYear = 2425846;
        double newImmigrants = 700800;
        
        double change = birthPerYear - diePerYear + newImmigrants;
        double firstYear = change + current_population;
        
        System.out.println("the population in next year is: " + (firstYear));
        
        double secondYear = (change * 2) + current_population;
        System.out.println("the population in second year is: " + secondYear);
        
        double thirdYear = (change* 3) + current_population;
        System.out.println("the population in third year is: " + thirdYear);
        
        double forthYear = (change * 4) + current_population;
        System.out.println("the population in forth year is: " + forthYear);
        
        double fifthYear = (change * 5) + current_population;
        System.out.println("the population in fifth year is: " + fifthYear);
    }
    
}
