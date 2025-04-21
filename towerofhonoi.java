
public class towerofhonoi {
    public static void towerOfHanoi(int n,String s,String h,String d ) {
        if(n<=0) {
            return;
        } 

        
        towerOfHanoi(n-1,s,h,d);
        System.out.println("transfer disk " + n + " from " + s + " to " + d);
        towerOfHanoi(n-1,h,d,s);
    }
            public static void main(String ar[]) {
                int n=3;
                towerOfHanoi(n,"A","B","C");


            }

        }

    
    

