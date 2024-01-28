package Labs;

import java.util.*;

public class BodyMassIndex {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your age: ");
        double age = input.nextDouble();

        if (age <= 16) {
            System.out.println("You are underage.");
            return;
        }

        System.out.print("Please enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Please enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = (weight/(Math.pow(height, 2)));

        if(bmi >= 30)
            System.out.println("Obese");
        else if(bmi >= 25)
            System.out.println("Overweight");
        else if(bmi >= 18.5)
            System.out.println("Normal");
        else System.out.println("Underweight");
    }
    
}
