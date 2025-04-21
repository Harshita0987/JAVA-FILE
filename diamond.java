import java.util.Scanner;
class diamond
{
    public static void main(String ar[])
    {
        int n,i,j; 
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number : ");
         n=s.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    

    

