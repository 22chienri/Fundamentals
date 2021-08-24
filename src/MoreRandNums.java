/*
Ryan Chien
Period 4
Fundamentals
MoreRandNums
 */

import java.util.Random;

public class MoreRandNums {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // define array
        int[] array = new int[50];
        // fill array with random numbers between 0 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        // print each number in the array with a space between
        for (int num : array) {
            System.out.printf("%s ", num);
        }
    }
}
