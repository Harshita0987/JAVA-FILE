import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int c = 0;
        int i= number; // Store the original number

        

        // Use a do-while loop to count occurrences of digit '2'
        do {
            if (i % 10 == 2) {
                c++;
            }
            i /= 10;
        } while (i > 0);

        System.out.println("The digit '2' appears " + c );
        
        scanner.close();
    }
}
