package homeworkweek7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 *
 */
public class Program11Divide {
    public static void main(String[] args) {
        //numbers divided by 3
        System.out.println("Number Divided by 3 ");
        for(int i = 1;i<=100; i++){
            if (i%3==0){
                System.out.print(i+", ");
            }
        }
        //numbers divided by 5
        System.out.println();
        System.out.println("Number Divided by 5 ");
        for (int i=1; i<=100; i++){
            if (i % 5 ==0){
                System.out.print(i+", ");
            }
        }

    }
}
