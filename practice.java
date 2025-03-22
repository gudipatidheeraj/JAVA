import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value one: ");
        int a = input.nextInt();
        System.out.print("Enter value two: ");
        int b = input.nextInt();
        System.out.print("Enter value three: ");
        int c = input.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }

        if ( c > max) {
            max = c;
        }
        System.out.println("Max number is: " + max);
    }
}