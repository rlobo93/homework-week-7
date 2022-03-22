package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *
 */
public class Program3InputStudentName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String g = "";
        String r = "";


        System.out.println("Enter Student Name : ");
        String a = sc.next();

        System.out.println("Enter Student roll number");
        int b = sc.nextInt();

        System.out.println("Enter Maths Marks");
        int math = sc.nextInt();




        if (math <0 || math >100) {
            do {
                System.out.println("invalid input");
                System.out.println("Enter Maths Marks");
                math = sc.nextInt();

            }while (math <0 || math >100);
        }


        System.out.println("Enter Science Marks");
        int sci = sc.nextInt();

        if (sci < 0 || sci > 100) {
            do {
                System.out.println("invalid input");
                System.out.println("Enter Science Marks");
                sci = sc.nextInt();
            }while (sci <0 || sci >100);
        }


        System.out.println("Enter English Marks");
        int eng =sc.nextInt();

        if (eng <0 || eng >100) {
            do {
                System.out.println("invalid input");
                System.out.println("Enter English Marks");
                eng = sc.nextInt();
            }while (eng <0 || eng >100);
        }
        System.out.println("Enter English Marks");



        int t = (math + sci + eng);
        double p = t / 300.0 * 100.0;

        if (p >= 80) {
            g = "A+";
            r = "Pass";
        }else if (p >= 60) {
            g = "A";
            r = "Pass";
        }else if (p >=70) {
            g = "B";
            r = "Pass";
        }else if (p >= 50) {
            g = "C";
            r = "Pass";
        }else if (p >= 35) {
            g = "C";
        }else if (p <35) {
            r = "Pass";
        }



        System.out.println("_________________________________");
        System.out.println("|                               |");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.println("|    Name :  "     +a+"                |");
        System.out.println("|    Roll No:  " +b+"                |");
        System.out.println("|_______________________________|");
        System.out.println("|    Subjects   :               |");
        System.out.println("|_______________________________|");
        System.out.println("|    Maths      :     " +math+"        |");
        System.out.println("|    Science      :   " +sci+"        |");
        System.out.println("|    English      :   "+eng+"        |");
        System.out.println("|_______________________________|");
        System.out.println("|    Total       :   "+t+"        |");
        System.out.println("|_______________________________|");
        System.out.println("|    Percentage   :  "+p+"       |");
        System.out.println("|    Result       :  "+r+"       |");
        System.out.println("|    Grade        :  "+g+"         |");
        System.out.println("|_______________________________|");


    }

}
