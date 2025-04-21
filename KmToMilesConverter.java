import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = s.nextDouble();
        
        // Conversion factor: 1 kilometer = 0.621371 miles
        double miles = kilometers * 0.621371;
        
        // Display the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        
        scanner.close();
    }
}

