/**
 * Q2. Write a Java program to separate even and odd numbers of an given array of
 * integers. Put all even numbers first, and then odd numbers.
 */

import java.util.Scanner;

public class Q2 {
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
        n_scanner.close();

        // Creating new array and inserting elements in given order
        int[] out = new int[n];
        int out_ind = 0;

        // Adding even elements first
        for (int i : arr) {
            if (i % 2 == 0) {
                out[out_ind++] = i;
            }
        }
        // Then adding odd elements
        for (int i : arr) {
            if (i % 2 != 0) {
                out[out_ind++] = i;
            }
        }

        // Printing the new array
        System.out.println("The array in the required order is:");
        for (int i = 0; i < n - 1; ++i) {
            System.out.print(out[i] + ", ");
        }
        System.out.println(out[n - 1]);
    }
}
