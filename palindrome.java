import java.util.*;

public class palindrome {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int org = num;
    int rev = 0;
    while(num > 0) {
        int mod = num % 10;
        num = num / 10;
        rev = rev * 10 + mod;
    }
    if(org == rev) {
        System.out.println(true);
    }
    else {
        System.out.println(false);
    }
}
}