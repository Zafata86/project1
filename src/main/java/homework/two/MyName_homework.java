// Class name.
package homework.two;

// Import library Scanner.
import java.util.Scanner;

public class MyName_homework {
    public static void main(String[] args) {

        //Create a String variable.
        String someString = " Your name is <My name>";

        // Print some string in console.
        System.out.println(someString);

        // Input your name please.
        System.out.print("Input your name please : ");
        // Create a new Scanner name "scanner" and read from console.
        Scanner scanner = new Scanner(System.in);

        // Create and read string variable (myName) from console.
        String myName = scanner.nextLine();

        // Print and replace myName : "My name is (myName)"
        System.out.println(someString.replace("<My name>", myName));
    }
}