/**
 * Q5. Print the sum of the series 1^2 + 2^2 +3^2 up to n terms.
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        // Reading the number
        System.out.print("Enter a number: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();
        n_scanner.close();

        // Calculating sum of squares of natural numbers upto n
        int sum = 0;
        for (int i = 1; i < n + 1; ++i) {
            sum += i * i;
        }

        // Printing sum
        System.out.println("Sum of squares of natural numbers upto " + n + " is " + sum + ".");
    }
}
