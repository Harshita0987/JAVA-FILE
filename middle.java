
import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the string first
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int l = str.length();
        int middle = l / 2;

        if (l % 2 == 0) {
            // Even length: print two middle characters
            System.out.println("Middle characters: " + str.charAt(middle - 1) + str.charAt(middle));
        } else {
            // Odd length: print single middle character
            System.out.println("Middle character: " + str.charAt(middle));
        }
    }
}






    
    
