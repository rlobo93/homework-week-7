package homeworkweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 *
 */
public class Program19ArrayElements {

    public static void main(String[] args) {

        int [] numbers = new int[]{15,20,25,-30,-25,-30};
        int sum =0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum+numbers[i];
        double average = sum/numbers.length;
        System.out.println("Average value of array is : "+ average);


    }



}
