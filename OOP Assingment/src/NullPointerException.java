import java.util.Scanner;

 class NullPointerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompt user to input a string
                System.out.print("Enter a string or press Enter for null (or type 'exit' to quit): ");
                String str = scanner.nextLine();

                // Exit condition
                if (str.equalsIgnoreCase("exit")) break;

                // Simulate null condition
                if (str.isEmpty()) str = null;

                // Attempt to access the string length
                System.out.println("String length: " + str.length());
                break;
            } catch (NullPointerException e) {
                // Handle null pointer exception
                System.out.println("Error: String is null. Try again.");
            }
        }
    }
}