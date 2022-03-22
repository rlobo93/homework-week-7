package homeworkweek7;

import java.util.Scanner;

/**
 *
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program2LeapYear {
    public static void main(String[] args) {

            Scanner l = new Scanner(System.in);
            System.out.println("Please Enter Year : ");

            int year = l.nextInt();
            boolean leap = false;

            if(year % 4 ==0){
                if(year % 100 ==0);
                if(year % 400 ==0);
                leap=true;



            }

            else leap=false;
            if(leap){
                System.out.println(year + " is a leap year");
            }
            else
                System.out.println(year + " is not a leap year");



        }


}
