package homework.One;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {

        // create a new Scanner for any input data
        Scanner scanner = new Scanner(System.in);

        // user input your first name and save to variable firstName
        System.out.print("Please, enter your first name : ");

        // wait input user data
        String firstName = scanner.nextLine();

        // user input your second name and save to variable secondName
        System.out.print("Please, enter your second name : ");

        // wait input user data
        String secondName = scanner.nextLine();

        // user input your hobby and save to variable hobby
        System.out.print("What is your favorite hobby : ");

        // wait input user data
        String hobby = scanner.nextLine();

        // Print to console ...
        System.out.println("Hello, " + firstName + " " + secondName + " !");
        System.out.println("I am your personal trainer, and i will teach you to " + hobby);
        // "if" logic for choice hobby type and printed to console
        if (hobby.equals("football")) {
            // if hobby is equal football
            System.out.println("We train every Monday at 8:00 AM on stadium !");
        } else if (hobby.equals("basketball")) {
            System.out.println("We train every Tuesday at 9:00 AM on basketball court !");
        } else if (hobby.equals("tennis")) {
            System.out.println("We train every Wednesday at 8:30 AM on tennis court !");
        } else if (hobby.equals("volleyball")) {
            System.out.println("We train every Thursday at 9:30 AM on volleyball court !");
        } else {
            System.out.println("We train every Friday at 10:00 AM !");
        }
        System.out.println("Have a nice day. See you soon.");

    }
}
