package assignments.first_java;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        System.out.println("The entered number is " + ( new Scanner(System.in).nextInt() % 2 == 0 ? "Even" : "Odd"));
    }
}
