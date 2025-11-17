//write a java program to writ custom exception if age less tahn 18 then throw identifier exception
import java.util.Scanner;

class IdentifierException extends Exception {
    public IdentifierException(String message) {
        super(message);
    }
}


public class ExternalQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new IdentifierException("Age is less than 18");
            } else {
                System.out.println("Age is valid");
            }
        } catch (IdentifierException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}