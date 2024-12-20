import java.util.Scanner;

 class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompt user to input an age
                System.out.print("Enter an age (or type '-1' to quit): ");
                int age = scanner.nextInt();

                // Exit condition
                if (age == -1) break;

                // Validate and set the age
                setAge(age);
                break;
            } catch (IllegalArgumentException e) {
                // Handle invalid argument exception
                System.out.println("Error: " + e.getMessage() + " Try again.");
            }
        }
    }

    // Method to validate age
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age set to: " + age);
    }
}
