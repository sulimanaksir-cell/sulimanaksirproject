/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.exercise24;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Chapter3Exercise24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("pick a card:\n"
                    + "first choose the rank:\n"
                    + "\n"
                    + "(write 1 for Ace), 2, 3, 4, .... , 10, (write 11 for jack, 12 for queen and 13 for king)");
            int rankofcard = input.nextInt();
            System.out.println("now pick the suit:\n"
                    + "wite 1 for clubs, 2 for diamonds, 3 for hearts, and 4 for spades");
            int suitofcard = input.nextInt();
            
            String rankName = "";
            switch (rankofcard){
                case 1: rankName = "Ace"; break;
                case 2: rankName = "2"; break;
                case 3: rankName = "3"; break;
                case 4: rankName = "4"; break;
                case 5: rankName = "5"; break;
                case 6: rankName = "6"; break;
                case 7: rankName = "7"; break;
                case 8: rankName = "8"; break;
                case 9: rankName = "9"; break;
                case 10: rankName = "10"; break;
                case 11: rankName = "Jack"; break;
                case 12: rankName = "Queen"; break;
                case 13: rankName = "King"; break;
            }
            String suitName = "";
            switch (suitofcard){
                case 1: suitName = "Clubs"; break;
                case 2: suitName = "Diamonds"; break;
                case 3: suitName = "Hearts"; break;
                case 4: suitName = "Spades"; break;
            }
            System.out.println("the card you picked is " + rankName + " of " + suitName);
    }
    
}
