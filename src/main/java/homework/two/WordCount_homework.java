// Class name.
package homework.two;

// Import library Scanner.

import java.util.Scanner;

public class    WordCount_homework {
    public static void main(String[] args) {

        // Create a new Scanner name "scanner" and read from console.
        Scanner scanner = new Scanner(System.in);

        // Read string variable (firstReadString) from console.
        System.out.print("Please enter a some text : ");
        String firstReadString = scanner.nextLine();
        int counterWord = 1;
        for (int i = 0; i < firstReadString.length(); i++) {

            if(firstReadString.charAt(i) == ' '){
                counterWord++;

            }
//
        }
        System.out.println(counterWord);
    }
}