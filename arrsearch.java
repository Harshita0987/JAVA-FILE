import java.util.Scanner;

public class arrsearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n=0;
        int[] m = new int[5];
        System.out.println("Enter elements :");
       
        for(i=0;i<n;i++)
        m[i]=s.nextInt();
        if (s.hasNextInt()) 
        System.out.println("Yes integer");
        else
        System.out.println("No integer");

    }
    
}
