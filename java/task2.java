import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter the number corresponding to the operation (1/2/3/4): ");
        int operation = scanner.nextInt();

        double result = 0;
        boolean validOperation = true;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of " + num1 + " + " + num2 + " is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of " + num1 + " - " + num2 + " is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of " + num1 + " * " + num2 + " is: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    result = num1 / num2;
                    System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
                }
                break;
            default:
                System.out.println("Invalid operation selection.");
                validOperation = false;
        }
        if (validOperation) {
            System.out.println("Operation completed successfully.");
        }
        scanner.close();
    }
}
