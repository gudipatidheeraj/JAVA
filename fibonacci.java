import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int i = 1;
        int nums = input.nextInt();
        int count = 10;
        while(count <= nums) {
            int temp = b;
            b = b + a;
            a = temp;
            count += 1;
        }
        System.err.println(b);
        }
}
