// Class name.
package programmig.intro;

// Import library Scanner.
import java.util.Scanner;

public class MyName_homework {
    public static void main(String[] args) {

        // Create a new Scanner name "scanner" and read from console.
        Scanner scanner = new Scanner(System.in);

        // Print question "What is your name ?"
        System.out.println("What is your name ?");

        // Read string variable (myName) from console.
        String myName = scanner.nextLine();

        // Print "My name is (myName0)"
        System.out.printf("My name is %s !",myName);

    }
}