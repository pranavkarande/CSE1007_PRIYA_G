/**
 * Q8. b) Print the pattern for n lines:
 * 1234
 * 123
 * 12
 * 1
 */

import java.util.Scanner;

public class Q8_b {
    public static void main(String args[]) {
        // Reading n
        System.out.print("Enter number of lines to print pattern for: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();
        n_scanner.close();

        // Printing the pattern
        for (int i = n; i > 0; --i) {
            for (int j = 1; j < i + 1; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
