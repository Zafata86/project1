//package i.e. location of the file
package programmig.intro;

import java.util.Scanner;

//class
public class intro {
    public static void main(String[] args) {
        //print the text to the console
        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi, " + name);
    }
}
