/**
 * Q1. Read the radius and print the area of a circle.
 */
import java.util.Scanner;
// Importing Math library for constant PI
import java.lang.Math;

public class Q1{
    public static void main(String args[]) {
        // Reading the radius
        System.out.print("Enter radius of circle: ");
        Scanner radius_scanner = new Scanner(System.in);
        double radius = radius_scanner.nextDouble();
        radius_scanner.close();

        // Calculating area
        double area = Math.PI * radius * radius;

        // Printing area
        System.out.println("Area of circle with radius " + radius + " is " + area + ".");
    }
}
