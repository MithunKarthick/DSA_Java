package assignments.first_java;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Enter your name ");
        System.out.println("Hi " + new Scanner(System.in).nextLine());
    }
}
