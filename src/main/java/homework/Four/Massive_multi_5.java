package homework.Four;

import java.util.Scanner;

public class Massive_multi_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create massive with 20 integer elements
        int[] number = new int[20];
        // "for" loop to multiply each element by 5 and then print to the console
        for (int i = 0; i < number.length; i++) {
            number[i] = i * 5;
            System.out.println(number[i]);
        }
    }
}
