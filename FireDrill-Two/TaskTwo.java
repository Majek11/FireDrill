import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double total = 0;
        int count = 1;
        
        while (count <= 10) {
            System.out.print("Enter score " +  count + " : ");
            double score = userInput.nextDouble();
            total = total + score;
            count = count + 1;
        }
        
        double average = total / 10;
        System.out.printf("Average is: %.2f%n", average);
    }
}
