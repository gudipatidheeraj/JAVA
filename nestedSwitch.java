import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();
            switch (empID) {
                case 1:
                    System.out.print("Dheeraj");
                    break;
                case 2:
                    System.out.print("Raja");
                    break;
                case 3:
                    System.out.print("HR(s) - ");
                    switch (department) {
                        case "TopLevelHR":
                            System.out.print("HR-Sanjay");
                            break;
                        case "MidLevelHR":
                            System.out.print("HR-Shikawat");
                            break;
                        default:
                            System.out.println("No more than One HR available!!");
                    }
                default:
                   System.out.println("Enter valid input..!");
        }
    }
}
