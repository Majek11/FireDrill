import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double total = 0;
        int count = 1;
        
        while (count <= 10) {
            System.out.print("Enter score " +  count + " : ");
            double score = userInput.nextDouble();
            if (score % 2 == 0) {
                total = total + score;
            }
            count = count + 1;
        }
        
        System.out.printf("Sum of even numbers is: %.2f%n", total);
    }
}
