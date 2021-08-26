/**
 * Q1. Write a Java program to sort an array of positive integers of an given array, in the
 * sorted array the value of the first element should be maximum, second value
 * should be minimum value, third should be second maximum, fourth second be
 * second minimum and so on.
 */

import java.util.Scanner;

public class Q1 {
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

        // Sorting array in descending order using bubble sort
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Creating new array and inserting elements in given order
        int[] out = new int[n];

        int x = 0;
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                out[i] = arr[x];
                ++x;
            } else {
                out[i] = arr[n - x];
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
