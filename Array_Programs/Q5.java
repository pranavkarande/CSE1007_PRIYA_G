/**
 * Q5. Display the sum of rows in a matrix
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        // Taking matrix as input
        System.out.print("Enter number of rows in the matrix: ");
        Scanner n_scanner = new Scanner(System.in);
        int n_rows = n_scanner.nextInt();
        System.out.print("Enter number of columns in the matrix: ");
        int n_col = n_scanner.nextInt();

        int[][] arr = new int[n_rows][n_col];
        for (int i = 0; i < n_rows; ++i) {
            System.out.print("Enter elements of row " + (i + 1) + " of the matrix separated by spaces: ");
            for (int j = 0; j < n_col; ++j) {
                arr[i][j] = n_scanner.nextInt();
            }
        }
        System.out.println();
        n_scanner.close();

        // Printing sum of rows
        int sum = 0;
        for (int k = 0; k < n_rows; ++k) {
            for (int j : arr[k]) sum += j;
            System.out.println("Sum of elements of row " + (k + 1) + " is " + sum + ".");
            sum = 0;
        }
    }
}
