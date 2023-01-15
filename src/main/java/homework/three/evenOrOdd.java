package homework.three;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Print on console text "Input a number : ", and cursor is stay to same line !
        System.out.print("Input a number : ");
        // Join value to Even_Or_Odd and return to console answer.
        Even_Or_Odd(scanner.nextInt());
    }
    public static void Even_Or_Odd (int number){

        // switch case logic to calculate what is the number - Even or Odd !
        switch (number % 2){
            // Case one - if number is equal to "0"
            case 0:
                System.out.println("The number is Even");
                break;
            // Case default - if number is not equal to "0"
            default:
                System.out.println("The number is Odd");
        }
    }
}
