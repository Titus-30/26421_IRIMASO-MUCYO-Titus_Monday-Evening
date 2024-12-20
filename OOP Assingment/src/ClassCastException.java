import java.util.Scanner;

 class ClassCastExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Prompt the user to input a value
                System.out.print("Enter a string to store as an Object or type 'exit' to quit: ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) break;

                // Store the input as an Object
                Object obj = input;

                // Attempt to cast it to an Integer (invalid cast)
                Integer num = (Integer) obj;
                System.out.println("Converted number: " + num);
                break;
            } catch (ClassCastException e) {
                // Handle invalid type casting
                System.out.println("Error: Cannot cast the input to Integer. Please try again.");
            }
        }
    }
}
