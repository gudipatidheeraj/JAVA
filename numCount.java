import java.util.Scanner;
public class numCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of input: ");
        int n = input.nextInt();
        int count = 0;
        while( n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count += 1;
            }
            n /= 10;
        }
        System.out.print("Count of number is: " + count);
        }
    }
