/**
 * Q8. a) Print the pattern for n lines:
 * *
 * **
 * ***
 * ****
 */

import java.util.Scanner;

public class Q8_a {
    public static void main(String args[]) {
        // Reading n
        System.out.print("Enter number of lines to print pattern for: ");
        Scanner n_scanner = new Scanner(System.in);
        int n = n_scanner.nextInt();
        n_scanner.close();

        // Printing the pattern
        String pattern = "";

        for (int i = 0; i < n; ++i) {
            pattern += "*";
            System.out.println(pattern);
        }
    }
}
