import java.util.Scanner;

public class swap {
    static void swap() {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of a :");
        a=s.nextInt();
        System.out.println("Enter value of b :");
        b=s.nextInt();
        a=a+b;
       b=a-b;
       a=a-b;
        
        System.out.println(" number after swapping  of a= "+a);
        System.out.println(" number after swapping of b= "+b);
    }
    public static void main(String[] args) {
        swap();
    }
}
    
