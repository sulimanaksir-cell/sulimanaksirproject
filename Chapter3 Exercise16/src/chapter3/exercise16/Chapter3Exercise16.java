/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise16;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pointx = (int)((Math.random() * 201) - 100);
            int pointy = (int)((Math.random() * 101) - 50);
            
            System.out.println("random point that is inside the rectangle is:");
            System.out.println("(" + pointx + "," + pointy + ")");

    }
    
}
