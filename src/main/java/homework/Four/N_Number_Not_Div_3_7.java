package homework.Four;

import java.util.Scanner;

public class N_Number_Not_Div_3_7 {

    public static int x = 0;

    public static void main(String[] args) {

        // Ask questions to the console.
        System.out.print("You want me to count to : ");
        Scanner scanner = new Scanner(System.in);

        // Write a value for the counter variable.
        counter(scanner.nextInt());


    }

    // method for count and print.
    private static void counter(int number) {

        // for cycle logic : i < number  ; i++
        x = number;
        for (int i = 1; i <= number; i++) {

            divider(i);
        }
    }

    // method for divide to 3 and 7.
    private static void divider(int div) {
        // divide to 3.
        if (div % 3 != 0) {
            if (div < x) {
                System.out.print(div);
                printOut();
            }
        } else if (div % 7 == 0) {
            if (div < x) {
                System.out.print(div);
                printOut();
            }
        }
    }

    public static void printOut() {
        System.out.print(", ");
    }
}
