/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise30;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("enter time zone offset to gmt:");
            int hour30 = input.nextInt();
            int minute30 = input.nextInt();
            System.out.println(ShowCurrentTime.ShowCurrentTime(hour30, minute30));

    }
    
}
