import java.util.Scanner;

/**
 * Created by Raul on 9/7/16.
 */
public class NewSolutionHw {
 public static void main(String[] args) {
     Scanner userInputDevice = new Scanner(System.in);

     System.out.println("Enter your name:");
     //declare the string
     String data;

     //assign value
     data = userInputDevice.nextLine();
     System.out.println("Your name is: " + data);

     //lets save the name
     String savedIt = data;

     System.out.println("Enter your age: ");
     data = userInputDevice.nextLine();
     System.out.println("Your age is: " + data);

     System.out.println("Enter your email: ");
     data = userInputDevice.nextLine();
     System.out.println("Your email is: " + data);

     System.out.println("Thank you " + savedIt + " for playing.");

    }
 }
