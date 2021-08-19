/*
Ryan Chien
Period 4
Fundamentals
CompareInts
 */

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {
        // create scanner object to get user input
        Scanner input = new Scanner(System.in);
        // get user input and assign to a and b
        System.out.println("Enter value for a:");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Enter value for b:");
        int b = Integer.parseInt(input.nextLine());

        // determine which case it is
        if (a == b) {
            // print output with a and b in the string
            System.out.printf("The value of a is %s and it is equal to b whose value is %s.%n", a, b);
        }
        else if (a < b) {
            // print output with a and b in the string
            System.out.printf("The value of a is %s and it is less than b whose value is %s.%n", a, b);
        }
        else if (a > b) {
            // print output with a and b in the string
            System.out.printf("The value of a is %s and it is greater than b whose value is %s.%n", a, b);
        }
    }
}
