import java.util.Scanner;

public class len {
public static void main(String ar[]) {
   
      Scanner s=new Scanner(System.in);
      
      int i,c=0;
      
 System.out.println(" Enter any string :");
   String st=s.nextLine();
   
   for(i=0;i<st.length();i++) {
   c++;
   }
   System.out.println("length = "+c);
}
}
/*import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int c=0;
         String st;
        System.out.print("Enter a string: ");
         st = scanner.nextLine(); // Read input

       

        // Using for loop to count characters manually
        for (int i = 0; i < st.length(); i++) {
            c++; // Increment count for each character
        }

        System.out.println("Length of the string: " + c);
        
        scanner.close();
    }
}/* */

