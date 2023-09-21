import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first integer ");
        int integer_1 = scan.nextInt();
        System.out.print("Enter the second integer ");
        int integer_2 = scan.   nextInt();
        System.out.print("Enter the third integer ");
        int integer_3 = scan.nextInt();
        System.out.println((integer_1 + integer_2 + integer_3) /  3.0);



    }
}