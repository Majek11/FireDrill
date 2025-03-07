import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] scores = new double[10];
        
        int count = 0;
        while (count < 10) {
            System.out.print("Enter score " + (count + 1) + ": ");
            scores[count] = userInput.nextDouble();
            count += 1;
        }
        
        count = 0;
        while (count < 10) {
            System.out.printf("%.0f ", scores[count] );
            count += 1;
        }
        System.out.println();
    }
}























/*
1. Collect 10 scores and put them in an array
2.  Print array in TaskOne vertically
3.  Print array in TaskOne horizontally
4.  Write a function that takes an array and output an array containing the elements in the even index
5.  Write a function that takes an array and output an array containing the elements in the odd index
6.  Write a function that takes the output of TaskFour and returns the Sum
7.  Write a function that takes the output of TaskFive and returns the Sum
 */

