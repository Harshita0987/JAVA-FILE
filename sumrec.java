import java.util.Scanner;
public class sumrec {
static int sum=0;
    static void rec(int n , int limit) {
        
        if(n>limit)
        {
            return;
        }
        sum=sum+n;
        if(n%2==0) {
        System.out.println(n+ "even no , Sum = "+sum);
        }
        else {
        System.out.println(n+ "odd no , Sum = "+sum);
        }
        rec (n+1,limit);
        }
        public static void main(String ar[]) {
        Scanner s=new Scanner(System.in);
        int limit;
        System.out.println("Enter number :");
        limit=s.nextInt();
        rec(1,limit);
    }
}

