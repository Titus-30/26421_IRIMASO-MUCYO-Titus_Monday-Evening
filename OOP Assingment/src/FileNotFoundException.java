import java.io.*;

 class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                // Prompt user to input a file name
                System.out.print("Enter a file name to open (or type 'exit' to quit): ");
                String fileName = consoleReader.readLine();

                // Exit condition
                if (fileName.equalsIgnoreCase("exit")) break;

                // Attempt to open the file
                FileInputStream file = new FileInputStream(fileName);
                System.out.println("File opened successfully.");
                break;
            } catch (FileNotFoundException e) {
                // Handle case where file is not found
                System.out.println("File not found. Try again.");
            } catch (IOException e) {
                // Handle other IO exceptions
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
