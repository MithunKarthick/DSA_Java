package assignments.first_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = new Scanner(System.in).nextInt();
        String fibSeries = "0, 1";
        int n1 = 0;
        int n2 = 1;
        int fibNo = 0;
        for (int i = 0; i < n - 2; i++) {
            fibNo = n1 + n2;
            fibSeries = fibSeries + ", " + fibNo;
            n1 = n2;
            n2 = fibNo;
        }
        System.out.println(fibSeries);
    }
}
