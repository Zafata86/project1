package homework.Six;

import javax.tools.Tool;
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

        switch (runMode){
            case 0 :
                // Print to console some user instruction
                System.out.println("Please enter two numbers for Average() method one by one");
                inputNumbers.averageMethodForTwoNumbers(scanner.nextInt(), scanner.nextInt());
                break;
            case 1 :
                System.out.println("Please enter two numbers for Sum() method one by one");
                inputNumbers.sumOfTwoNumbers(scanner.nextInt(), scanner.nextInt());

                break;
            case 2 :
                System.out.println("Please enter four numbers for Average(Sum(), Sum()) method one by one");
                System.out.println(averageMethodForTwoNumbers(sumOfTwoNumbers(scanner.nextInt(), scanner.nextInt()), sumOfTwoNumbers(scanner.nextInt(), scanner.nextInt())));

                break;
            default:
                return;
        }
    }

    // calculate method with return
    public static double averageMethodForTwoNumbers(int a, int b) {

        // calculate result
        double result = (1.0 * a + b) / 2.0;

        // print to console
//        System.out.println("Average result is " + result);
        return result;
    }

    public static int sumOfTwoNumbers(int a, int b) {

        // calculate result
        int result = a + b;

        // print to console
//        System.out.println("Sum is " + result);
        return result;
    }

}
