/**
 * Write a Java program to remove the duplicate elements of a given array and return
 * the new length of the array.
 */

import java.util.Scanner;

public class Q3 {
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

        // Creating new array without duplicate elements
        int[] out = new int[n];
        int out_len = 0;

        boolean contains = false;
        for (int i : arr) {
            for (int j : out) {
                if (j == i) contains = true;
            }

            if (!contains) out[out_len++] = i;
            contains = false;
        }

        // Printing the new array
        System.out.println("The array without duplicate elements is:");
        for (int i = 0; i < out_len - 2; ++i) {
            System.out.print(out[i] + ", ");
        }
        System.out.println(out[out_len - 1]);
        System.out.println("It's length is " + (out_len - 1) + ".");
    }
}
