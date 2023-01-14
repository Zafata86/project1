package homework.six;
import java.util.Locale;
import java.util.Scanner;

public class PasswordParam {

    // global int variable
    static int lengthOfPassword = 8;

    // static boolean variable
    static boolean isEnoughLong = false;
    static boolean symbolInPass = false;
    static boolean numberInPass = false;
    static boolean letterInPass = false;
    static boolean passwordIsCorrect = false;

    // global string variable
    static String password;

    // global string list
    static String[] letterInPassList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    static String[] symbolInPassList = {"@", "!", "$", "%", "_", ".", ","};
    static String[] numberInPassList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};


    public static void isSymbolInPass() {
        for (String i : symbolInPassList) {
            if (password.contains(i)) {
                symbolInPass = true;
                return;
            }
        }
    }

    public static void isNumberInPass() {
        for (String i : numberInPassList) {
            if (password.contains(i)) {
                numberInPass = true;
                return;
            }
        }
    }

    public static void isLetterInPass() {
        for (String i : letterInPassList) {
            if (password.toLowerCase(Locale.ROOT).contains(i)) {
                letterInPass = true;
                return;
            }
        }
    }

    public static void isEnoughLong() {
        // Check the password length.
        isEnoughLong = password.length() >= lengthOfPassword;
    }

    public static void passwordIsCorrect() {
        // AND logic check for password parameters
        if (isEnoughLong && letterInPass && numberInPass && symbolInPass) {
            System.out.println("Password is correct !");
            passwordIsCorrect = true;
        } else {
            if (!isEnoughLong) System.out.println("Password is NOT enough length.");
            if (!letterInPass) System.out.println("Password DON'T have letter. ");
            if (!numberInPass) System.out.println("Password DON'T have number. ");
            if (!symbolInPass) System.out.println("Password DON'T have symbol. ");
            System.out.println("Wrong type password, try again !");
            System.out.println("");
            passwordIsCorrect = false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!passwordIsCorrect) {

            // Print to console some instruction
            System.out.print("Enter your password : ");

            // Read from text console
            password = scanner.nextLine();

            // Call other method
            isEnoughLong();   // Check how long is the input password.
            isLetterInPass(); // Check if the input password have a letter.
            isNumberInPass(); // Check if the input password have a number.
            isSymbolInPass(); // Check if the input password have a symbol.
            passwordIsCorrect(); // Check if the password is OK, and print to console or print what is missing.

        }
    }
}

