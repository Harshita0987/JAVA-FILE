import java.util.Scanner;

public class febo {
    // Method to print Fibonacci series
    static void series(int n) {
        int f = 0, si = 1, t;
        
        System.out.print("Fibonacci Series: " + f + " " + si);

        for (int i = 2; i < n; i++) { // Start loop from 2 as first two values are fixed
            t = f + si;
            System.out.print(" " + t);
            f = si;
            si = t;
            
        }
    }

    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();

            series(n);
        }

       
    }



        



        
    


