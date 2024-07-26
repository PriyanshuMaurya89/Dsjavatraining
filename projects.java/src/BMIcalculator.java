

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print(" Your Body Mass Index (BMI) is " + BMI + " kg/m2");
    }


}