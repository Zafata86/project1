// Class name.
package Homework;

// Import library Scanner.
import java.util.Scanner;

public class stringConcatenate {
    // Create a main cycle.
    public static void main(String[] args) {
        // Create a new Scanner name "scanner" and read from console.
        Scanner scanner = new Scanner(System.in);

        // Read first string variable (firstReadString) from console.
        System.out.print("First String : ");
        String firstReadString = scanner.nextLine();

        // Read second string variable (secondReadString) from console.
        System.out.print("Second String : ");
        String secondReadString = scanner.nextLine();

        // Read third string variable (secondReadString) from console.
        System.out.print("Second String : ");
        String thirdReadString = scanner.nextLine();

        System.out.printf("%s %s %s", firstReadString, secondReadString, thirdReadString);

    }
}
