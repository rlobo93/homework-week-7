package homeworkweek7;

/**
 *Write a Java program to test if an array contains a specific value
 *
 *
 */
public class Program20SpecificValue {

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {
                1343, 6425, 2423, 9873, 7654,
                7678, 2006, 3251, 8462, 2344,
                3455, 8532, 2412, 3541};
        System.out.println(contains(my_array1, 7654));
        System.out.println(contains(my_array1, 3251));
    }


}
