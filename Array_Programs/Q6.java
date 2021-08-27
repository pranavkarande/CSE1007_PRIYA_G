/**
 * Display the transpose of a matrix.
 */

import java.util.Scanner;

public class Q6 {
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

        // Printing transpose
        System.out.println("Transpose of the given matrix is:");
        for (int i = 0; i < n_rows; ++i) {
            for (int j = 0; j < n_col; ++j) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
