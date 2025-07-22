import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC8 {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "knox";

        String query = "INSERT INTO employees(name, job_title, salary) VALUES(?, ?, ?)";

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
            
            // Set auto-commit to false
            con.setAutoCommit(false);

            // Execute a query
            PreparedStatement pstmt = con.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            while(true) {
                System.out.print("Enter employee name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter job title: ");
                String jobTitle = sc.nextLine();
                
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); // Consume the newline character

                pstmt.setString(1, name);
                pstmt.setString(2, jobTitle);
                pstmt.setDouble(3, salary);
                
                pstmt.addBatch(); // Add to batch

                System.out.print("Do you want to add another record? (yes/no): ");
                String response = sc.nextLine();
                if(!response.equalsIgnoreCase("yes")) {
                    break; // Exit the loop if the user does not want to add more records
                }
            }

            int[] updateCounts = pstmt.executeBatch();
            con.commit();
            System.out.println("Batch executed successfully! Number of records inserted: " + updateCounts.length);

            // Close the connection
            pstmt.close();
            con.close();
            
        } 
        catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
    }
}