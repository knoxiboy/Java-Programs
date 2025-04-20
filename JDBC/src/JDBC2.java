import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "knox";

        // Load the JDBC driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e.getMessage());
            return;
        }

        try {
            // Establishing the connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully!");

            // Execute a query
            Statement stmt = con.createStatement();
            int rowsAffected = stmt.executeUpdate("INSERT INTO t1 (id, name) VALUES (134, 'John Doe')");
            System.out.println("Insert operation completed successfully!");
            System.out.println("Rows affected: " + rowsAffected);

            // Clean-up environment
            stmt.close();
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
    }
}