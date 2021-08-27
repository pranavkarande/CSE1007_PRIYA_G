/**
 * Q4. Write a Java program to find the sum of the two elements of a given array
 * which is equal to a given integer.
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        // Taking array as input
        System.out.print("Enter number of elements in array: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter element " + (i + 1) + " of the array: ");
            arr[i] = n_scanner.nextInt();
        }
        System.out.println();

        // Taking required sum as input
        System.out.print("Enter required sum: ");
        int sum = n_scanner.nextInt();
        n_scanner.close();

        // Finding the required sum
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Elements with index " + i + " with value " + arr[i]
                            + " and elements with index " + j + " with value " + arr[j] + " add to form " + sum + ".");
                }
            }
        }
    }
}
