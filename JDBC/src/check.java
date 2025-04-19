import java.sql.*; 

// JDBC driver name and database URL
public class check{ 
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/students",
            "root",
            "knox");

            // Execute a query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from t1");
            while(rs.next()){
                // Retrieve by column name
                System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
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