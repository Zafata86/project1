package homework.Six;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable for how many times need to read the input console.
        int inNumber = 0;

        System.out.println("Please enter a three numbers one by one!");

        PositiveNegativeNumber number = new PositiveNegativeNumber();

        // while cycle for read input numbers
        while(inNumber < 3){
            number.PositiveNegativNumber(scanner.nextLine());
//            number.PositiveNegativNumber(scanner.nextInt(","));
            inNumber ++;
        }
    }
    protected void PositiveNegativNumber(String a) {

        int aInt = Integer.parseInt(a);

        if (aInt < 0) System.out.printf("%d is a Negative\n", aInt);
        else if(aInt > 0)System.out.printf("%d is a Positive\n", aInt);
        else  System.out.printf("%d is neither Positive nor Negative\n", aInt);
        return;
    }
}
