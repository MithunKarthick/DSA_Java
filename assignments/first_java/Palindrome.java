package assignments.first_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        String s = new Scanner(System.in).next().toLowerCase();
        int n = s.length();
        String sRev = "";
        for (int i = n - 1; i >= 0; i--) {
            sRev = sRev + s.charAt(i);
        }
        System.out.println("The entered string is " + (s.equals(sRev) ? "a Palindrom" : "not a Palindrome"));
    }
}
