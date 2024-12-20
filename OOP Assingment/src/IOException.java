import java.io.*;

 class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                // Prompt user to input a file name
                System.out.print("Enter a file name to read (or type 'exit' to quit): ");
                String fileName = consoleReader.readLine();

                // Exit condition
                if (fileName.equalsIgnoreCase("exit")) break;

                // Attempt to read the file
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                System.out.println("File read successfully.");
                break;
            } catch (IOException e) {
                // Handle IOException (e.g., file not found or inaccessible)
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}