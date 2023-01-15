//Ъпдейтнете задачата с намирането на максималното измежду 3 числа да използва Math класа.
package homework.eigth;

import java.util.Scanner;

public class greatherNumberUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumIs = 0;
        int lastMaxNum = 0;

        // create array for number value
        int[] number = new int[3];

        // read from console and write to array
        for (int i = 0; i < number.length; i++) {

            //print to console text
            System.out.printf("Input %d number for compare : ", i + 1);

            // read a number from console
            number[i] = scanner.nextInt();
            maxNumIs = Math.max(lastMaxNum, number[i]);
            lastMaxNum = maxNumIs;

        }
        // Print to console large number from array
        System.out.print("Тhe largest number is : ");
        System.out.println(lastMaxNum);
        System.out.println();
    }
}
