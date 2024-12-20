import java.sql.*;
import java.util.Scanner;

 class SQLExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Ask the user for the database URL
                System.out.print("Enter database URL (e.g., jdbc:mysql://localhost:3306/db) or type 'exit' to quit: ");
                String dbUrl = scanner.nextLine();
                if (dbUrl.equalsIgnoreCase("exit")) break;

                // Attempt to connect to the database
                Connection conn = DriverManager.getConnection(dbUrl, "user", "password");
                System.out.println("Database connection successful.");
                conn.close();
                break;
            } catch (SQLException e) {
                // Handle SQL exceptions
                System.out.println("Error: Unable to connect to the database. Please try again. (" + e.getMessage() + ")");
            }
        }
    }
}
