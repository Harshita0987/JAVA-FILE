import java.util.Scanner;
public class factrec {
    static int fact(int n) {
        int f;
        if(n==0)
            return 1;
        else 
        f=n*fact(n-1);
    return f;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,r;
        System.out.print("Enter number :");
        n=s.nextInt();
        r=fact(n);
        System.out.println(" Factorial = "+r);

    }
    }
    
    

