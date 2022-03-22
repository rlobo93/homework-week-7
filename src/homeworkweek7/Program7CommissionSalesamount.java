package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then find this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7CommissionSalesamount {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double commission, salesamount,basicsalary;
        int ID;
        String name;

        System.out.println("Enter ID Number");
        ID = sc.nextInt();

        System.out.println("Enter Name");
        name = sc.next();

        System.out.println("Enter salesamount");
        salesamount = sc.nextDouble();

        System.out.println("Enter basicsalary");
        basicsalary = sc.nextDouble();

        if(salesamount>= 50000){
            System.out.println("Commission is " + salesamount *35/100);
        }else if(salesamount>=30000 ||  salesamount <50000){
            System.out.println("Commission is " + salesamount *20/100 );
        }else if(salesamount>=20000 ||  salesamount <30000) {
            System.out.println("Commission is " + salesamount *10/100);
        }else if(salesamount>=10000 ||  salesamount <20000) {
            System.out.println("Commission is " + salesamount *5/100);
        }
        else
            System.out.println("Commission is " + salesamount * 2/100);
        }


    }


