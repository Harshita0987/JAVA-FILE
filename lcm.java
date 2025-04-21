import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,m,a,b,l;
        System.out.println("Enter first number :");
        a=s.nextInt();
        System.out.println("Enter second number :");
        b=s.nextInt();
        m=(a>b)?a:b;
        for(i=m; ;i=i+m) {
            if(i%a==0 && i%b==0)
            {
            
                System.out.println("LCM ="+i);
                break;
            }
        }
    }
}
          
              
        
    


          
        

