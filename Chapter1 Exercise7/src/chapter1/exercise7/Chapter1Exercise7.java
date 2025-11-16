/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.exercise7;

/**
 *
 * @author Dell
 */
public class Chapter1Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi_approximate1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double pi_approximate2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        
        System.out.println("the first approximate pi value is " + pi_approximate1 + " and second approximate pi value is " + pi_approximate2 + ".");
    }
    
}
