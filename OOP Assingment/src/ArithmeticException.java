import java.util.Scanner;

 class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompt user to input a divisor
                System.out.print("Enter a number to divide 100 by (or type '0' to quit): ");
                int divisor = scanner.nextInt();

                // Exit condition
                if (divisor == 0) break;

                // Attempt division
                int result = 100 / divisor;
                System.out.println("Result: " + result);
                break;
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Error: Cannot divide by zero. Try again.");
            }
        }
    }
}