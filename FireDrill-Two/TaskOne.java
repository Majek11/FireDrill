import java.util.Scanner;

public class TaskOne {
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
        
        System.out.printf("Sum is: %.2f%n", total);
    }
}
