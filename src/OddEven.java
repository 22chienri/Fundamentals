/*
Ryan Chien
Period 4
Fundamentals
OddEven
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // create scanner object to get user input
        Scanner input = new Scanner(System.in);
        // get user input and assign to num
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        // calculate remainder
        int remainder = num % 2;
        // print even or odd
        if (remainder == 0) {
            System.out.printf("%s is an even number%n", num);
        }
        else {
            System.out.printf("%s is an odd number%n", num);
        }
    }
}
