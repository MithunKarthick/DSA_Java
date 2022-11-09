package assignments.first_java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number range:");
        int n1 = input.nextInt();
        System.out.println("Enter starting number range:");
        int n2 = input.nextInt();
        int cube = 0;
        int n = 0;
        int temp = 0;
        for (Integer i = n1; i <= n2; i++) {
            temp = i;
            for (int j = 0; j < i.toString().length(); j++) {
                n = temp % 10;
                cube = cube + (n * n * n);
                temp /= 10;
            }
            if (i.intValue() == cube) {
                System.out.println("Armstrong Number is: " + cube);
//                break;
            }
            cube = 0;
        }
    }
}
