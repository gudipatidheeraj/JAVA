import java.util.Scanner;
public class revOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;
        while(num > 0) {
            int mod = num % 10;
            num /= 10;
            ans = mod * 10 + ans;
        }
        System.out.print(ans);
    }
}
