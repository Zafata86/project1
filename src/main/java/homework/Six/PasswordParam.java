package homework.Six;
import java.util.Locale;
import java.util.Scanner;

public class PasswordParam {

    // global int variable
    int lengthOfPassword = 8;

    // static boolean variable
    static boolean isEnoughLong = false;
    static boolean symbolInPass = false;
    static boolean numberInPass = false;
    static boolean letterInPass = false;
    static boolean passwordIsCorrect = false;

    // global string variable
    String password;

    // global string list
    static String[] letterInPassList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    static String[] symbolInPassList = {"@", "!", "$", "%", "_", ".", ","};
    static String[] numberInPassList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};


    public void isSymbolInPass() {
        for (String i : symbolInPassList) {
            if (password.contains(i)) {
                symbolInPass = true;
                return;
            }
        }
    }

    public void isNumberInPass() {
        for (String i : numberInPassList) {
            if (password.contains(i)) {
                numberInPass = true;
                return;
            }
        }
    }

    public void isLetterInPass() {
        for (String i : letterInPassList) {
            if (password.toLowerCase(Locale.ROOT).contains(i)) {
                letterInPass = true;
                return;
            }
        }
        return;
    }

    public void isEnoughLong() {

        if (password.length() < lengthOfPassword) {
            return;
        } else {
            isEnoughLong = true;
        }
    }

    public void passwordIsCorrect() {
        PasswordParam callPram = new PasswordParam();
        if (isEnoughLong && letterInPass && numberInPass && symbolInPass) {
            System.out.println("Password is correct !");
            callPram.passwordIsCorrect = true;
            return;
        } else {
            if (!isEnoughLong) System.out.println("Password is NOT enough length.");
            if (!letterInPass) System.out.println("Password DON'T have letter. ");
            if (!numberInPass) System.out.println("Password DON'T have number. ");
            if (!symbolInPass) System.out.println("Password DON'T have symbol. ");
            System.out.println("Wrong type password, try again !");
            System.out.println("");
            callPram.passwordIsCorrect = false;
            return;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PasswordParam callPram = new PasswordParam();
        while (!callPram.passwordIsCorrect) {

            // Print to console some instruction
            System.out.print("Enter your password : ");

            // Read from text console
            callPram.password = scanner.nextLine();

            // Call other method
            callPram.isEnoughLong();   // Check how long is the input password.
            callPram.isLetterInPass(); // Check if the input password have a letter.
            callPram.isNumberInPass(); // Check if the input password have a number.
            callPram.isSymbolInPass(); // Check if the input password have a symbol.
            callPram.passwordIsCorrect(); // Check if the password is OK, and print to console or print what is missing.

        }
    }
}

