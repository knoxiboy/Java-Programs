import java.sql.*; 

public class JDBC7{ 
    public static void main(String args[]){
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "knox";

        String withdrawQuery = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
        String depositQuery = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

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

            con.setAutoCommit(false); // Disable auto-commit mode

            try{
                // Prepare statements for withdrawal and deposit
                PreparedStatement withdrawStmt = con.prepareStatement(withdrawQuery);
                PreparedStatement depositStmt = con.prepareStatement(depositQuery);
                
                withdrawStmt.setDouble(1, 500.0); // Amount to withdraw
                withdrawStmt.setString(2, "acc456"); // Account ID for withdrawal

                depositStmt.setDouble(1, 500.0); // Amount to deposit
                depositStmt.setString(2, "acc1234"); // Account ID for deposit

                int rowsAffected1 = withdrawStmt.executeUpdate();
                int rowsAffected2 = depositStmt.executeUpdate();

                if(rowsAffected1 > 0 && rowsAffected2 > 0) {
                    System.out.println("Withdrawal and deposit successful!");
                } 
                else {
                    System.out.println("No rows affected, transaction will be rolled back.");
                    con.rollback(); // Rollback if no rows were affected
                    return;
                }
            }
            catch (SQLException e) {
                System.out.println("Error in transaction: " + e.getMessage());
            } finally {
                con.setAutoCommit(true); // Re-enable auto-commit mode
                con.close(); // Close the connection
                System.out.println("Connection closed.");
            }

        } 
        catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
    }
}