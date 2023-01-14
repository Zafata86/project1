package homework.four;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {

        // Create massive with 20 integer elements
        int[] number = new int[20];

        // Create int value to store the sum of the massive.
        int sum = 0;

        // "for" loop to multiply each element by 5 and then print to the console
        for (int i = 0; i < number.length; i++) {

            number[i] = i * 5;

            System.out.println(number[i]);

            sum += number[i];

        }

        // Find average value of the massive.
        int averageValue = sum / number.length;

        //Print to console final result.
        System.out.printf("%nAverage value of massive is : \" %d \"%n", averageValue);
    }
}
