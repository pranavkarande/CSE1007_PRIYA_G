/**
 * Q2. Read the number and check whether it is divisible by 3 and 5.
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        // Reading the number
        System.out.print("Enter a number: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();
        n_scanner.close();

        // Checking if the number is divisible by 3 and 5
        if ((n % 3 == 0) && (n % 5 == 0)) {
            System.out.println(n + " is divisible by 3 and 5.");
        }
        else {
            System.out.println(n + " is not divisible by 3 and 5.");
        }
    }
}
