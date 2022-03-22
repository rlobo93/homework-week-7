package homeworkweek7;

import java.util.Scanner;

/**
 *Write a java program to input any number and find out if it’s odd or even
 *
 */
public class Program6OddOrEven {
    public static void main(String[] args) {

        int num;
        System.out.println("Please Enter a Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");


    }



}
