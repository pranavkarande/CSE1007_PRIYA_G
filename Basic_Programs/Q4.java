/**
 * Q4. Print the sum of first n numbers. If n is 3 then print the sum of 1+2+3 to the user.
 * Get n from the user.
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        // Reading the number
        System.out.print("Enter a number: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();
        n_scanner.close();

        // Calculating sum of natural numbers upto n
        int sum = 0;
        for (int i = 1; i < n + 1; ++i) {
            sum += i;
        }

        // Printing sum
        System.out.println("Sum of natural numbers upto " + n + " is " + sum + ".");
    }
}
