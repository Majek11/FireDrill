import java.util.Scanner;

public class TaskFour {

    public static double[] getEvenIndexes(double[] inputArray) {
        double[] result = new double[5]; 
        int resultIndex = 0;
        int i = 0;
        
        while (i < 10) {
            if (i % 2 == 0) {
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
        
        int count = 0;
        while (count < 10) {
            System.out.print("Enter score " + (count + 1) + ": ");
            scores[count] = scanner.nextDouble();
            count = count + 1;
        }
        
        double[] evenIndexes = getEvenIndexes(scores);
        count = 0;
        while (count < 5) {
            System.out.print(evenIndexes[count] + " ");
            count = count + 1;
        }
        System.out.println();
    }
}
