import java.util.Scanner;

public class cons {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        scanner.close();
        
        // Find min, mid, and max without Math functions
        int min = a;
        int max = a;
        int mid = a;

        if (b < min) min = b;
        if (c < min) min = c;
        
        if (b > max) max = b;
        if (c > max) max = c;
        
        mid = a + b + c - min - max;
        
        // Check if they are consecutive
        if ((mid == min + 1) && (max == mid + 1)) {
            System.out.println("The numbers are consecutive.");
        } else {
            System.out.println("The numbers are not consecutive.");
        }
    }
}

