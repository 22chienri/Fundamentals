/*
Ryan Chien
Period 4
Fundamentals
MoreRandNums
 */

public class MoreRandNums {
    public static void main(String[] args) {
        // define array
        int[] array = new int[50];
        // fill array with random numbers between 0 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (100 + 1));
        }
        // print array in rows and columns
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%s\t", array[j + (i * 5)]);
            }
            System.out.print("\n");
        }
    }
}
