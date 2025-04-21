import java.util.Scanner;
class cal
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = s.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = s.next().charAt(0);
        System.out.print("Enter second number: ");
        double n2 = s.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + result);

        
    }
}

