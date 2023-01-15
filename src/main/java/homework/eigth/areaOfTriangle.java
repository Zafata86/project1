// Напишете метод който намира лице на триъгълник(използвайки Math класа).
package homework.eigth;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
;
        System.out.println(".: Calculator for Area of triangle :.");
        System.out.print("Please write a value for side - a : ");
        int a = scanner.nextInt();

        System.out.print("Please write a value for side - b : ");
        int b = scanner.nextInt();

        System.out.print("Please write a Degrees for angle - <BAC : ");
        int bac = scanner.nextInt();

        double sum = Math.abs(a * b * Math.sin(bac) / 2);
        System.out.printf("Area of a Triangle is : %.2f%n", sum);
    }
}
