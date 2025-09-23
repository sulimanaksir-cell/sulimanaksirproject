import java.util.Scanner;

public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int lottry = (int)(Math.random()*100);
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enteryour lottry pick(tow digits):");
        int guess = input.nextInt();
        
        int lottryDigit1 = lottry / 10;
        int lottryDigit2 = lottry % 10;
        
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        
        System.out.println("the lottry number is" + lottry);
        
        if (guess == lottry)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lottryDigit1 && guessDigit1 == lottryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lottryDigit1 || guessDigit1 == lottryDigit2 || guessDigit2 == lottryDigit1 || guessDigit2 == lottryDigit2 )
            System.out.println("Match one digit: you win $1,000");
        else 
            System.out.println("Soory, no match");
            
       
            
        
    }
    
}
