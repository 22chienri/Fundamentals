import java.text.MessageFormat;

public class CompareInts
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 10;
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
