/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.exercise18;

/**
 *
 * @author Dell
 */
public class Chapter2Exercise18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("this program prints a table about pows"
                + "\n"
                + "\n");
        int first11 = (int) Math.pow(1, 2);
        int second22 = (int) Math.pow(2, 3);
        int third33 = (int) Math.pow(3, 4);
        int forth44 = (int) Math.pow(4, 5);
        int fifth55 = (int) Math.pow(5, 6);
        
        System.out.println("a         b        pow(a, b)\n"
                         + "1         2        " + first11 + "\n"
                         + "2         3        " + second22 + "\n"
                         + "3         4        " + third33 + "\n"
                         + "4         5        " + forth44 + "\n"
                         + "5         6        " + fifth55);
    }
    
}
