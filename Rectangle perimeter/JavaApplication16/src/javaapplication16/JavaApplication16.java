package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);   
     System.out.println("Enter the length:"); 
     double length = input.nextDouble();
      System.out.println("Enter the width:");
       double width = input.nextDouble();
     double perimeter = 2*(length+width); 
      System.out.println("perimeter of the rectangle:"+perimeter);
      
    }
    
}
