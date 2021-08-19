import java.text.MessageFormat;
import java.util.Scanner;

public class CompareInts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for a:");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Enter value for b:");
        double b = Double.parseDouble(input.nextLine());
        if (a == b)
        {
            System.out.println(MessageFormat.format("The value of a is {0} and it is equal to b whose value is {1}.", a, b));
        } else if (a < b)
        {
            System.out.println(MessageFormat.format("The value of a is {0} and it is less than b whose value is {1}.", a, b));
        } else if (a > b)
        {
            System.out.println(MessageFormat.format("The value of a is {0} and it is greater than b whose value is {1}.", a, b));
        }
    }
}
