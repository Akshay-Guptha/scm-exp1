import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose operation: 1-Add  2-Subtract  3-Multiply");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;
            case 2:
                System.out.println("Difference = " + (a - b));
                break;
            case 3:
                System.out.println("Product = " + (a * b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
