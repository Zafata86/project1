package homework.eigth;

import java.util.Scanner;

public class arrayOfRandumNumber {

    static Scanner scanner = new Scanner(System.in);
    static int arrayLength = scanner.nextInt();
    static int arrayNumbers[] = new int[arrayLength];

    public static void main(String[] args) {

        System.out.print("Length of Array : ");
        System.out.println(arrayNumbers.length);
        printRandomArray();
        System.out.println();
    }

    static int printRandomArray() {
        for (int x = 0; x < arrayLength; x++) {

            arrayNumbers[x] = (int) (Math.random() * (x + 1) * 10);

            System.out.printf("Array [%d] : %d%n", x, arrayNumbers[x]);
        }
        return arrayLength;
    }
}
