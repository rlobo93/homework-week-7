package homeworkweek7;

import java.util.Scanner;

public class Program5EmployeeId {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Id;
        double salary;
        String name;


        System.out.println("Enter Employee Id:");
        Id = sc.nextInt();
        System.out.println("Enter Employee Name:");
        name = sc.next();
        System.out.println("Enter Basic Salary:");
        salary = sc.nextDouble();
        double HRA = salary * 10 / 100.0;
        double TA = salary * 8 / 100.0;
        double DA = salary * 9 / 100.0;
        double PF = salary * 20 / 100.0;
        double gross = salary + HRA + TA + DA - PF;


        System.out.println("________________________________");
        System.out.println("|      Salary Slip             |");
        System.out.println("|                              |");
        System.out.println("|______________________________|");
        System.out.println("|Employee Id   :" + Id + "           |");
        System.out.println("|Employee Name :" + name + "            |");
        System.out.println("|______________________________|");
        System.out.println("|Basic Salary  :" + salary + "        |");
        System.out.println("|HRA 10%       :" + HRA + "         |");
        System.out.println("|TA 8%         :" + TA + "         |");
        System.out.println("|DA 9%         :" + DA + "         |");
        System.out.println("|PF - 20&      :" + PF + "         |");
        System.out.println("|______________________________|");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|Gross Salary  :" + gross + "        |");
        System.out.println("|==============================|");


    }





}
