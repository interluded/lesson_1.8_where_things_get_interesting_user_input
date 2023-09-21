import java.util.Scanner;
public class SimpleMath
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first integer ");
        int integer_1 = scan.nextInt();
        System.out.print("Enter the second integer ");
        int integer_2 = scan.nextInt();
        System.out.println("The product is " + integer_1 * integer_2);
        System.out.println("The product is " + (integer_1 + integer_2));

    }
}