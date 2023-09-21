import java.util.Scanner;

public class Cookies
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many cookies do you have: ");
        int cookie_count = scan.nextInt();
        // The + sign is used for String Concatenation (Joining strings together)
        System.out.println("You have " + cookie_count + " cookies!");
    }
}