import java.util.Scanner;

public class ifprog2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary of user: ");
        int salary = input.nextInt();
        if(salary > 10000) {
            salary += 5000;
        } 
        else if (salary == 10000) {
            salary += 3000;
            }
        
        else {
            salary += 2500;
        }
        System.out.println(salary);
    }
}