import java.util.*;
public class ctof {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter celsius to convert it to Fahrenheit: ");
        float celsius = input.nextFloat();
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("After converting to fahrenheit: " + fahrenheit);
    }
}
