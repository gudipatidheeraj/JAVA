import java.util.*;

public class primeornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        boolean isprime = true;

        if(num < 2) {
            isprime = false;
            System.out.println(" " + num + " Not a prime number");
        }
        else {
        for(int i = 2; i*i <= num;i++) {
            if(num % i == 0) {
                isprime = false;
                break;
            }
        }
    }
        System.out.println(num + " is " + isprime);
}
}