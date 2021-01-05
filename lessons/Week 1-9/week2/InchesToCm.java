import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        System.out.println("Enter a number of inches");

        // Getting Input
        Scanner scanner = new Scanner(System.in);

        // Obtaining Input
        int inches = Integer.valueOf(scanner.nextLine()); 

        // Convert to centimeters 
        float cm = (inches * 2.54f);

        // Print Values
        System.out.println(cm);
    }
}
