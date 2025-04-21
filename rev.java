import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Scanner for input
       String str = "Harshita";
       int len=str.length();
       String r = "";
       for(int i=len-1; i>=0; i--) {
        r=r+str.charAt(i);
       }
       System.out.println("Reversed string = "+r);
       }
    }
