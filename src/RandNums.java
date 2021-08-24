/*
Ryan Chien
Period 4
Fundamentals
RandNums
 */

public class RandNums {
    public static void main(String[] args) {
        // loop 10 times with index
        for (int i = 1; i <= 10; i++) {
            // print result
            System.out.printf("%s\t%s\t%s%n", i, i * i, i + (int)(Math.random() * ((i * i - i) + 1)));
        }
    }
}
