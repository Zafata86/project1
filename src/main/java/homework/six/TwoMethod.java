package homework.six;

import java.util.Scanner;

public class TwoMethod {

    public static void main(String[] args) {

        // input a scanner
        Scanner scanner = new Scanner(System.in);
        //Make a new Object
        TwoMethod inputNumbers = new TwoMethod();
        int runMode = 0;

        System.out.println("What do you wont to do : ");
        System.out.println("0 - Average(a, b) - Method program");
        System.out.println("1 - Sum(a, b) - Method program");
        System.out.println("2 - Average (Sum(a, b), Sum(c, d)) - Method program");
        System.out.print("--> : ");
        runMode = scanner.nextInt();

        switch (runMode) {
            case 0:
                // Print to console some user instruction
                System.out.println("Please enter two numbers for Average() method one by one");
                inputNumbers.averageMethodForTwoNumbers(scanner.nextInt(), scanner.nextInt());
                break;
            case 1:
                System.out.println("Please enter two numbers for Sum() method one by one");
                inputNumbers.sumOfTwoNumbers(scanner.nextInt(), scanner.nextInt());

                break;
            case 2:
                System.out.println("Please enter four numbers for Average(Sum(), Sum()) method one by one");
                System.out.println(averageMethodForTwoNumbers(sumOfTwoNumbers(scanner.nextInt(), scanner.nextInt()), sumOfTwoNumbers(scanner.nextInt(), scanner.nextInt())));

                break;
            default:
        }
    }

    public static double averageMethodForTwoNumbers(int a, int b) {

        return (1.0 * a + b) / 2.0 ;
    }

    public static int sumOfTwoNumbers(int a, int b) {

        return a + b;
    }

}
