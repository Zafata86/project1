package homework.three;

import java.util.Scanner;

public class rectangleArrayPer {

    private static Scanner scanner = new Scanner(System.in);
    private static String calculationType;

    public static void main(String[] args) {

        System.out.print("What do you want to calculate ? ( \"area\" or \"perimeter\" ) : ");

        calculationType = scanner.nextLine();
        calculation(calculationType);


    }

    private static void calculation(String calculationType) {

        System.out.print("Please write \"a\" value for - a : ");
        int a = scanner.nextInt();

        System.out.print("Please write \"b\" value for - b : ");
        int b = scanner.nextInt();

        switch (calculationType) {

            case "area":

                //find area from rectangle
                int area = a * b;
                System.out.print("Area of rectangle is : " + area );
                System.out.println();

                break;
            case "perimeter":

                //find perimeter from rectangle
                int perimeter = (a + b) * 2;
                System.out.print("Perimeter of rectangle is : " + perimeter );
                System.out.println();

                break;
            default:
                System.err.println("Try again");
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