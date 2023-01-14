// Class name.
package homework.two;

// Import library Scanner.
import java.util.Scanner;

public class EqualString_homework {
    public static void main(String[] args) {

        // Create a new Scanner name "scanner" and read from console.
        Scanner scanner = new Scanner(System.in);

        // Read first string variable (firstReadString) from console.
        System.out.print("First String : ");
        String firstReadString = scanner.nextLine();

        // Read second string variable (secondReadString) from console.
        System.out.print("Second String : ");
        String secondReadString = scanner.nextLine();

        // Check if string is equal or NOT.
        if (firstReadString.equals(secondReadString)) {
            System.out.println("String is equal !");
        } else {
            System.out.println("String NOT is equal !");
        }
    }
}
