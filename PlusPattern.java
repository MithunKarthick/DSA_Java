import java.util.Scanner;

// Creating '+' pattern
public class PlusPattern {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int midNumber = ((n / 2) + (n % 2));
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == midNumber) {
                    System.out.print('*');
                } else if (j == midNumber) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
