import java.util.Scanner;

public class soliddiamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=4;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");

            }
            System.out.println();
        }
            for(int i=n;i>=1;i--) {
                for(int j=1;j<=n-1;j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++) {
                    System.out.print("*");
                     
        }
        System.out.println();
    }
}
    }
    

