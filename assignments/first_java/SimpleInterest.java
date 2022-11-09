package assignments.first_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int p = input.nextInt();
        System.out.println("Enter the time (in years): ");
        int t = input.nextInt();
        System.out.println("Enter the anual interest rate: ");
        float r = input.nextFloat();
        System.out.println("Amount = " + (p + ( p * t * r / 100 )));
    }
}
