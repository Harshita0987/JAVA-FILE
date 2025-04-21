import java.util.Scanner;
public class java1 {
    public static void main(String ar[]) {
    Scanner s=new Scanner(System.in);
    int sub1,sub2,sub3;
    float avg,sum,CGPA;
    System.out.print("Enter marks in subject 1 :");
    sub1=s.nextInt();

    System.out.print("Enter marks in subject 2 :");
    sub2=s.nextInt();

    System.out.print("Enter marks in subject 3 :");
    sub3=s.nextInt();

    sum=sub1+sub2+sub3;
    System.out.println("Sum = "+sum);
    avg=sum/3;
    CGPA = avg/10;

    System.out.println("CGPA = "+CGPA);
}
}
