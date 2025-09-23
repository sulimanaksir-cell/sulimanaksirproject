import java.util.Scanner;

public class CircleAreaScanner {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number for radius:");
        double radius = input.nextDouble();
        double area = radius*radius*3.14159;
        System.out.println("area of circle:" + area);
        
    }
    
}
