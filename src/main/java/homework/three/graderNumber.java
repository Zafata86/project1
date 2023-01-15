package homework.three;

import java.util.Arrays;
import java.util.Scanner;

public class graderNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create array for number value
        int[] number = new int[3];

        // read from console and write to array
        for (int i = 0; i < number.length; i++) {

            //print to console text
            System.out.printf("Input %d number for compare : ", i + 1);

            // read a number from console
            number[i] = scanner.nextInt();
        }
        // Print to console large number from array
        System.out.print("Тhe largest number is : ");
        System.out.println(Arrays.stream(number).max().getAsInt());
    }
}
