import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// PreparedStatement example in JDBC

public class JDBC5 {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "knox";
        String query = "SELECT * FROM t1 where name = ?";

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
            // Statement stmt = con.createStatement(); -> normal statement
            PreparedStatement pstmt = con.prepareStatement(query); // Prepared statement
            pstmt.setString(1, "karan");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                // Retrieve data by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");

                // Display values
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Clean-up environment
            rs.close();
            pstmt.close();
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
    }
}
