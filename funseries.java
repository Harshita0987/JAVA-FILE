/*import java.util.Scanner;

public class funseries {
   public static void main(String[] args) {
    double sum=0;
    Scanner s=new Scanner(System.in);
    int n,x;
    System.out.println("Enter a number :");
    n=s.nextInt();
    x=s.nextInt();
     
    
    for(int i=1,a=1;i<=n;i++,a+=2) {
        int fact=1;
        for(int j=1;j<=a;j++) 
            fact=fact*j;
        sum=sum+Math.pow(-1,i-1)*Math.pow(x,a)/fact;
        }
        System.out.println("Sum "+sum);

    }
}/* */

import java.util.Scanner;

public class funseries {
    public static void main(String[] args) {
        double sum = 0;
        Scanner s = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the number of terms (n): ");
        int n = s.nextInt();
        System.out.print("Enter the value of x: ");
        int x = s.nextInt();
        s.close();

        // Loop for series calculation
        for (int i = 1, a = 1; i <= n; i++, a += 2) {
            int fact = 1;

            // Factorial calculation
            for (int j = 1; j <= a; j++)  
                fact *= j;

            // Adding/subtracting terms
            sum += Math.pow(-1, i - 1) * (Math.pow(x, a) / fact);
        }

        // Output result
        System.out.println("Sum of the series: " + sum);
    }
}

  
    

