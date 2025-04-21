import java.util.Scanner;
public class practiceq1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sub1,sub2,sub3;
        float sum,avg,CGPA;
        System.out.println("Enter marks of student 1:");
        sub1=s.nextInt();

        System.out.println("Enter marks of student 2:");
        sub2=s.nextInt();

        System.out.println("Enter marks of student 3:");
        sub3=s.nextInt();

        sum=sub1+sub2+sub3;

    System.out.println("Sum = "+sum);

    avg=sum/3;

    CGPA = avg/10;

    System.out.println("CGPA = "+CGPA);
    }
}
        

    

    
