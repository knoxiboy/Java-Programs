import java.sql.*; 

// JDBC driver name and database URL
public class JDBC1{ 
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            // Create a connection to the database
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/students",
            "root",
            "knox");
            System.out.println("Connection Established");

            // Execute a query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from t1");
            System.out.println("Table contents:");
            while(rs.next()){
                // Retrieve by column name
                String name = rs.getString("name");
                int id = rs.getInt("id");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Clean-up environment
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}