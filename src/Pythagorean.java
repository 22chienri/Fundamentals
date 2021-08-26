/*
Ryan Chien
Period 4
Fundamentals
Pythagorean
 */

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);
        // get user input for all sides
        System.out.print("The length of Side A is: ");
        int sideA = input.nextInt();
        System.out.print("The length of Side B is: ");
        int sideB = input.nextInt();
        System.out.print("The length of the hypotenuse is: ");
        int sideC = input.nextInt();

        // determine if it is a right triangle and print results
        if (sideA * sideA + sideB * sideB == sideC * sideC) {
            System.out.println("These lengths form a right triangle.");
            System.out.println("The area is: " + sideA * sideB / 2);
            System.out.println("The perimeter is: " + (sideA + sideB + sideC));
        }
        else {
            System.out.println("These lengths do not form a right triangle.");
        }
    }
}
