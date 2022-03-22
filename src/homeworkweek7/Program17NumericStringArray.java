package homeworkweek7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array
 *
 */

public class Program17NumericStringArray {
    public static void main(String[] args) {

        int [] array ={ 23,45,6,56,77,48,54,97,85,39,15,75,82,34,94};
        String[] array2={"jhon","car","book","cpu","gup","demo"};
        System.out.println("Original numeric array : "+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted numeric array : "+Arrays.toString(array));

        System.out.println("Original string array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : "+Arrays.toString(array2));

    }
}
