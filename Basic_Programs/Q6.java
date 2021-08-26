/**
 * Q6. Print the multiplication table by getting the n from the user.
 */

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        // Reading the number
        System.out.print("Enter the number to print multiplication table for: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();
        n_scanner.close();

        // Printing multiplication table for n
        for (int i = 1; i < 11; ++i) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
