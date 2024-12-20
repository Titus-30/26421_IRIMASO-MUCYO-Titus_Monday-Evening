import java.util.Scanner;

 class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompt user to input an array index
                System.out.print("Enter an array index (or type '-1' to quit): ");
                int index = scanner.nextInt();

                // Exit condition
                if (index == -1) break;

                // Attempt to access the array element
                System.out.println("Value at index " + index + ": " + arr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle invalid array index
                System.out.println("Error: Invalid index. Try again.");
            }
        }
    }
}