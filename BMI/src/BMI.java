import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your weight");
        double weight = input.nextDouble();
        System.out.println("Enter your height");
        double height = input.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("BMI = " + BMI);
        
        if (BMI<18.5) {
            System.out.println("under weight");
            
        }
        else if (BMI>=18.5 && BMI<25) {
            System.out.println("Normal");
            
        }
        else if (BMI>=25 && BMI<30) {
            System.out.println("over weight");
            
    }
        else if (BMI>=30) {
        System.out.println("obese");
        
    }
    }
}
