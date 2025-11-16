/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise9;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("enter the 9 digit of ISBN:");
            int nineISBN = input.nextInt();
            final int nineISBNFinal = nineISBN;
            
            
            int d9 = nineISBN % 10;
            nineISBN /= 10;
            int d8 = nineISBN % 10;
            nineISBN /= 10;
            int d7 = nineISBN % 10;
            nineISBN /= 10;
            int d6 = nineISBN % 10;
            nineISBN /= 10;
            int d5 = nineISBN % 10;
            nineISBN /= 10;
            int d4 = nineISBN % 10;
            nineISBN /= 10;
            int d3_ = nineISBN % 10;
            nineISBN /= 10;
            int d2 = nineISBN % 10;
            int d1 = 0;
            
            int tenISBN = ((d1 * 1) + (d2 * 2) + (d3_ * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + ( d9 * 9)) % 11;
            
            if (tenISBN == 10)
                System.out.println("0" + nineISBNFinal + "X");
            else if (tenISBN < 10)
                System.out.println("0" + nineISBNFinal + "" + tenISBN);
    }
    
}
