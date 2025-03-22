import java.util.Scanner;
public class breakContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your fruit of choice");
        String fruit = input.next();
        switch (fruit) {
            case "mango":
                System.out.print("color is Yellow");
                break;
            case "grape":
                System.out.print("It is small");;
                break;
            case "Strawberry":
                System.out.println("It is a nice fruit");
            default:
                System.out.print("fruits are healthy");
        
        }
    }
}


// there is a concept of enhanced switch which uss -> in it and looks simple
