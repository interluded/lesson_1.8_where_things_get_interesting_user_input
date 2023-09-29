import java.util.Scanner;
public class slope
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x1 double ");
        double integer_1 = scan.nextDouble();
        System.out.print("Enter the x2 double ");
        double integer_2 = scan.   nextDouble();
        System.out.print("Enter the y1 double ");
        double integer_3 = scan.nextDouble();
        System.out.print("Enter y2 double ");
        double integer_4 = scan.nextDouble();
        System.out.println((integer_2 - integer_1) / (integer_4 - integer_3));



    }
}