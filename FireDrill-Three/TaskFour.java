import java.util.Scanner;

public class TaskFour {
    // Function to get elements at even indexes
    public static double[] getEvenIndexes(double[] inputArray) {
        double[] result = new double[5]; 
        int resultIndex = 0;
        int i = 0;
        
        while (i < 10) {
            if (i % 2 == 0) { // Even index
                result[resultIndex] = inputArray[i];
                resultIndex = resultIndex + 1;
            }
            i = i + 1;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        
        // Collect 10 scores (same as TaskOne)
        int count = 0;
        while (count < 10) {
            System.out.print("Enter score " + (count + 1) + ": ");
            scores[count] = scanner.nextDouble();
            count = count + 1;
        }
        
        // Get even index array and print it
        double[] evenIndexes = getEvenIndexes(scores);
        count = 0;
        while (count < 5) {
            System.out.print(evenIndexes[count] + " ");
            count = count + 1;
        }
        System.out.println();
        
        scanner.close();
    }
}
