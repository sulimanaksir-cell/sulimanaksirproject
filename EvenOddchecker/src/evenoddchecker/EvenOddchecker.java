/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenoddchecker;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class EvenOddchecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);   
     System.out.print("Enter a nember:");
     int nember = input.nextInt();
     if (nember % 2 == 0) {
         System.out.println(nember+"is an even nember.:");
     } else {
         System.out.print(nember+"is an odd nember.:");
         
     }
    }
    
}
