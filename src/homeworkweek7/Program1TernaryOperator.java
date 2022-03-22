package homeworkweek7;

import java.util.Scanner;

/**
 *
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Program1TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num = scanner.nextInt();

        String result = num%2==0 ? "Even" : "odd";

        System.out.println(num + " is " + result);
    }
}
