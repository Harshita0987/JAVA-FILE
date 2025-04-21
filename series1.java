import java.util.Scanner;
public class series1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,i,a,n;
        System.out.println("Enter number :");
        n=sc.nextInt();
        for(i=1,a=1;i<=n;i++,a++)
        sum=sum+a;
        System.out.println("Sum = "+sum);
    
}
}
