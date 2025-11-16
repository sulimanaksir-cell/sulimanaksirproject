/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise17;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int compchoice = (int)(Math.random() * 3);
            System.out.println("choose scissors (0) rock (1) and paper (2)");
            int userchoice = input.nextInt();
            
            if(compchoice == 0){
                if(userchoice == 0)
                    System.out.println("computer is also scissors. It is a draw");
                else if(userchoice == 1)
                    System.out.println("computer was scissors, you are rock, you won");
                else if(userchoice == 2)
                    System.out.println("computer was scissors, you are paper, computer won");
            }
            else if(compchoice == 1){
                if(userchoice == 0)
                    System.out.println("computer was rock, you are scissors, so computer won");
                else if(userchoice == 1)
                    System.out.println("computer was rock, you are also rock, it is a draw");
                else if(userchoice == 2)
                    System.out.println("computer was rock, you are paper, so you won");
            }
            else if(compchoice == 2){
                if(userchoice == 0)
                    System.out.println("computer was paper, you are scissors, so you won");
                else if(userchoice == 1)
                    System.out.println("computer was paper, you are rock, so computer won");
                else if(userchoice == 2)
                    System.out.println("computer was paper, you are also paper, so it is a draw");
            }

    }
    
}
