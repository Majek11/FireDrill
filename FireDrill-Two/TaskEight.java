import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 1;
        
        while (count <= 10) {
            double score = -1;
            while (score < 0 || score > 100) {
                System.out.print("Enter score " +  count + " : ");
                score = scanner.nextDouble();
            }
            total = total + score;
            count = count + 1;
        }
        
        System.out.printf("Sum of valid scores is: %.2f%n", total);
    }
}
