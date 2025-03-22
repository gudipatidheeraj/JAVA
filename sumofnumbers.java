// import java.util.Scanner;

// public class sumofnumbers {
//     public static void main(String[] main) {
//         int sum = 0;
//         Scanner input = new Scanner(System.in);
//         int num1 = input.nextInt();
//         while(num1 != 0) {
//             sum += num1 % 10;
//             num1 = num1 / 10;
//         }
//         System.out.print(sum);
//     }
// }


import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] main) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        while(num1 > 0) {
            int rev = num1 % 10;
            num1 = num1 / 10;
            int ans = rev * 10 + num1;
        }
        System.out.print(ans);
    }
}