import java.io.*;

 class EOFExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
                // Prompt user to input a file name
                System.out.print("Enter a file name to read till EOF (or type 'exit' to quit): ");
                String fileName = consoleReader.readLine();

                // Exit condition
                if (fileName.equalsIgnoreCase("exit")) break;

                // Attempt to read file content until EOF
                DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
                while (true) {
                    System.out.println(dis.readByte());
                }
            } catch (EOFException e) {
                // Handle end-of-file condition
                System.out.println("End of file reached.");
                break;
            } catch (IOException e) {
                // Handle other IO exceptions
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
