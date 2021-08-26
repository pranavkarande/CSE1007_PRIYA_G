/**
 * Q7. Provide the option of adding two numbers to the user until the user wants to exit.
 */

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        while (true) {
            // Reading first number
            System.out.print("Enter first number to add: ");
            Scanner x_scanner = new Scanner(System.in);
            int x = x_scanner.nextInt();

            // Reading second number
            System.out.print("Enter second number to add: ");
            Scanner y_scanner = new Scanner(System.in);
            int y = y_scanner.nextInt();

            // Printing the sum
            System.out.println("Sum of " + x + " and " + y + " is " + (x + y) + ".");

            // Asking user if he wants to run again
            System.out.print("Do you want to run the program again? (y/n): ");
            Scanner choice_scanner = new Scanner(System.in);
            String choice = choice_scanner.nextLine();

            // Checking choice
            if (choice.equals("n")) {
                x_scanner.close();
                y_scanner.close();
                choice_scanner.close();
                break;
            }

            System.out.println();
        }
    }
}
