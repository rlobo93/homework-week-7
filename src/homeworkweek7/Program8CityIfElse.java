package homeworkweek7;

import java.util.Scanner;

/**
 *
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program8CityIfElse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch;
        System.out.println("Enter city's first  letter between a to f");
        ch = sc.next().charAt(0);

        if(( ch == 'a'|| ch == 'A' ) ){
            System.out.println("Name of the City is : America");
           }else if (( ch == 'b'|| ch == 'B' )){
            System.out.println("Name of the City is : Brazil");
        }else if(( ch == 'c'|| ch == 'C' )){
            System.out.println("Name of the City is : Cairo");
        }else if (( ch == 'd'|| ch == 'D' )){
            System.out.println("Name of the City is : Denmark");
        }else if(( ch == 'e'|| ch == 'E' )){
            System.out.println("Name of the City is : England");
        }else if(( ch == 'f'|| ch == 'F' )){
            System.out.println("Name of the City is : Finland");
        }
        else {
            System.out.println("Invalid entry");
        }


    }


}
