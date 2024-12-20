import java.util.Scanner;

 class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Ask the user for a class name to load
                System.out.print("Enter a class name to load (e.g., java.util.Scanner) or type 'exit' to quit: ");
                String className = scanner.nextLine();
                if (className.equalsIgnoreCase("exit")) break;

                // Attempt to load the specified class
                Class.forName(className);
                System.out.println("Class loaded successfully.");
                break;
            } catch (ClassNotFoundException e) {
                // Handle case when the class is not found
                System.out.println("Error: Class not found. Please try again. (" + e.getMessage() + ")");
            }
        }
    }
}
