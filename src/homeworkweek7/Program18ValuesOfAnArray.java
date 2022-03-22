package homeworkweek7;

/**
 *Write a Java program to sum values of an array.
 *
 *
 */
public class Program18ValuesOfAnArray {
    public static void main(String[] args) {

        int x [] = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for (int i : x)
            sum +=i;
        System.out.println("The sum is " + sum);

    }



}
