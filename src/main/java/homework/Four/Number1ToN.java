package homework.Four;

import java.util.Scanner;

public class Number1ToN {

    // method for count and print.
    private static void counter(int number) {

        // for cycle logic : i < number  ; i++
        for (int i = 1; i <= number; i++) {

            // print "i".
            System.out.print(i);

            // This if put ", " to the end of each number except the last one.
            if (i != number) {

                System.out.print(", ");

            }
            // This if print 10 numbers for row.
            if (i % 10 == 0) {

                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {

        // Ask questions to the console.
        System.out.print("You want me to count to : ");
        Scanner scanner = new Scanner(System.in);

        // Write a value for the counter variable.
        counter(scanner.nextInt());

    }
}
