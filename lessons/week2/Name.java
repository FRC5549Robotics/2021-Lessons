import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // Prints a Line
        System.out.println("What is your name?");

        // Getting Input
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Print Name
        System.out.println("Hi " + name);
    }
}
