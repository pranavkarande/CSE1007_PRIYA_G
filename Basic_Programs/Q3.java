/**
 * Q3. Display Subject Name based on room number. If the user enters 604 then display
 * Java Programming , If the user enters 605 then display Python programming for
 * any other input display Invalid input to the user.
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        // Reading the room number
        System.out.print("Enter room number: ");
        Scanner room_no_scanner = new Scanner(System.in);
        int room_no= room_no_scanner.nextInt();
        room_no_scanner.close();

        // Checking if room number is 604 or 605
        if (room_no == 604) {
            System.out.println("Subject name is Java Programming.");
        }
        else if (room_no == 605) {
            System.out.println("Subject name is Python Programming.");
        }
        else {
            System.out.println("Invalid Input!!!");
        }
    }
}
