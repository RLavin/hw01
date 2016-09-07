import java.util.InputMismatchException;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {

        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String n = reader.nextLine();
            System.out.println("You chose: " + n);
        }

        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter your age: ");
// Iterate as long as the provided token is not a number
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                reader.next();
                System.out.println("Enter your age: ");
            }
// Here we know that the token is a number so we can read it without
// taking the risk to get a InputMismatchException
            int n = reader.nextInt();
            System.out.println("You chose: " + n);
        }

        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter your email: ");
            String n = reader.nextLine();
            System.out.println("You chose: " + n);
        }

    }
}
