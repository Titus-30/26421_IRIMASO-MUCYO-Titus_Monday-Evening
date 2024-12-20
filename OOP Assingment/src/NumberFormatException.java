import java.util.Scanner;

 class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Ask the user to input a number
                System.out.print("Enter a number (or type 'exit' to quit): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) break;

                // Attempt to convert the input to an integer
                int number = Integer.parseInt(input);
                System.out.println("Converted number: " + number);
                break;
            } catch (NumberFormatException e) {
                // Handle invalid number format
                System.out.println("Error: Invalid number format. Please enter a valid number.");
            }
        }
    }
}
