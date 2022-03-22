package homeworkweek7;

import java.util.Scanner;

/**
 *
 * Same as above program-8 using switch statement
 *
 */
public class Program9CitySwitch {

    static char ch= 'a';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner
        System.out.println("Enter city's first  letter");
        ch=sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Name of the City is : America");
                break;
                case 'A':
                System.out.println("Name of the City is : America");
                break;
                case 'b':
                System.out.println("Name of the City is : Brazil");
                break;
                case 'B':
                System.out.println("Name of the City is : Brazil");
                break;
                case 'c':
                System.out.println("Name of the City is : Cairo");
                break;
                case 'C':
                System.out.println("Name of the City is : Cairo");
                break;
                case 'd':
                System.out.println("Name of the City is : Denmark");
                break;
                case 'D':
                System.out.println("Name of the City is : Denmark");
                break;
                case 'e':
                System.out.println("Name of the City is : Denmark");
                break;
                case 'E':
                System.out.println("Name of the City is : Denmark");
                break;
                case 'f':
                System.out.println("Name of the City is : Finland");
                break;
                case 'F':
                System.out.println("Name of the City is : Finland");
                break;


        }


    }

}
