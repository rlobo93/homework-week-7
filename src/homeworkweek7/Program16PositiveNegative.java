package homeworkweek7;

import java.util.Scanner;

public class Program16PositiveNegative {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = 0;
        num=sc.nextInt();

        if(num>0){
            System.out.println("POSITIVE");
        }else if(num<0) {
            System.out.println("NEGATIVE");
        }else{
            System.out.println("ZERO");
        }

    }

}
