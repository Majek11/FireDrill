import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double total = 0;
        int count = 1;
        
        while (count <= 10) {
            System.out.print("Enter score " +  count + " : ");
            double score = userInput.nextDouble();
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 10) {
                total = total + score;
            }
            count = count + 1;
        }
        
        System.out.printf("Sum of even indexes is: %.2f", total);
    }
}
