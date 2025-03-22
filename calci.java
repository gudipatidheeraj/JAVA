import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number One: ");
        int num1 = input.nextInt();
        System.out.print("Enter number Two: ");
        int num2 = input.nextInt();
        int result = 0;
        while (true) {
            System.out.print("Enter operation: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if(op == '+') {
                    result = num1 + num2;
                    System.out.print(result);
                    break;
                }
            if(op == '-') {
                result = num1 + num2;
                System.out.print(result);
                break;
            }
            if(op == '*') {
                result = num1 * num2;
                System.out.print(result);
                break;
            }
            if(op == '/' && num2 != 0) {
                result = num1 / num2;
                System.out.print(result);
                break;
            }
            else {
                System.out.print("Enter Valid Input.. ");
            }
            if(op == '%') {
                result = num1 % num2;
                System.out.print(result);
                break;
            }
            }
        else {
            System.out.print("Enter a valud input or operation");
        }
        }
    }
}
