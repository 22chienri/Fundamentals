/*
Ryan Chien
Period 4
Fundamentals
Quadratic
 */

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // create scanner object to take user input
        Scanner input = new Scanner(System.in);
        // declare root1 and root2 variables are double
        double root1, root2;
        // get user input and assign to a, b, and c
        System.out.println("Enter value for a:");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Enter value for b:");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Enter value for c:");
        double c = Double.parseDouble(input.nextLine());

        // calculate determinant (b^2-4ac
        double determinant = b * b - 4 * a * c;

        /*
        if determinant is greater than 0, roots are real and different
        if determinant is equal to 0, roots are real and equal
        if determinant is less than 0, roots are complex and different
         */

        if (determinant > 0) {
            // calculate roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            // print roots
            System.out.printf("root 1 = %.2f%n", root1);
            System.out.printf("root 2 = %.2f%n", root2);
        }
        else if (determinant == 0) {
            // calculate roots
            root1 = -b / (2 * a);
            // print roots
            System.out.printf("root 1 and root 2 = %.2f%n", root1);
        }
        else {
            //calculate roots
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            // print roots
            System.out.printf("root 1 = %.2f+%.2fi%n", real, imaginary);
            System.out.printf("root 2 = %.2f-%.2fi%n", real, imaginary);
        }
    }
}
