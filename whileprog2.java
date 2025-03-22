import java.util.Scanner;
public class whileprog2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = inp.nextInt();
        while (value < 10) {
            System.out.print(" " + value);
            value += 1;
        }
    }
} 