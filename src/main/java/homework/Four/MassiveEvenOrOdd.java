package homework.Four;

import java.util.ArrayList;
import java.util.Scanner;

public class MassiveEvenOrOdd {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        String numberStr = "No";

        int count = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int countEven = 0;
        int countOdd = 0;

        while (numberStr.equalsIgnoreCase("No") || numberStr.equalsIgnoreCase("N")) {

            System.out.print("Input one number : ");
            number.add(scanner.nextInt());

            if (number.get(count) % 2 == 0) {
                even.add(number.get(count));
                sumEven += even.get(countEven);
                countEven++;
            } else {
                odd.add(number.get(count));
                sumOdd += odd.get(countOdd);
                countOdd++;
            }

            count++;

            System.out.println("Do you finish ?  Y / N");
//            numberStr = scanner.nextLine();
            if(numberStr.equalsIgnoreCase("Yes") || numberStr.equalsIgnoreCase("Y")){
                break;
            }else{
                System.out.print("-->  ");
                numberStr = scanner.next();
            }

        }
        System.out.printf("The count of Even number is : %d \nSum of even number is : %d \n",countEven, sumEven);
        System.out.printf("The count of Odd number is : %d \nSum of odd number is : %d",countOdd, sumOdd);
    }
}
