import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double total = 0;
        int evenCount = 0;
        int count = 1;
        
        while (count <= 10) {
            System.out.print("Enter score " +  count + " : ");
            double score = userInput.nextDouble();
            if (score % 2 == 0) {
                total += score;
                evenCount = evenCount + 1;
            }
            count = count + 1;
        }
        
        if (evenCount > 0) {
            double average = total / evenCount;
            System.out.printf("Average of even numbers is: %f%n", average);
        } else {
            System.out.println("No even numbers found");
        }
    }
}
