import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n;
        int[] m= new int[5];
        
        System.out.println("Enter elements :");
        for(i=0;i<n;i++)
        {
        m[i]=s.nextInt();
        }
        System.out.println("reverse elements");
        for(i=n-1;i>=0;i--)
        {
        
            System.out.println(m[i]+" ");
        }
    }
}
       

    

 
