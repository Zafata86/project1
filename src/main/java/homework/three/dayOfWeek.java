package homework.three;

import java.util.Scanner;

public class dayOfWeek {

    public static void dayOfWeek (String dayOfWeek){
        switch (dayOfWeek){

            case "1":
                System.out.println(dayOfWeek+ " is for \"Monday\"");
                break;
            case "2":
                System.out.println(dayOfWeek + " is for \"Tuesday\"");
                break;
            case "3":
                System.out.println(dayOfWeek + " is for \"Wednesday\"");
                break;
            case "4":
                System.out.println(dayOfWeek + " is for \"Thursday\"");
                break;
            case "5":
                System.out.println(dayOfWeek + " is for \"Friday\"");
                break;
            case "6":
                System.out.println(dayOfWeek + " is for \"Saturday\"");
                break;
            case "7":
                System.out.println(dayOfWeek + " is for \"Sunday\"");
                break;
            default:
                System.out.println(dayOfWeek + " is NOT a day of week");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Number 1-7 : ");
        dayOfWeek(scanner.nextLine());
    }

}
