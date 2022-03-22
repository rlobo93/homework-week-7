package homeworkweek7;

import java.util.Scanner;

/**
 *Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 * Example of input/Output:
 * ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
 * ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 *  year.
 * ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 *  2018 is not a leap year.
 * ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
 * ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 *  9999
 * HINT: Use the switch statement.
 * NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 *
 *
 */
public class Program4LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");

        int year = sc.nextInt();

        if (year % 400 == 0)
        {
            System.out.println("leap Year");

        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("leap Year");
        }
            else
                {
            System.out.println("Not leap year");
        }


            int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = sc.nextInt();

        System.out.print("Input a year: ");
        double year1 = sc.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year1 % 400 == 0)||((year % 4 == 0 && year % 100 != 0))){
                number_Of_DaysInMonth = 29;
        } else {
            number_Of_DaysInMonth = 28;
        }
        break;
        case 3:
        MonthOfName = "March";
        number_Of_DaysInMonth = 31;
        break;
        case 4:
        MonthOfName = "April";
        number_Of_DaysInMonth = 30;
        break;
        case 5:
        MonthOfName = "May";
        number_Of_DaysInMonth = 31;
        break;
        case 6:
        MonthOfName = "June";
        number_Of_DaysInMonth = 30;
        break;
        case 7:
        MonthOfName = "July";
        number_Of_DaysInMonth = 31;
        break;
        case 8:
        MonthOfName = "August";
        number_Of_DaysInMonth = 31;
        break;
        case 9:
        MonthOfName = "September";
        number_Of_DaysInMonth = 30;
        break;
        case 10:
        MonthOfName = "October";
        number_Of_DaysInMonth = 31;
        break;
        case 11:
        MonthOfName = "November";
        number_Of_DaysInMonth = 31;
        break;
        case 12:
        MonthOfName = "December";
        number_Of_DaysInMonth = 31;
        break;


        }
        System.out.print(MonthOfName + " " + year1 + " has " + number_Of_DaysInMonth + " days\n");


        }

        }







