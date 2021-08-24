/*
Ryan Chien
Period 4
Fundamentals
PosNegNums
 */

import java.util.Random;

public class PosNegNums {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // create array with length 10
        int[] array = new int[10];

        // fill array with random numbers between 100 and 0
        for (int i = 0; i < array.length; i++) {
            int num = random.nextInt(100);
            // randomly make some numbers negative
            if (random.nextBoolean()) {
                num *= -1;
            }
            // assign index of array to num
            array[i] = num;
        }

        // print each number of array on new line
        for (int num : array) {
            System.out.println(num);
        }

        // negative integer
        int negative = 0;
        // add 1 to negative for each number in array
        for (int num : array) {
            if (num > 0) {
                negative++;
            }
        }

        // print amount of negative numbers
        System.out.printf("There are %s positive numbers", negative);
    }
}
