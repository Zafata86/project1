package homework.three;

import java.util.Scanner;

public class Rectangle_array_per {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please write a value for - a : ");
        int a = scanner.nextInt();

        System.out.print("Please write a value for - b : ");
        int b = scanner.nextInt();

        System.out.print("What do you want to calculate ? ( area or perimeter ) : ");
        String calculation = scanner.nextLine();


    }

    public static void calculation(String calc) {
        switch (calc) {

            case "area":
                break;
            case "perimeter":

                break;
            default:
                System.out.println("Try again");
        }
    }
}

// find a perimeter from rectangle
//        int perimeter = (a + b) * 2;
//
//        // find a area from rectangle
//        int area = a * b;

//Print a final result to console
//        System.out.printf("The perimeter of rectangle is : %d\n", perimeter);
//        System.out.printf("The area of rectangle is : %d\n", area);