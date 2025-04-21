import java.util.Scanner;

public class dayinmonth {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter month: ");
        String m=s.nextLine();
        int day;
        switch(m) {

        case "jan":
        case "march":
        case "may":
        case "july":
        case "aug":
        case "oct":
        case "dec":
        day= 31;
        break;
       case "april":
        case "june":
        case "sep":
        case "nov":
        day =30;
        break;
        case "feb":
        day=28;
        break;
        default:
        System.out.println("Invalid month name ");
        return;
        }
        System.out.println("Number of days in " + m + " is:\n" + day);
    }
}
    
    



    
    

