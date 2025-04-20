import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3 {
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
            int rowsAffected = stmt.executeUpdate("DELETE FROM t1 WHERE id = 134;");
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully!");
            } else {
                System.out.println("No record found with the specified ID.");
            }

            // Clean-up environment
            stmt.close();
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
    }
}