import java.util.Scanner;

public class power {
    
    public static int power(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * power(b, e - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter exponent: ");
        int e = scanner.nextInt();
        
        scanner.close();
        
        int result = power(b, e);
        System.out.println(b + " raised to the power " + e + " is: " + result);
    }
}
