package homework.four;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toNumber = scanner.nextInt();

        // Some variable for saving numbers.
        int lastNum = 0;
        int newNum = 0;
        int middleNum = 1;

        // Print begin Fibonacci number
        System.out.print(lastNum + ", "); // 0
        System.out.print(middleNum + ", ");  // 1

        // for cycle logic : i < number  ; i++
        for (int i = 0; i < toNumber; i++) {   // 0, 1, 1, 2, 3, 5, 8, 13

            // Sum last value with middle value
            newNum = lastNum + middleNum;

            // Print New value to console
            System.out.print(newNum + ", ");

            // Make last value equal to middle value
            lastNum = middleNum;
            // Make middle value equal to new value
            middleNum = newNum;
        }
    }
}
