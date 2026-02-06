import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Simple Calculator");
        System.out.println("=================");

        while (running) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                running = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            String operation = "";

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "*";
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    result = num1 / num2;
                    operation = "/";
                    break;
            }

            System.out.println("\nResult: " + num1 + " " + operation + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}
