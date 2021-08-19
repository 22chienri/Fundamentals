import java.util.Random;
import java.util.Scanner;

public class RandNums {
    public static void main(String[] args) {
        // create scanner object to get user input
        Scanner input = new Scanner(System.in);
        // create random object to generate random number
        Random random = new Random();
        // get user input and assign to n
        System.out.println("How many interations?");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= n; i++) {

            // print final result
            System.out.printf("%s\t%s\t%s%n", i, i * i, random.nextInt(i * i - i + 1) + i);
        }
    }
}
