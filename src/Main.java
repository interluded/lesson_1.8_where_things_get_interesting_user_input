import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
                System.out.print("How old is ballz: ");
        int age = scan.nextInt();
        // The + sign is used for String Concatenation (Joining strings together)
        System.out.println("Ballz is " + age + " years old");
    }
}