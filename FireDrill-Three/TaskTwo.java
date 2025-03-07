import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        
        int count = 0;
        while (count < 10) {
            System.out.print("Enter score " + (count + 1) + ": ");
            scores[count] = scanner.nextDouble();
            count = count + 1;
        }
        
        count = 0;
        while (count < 10) {
            System.out.printf("%.0f%n ",scores[count]);
            count = count + 1;
        }
    }
}

