/**
 * Q8. c) Print the pattern for n lines:
 * 1
 * 12
 * 123
 * 1234
 * 1234
 * 123
 * 12
 * 1
 */

import java.util.Scanner;

public class Q8_c {
    public static void main(String args[]) {
        // Reading n
        System.out.print("Enter number of lines to print pattern for: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();
        n_scanner.close();

        // Printing the pattern
        for (int i = 1; i < n + 1; ++i) {
            for (int j = 1; j < i + 1; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n; i > 0; --i) {
            for (int j = 1; j < i + 1; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
