import java.util.*;
import java.io.*;
import java.sql.*;
import java.util.Scanner;

// image handling in JDBC

public class JDBC6 {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "knox";
        //String imgPath = "C:\\Users\\HP\\OneDrive\\画像\\img\\img.png"; // path to the image file
        String folderPath = "C:\\Users\\HP\\OneDrive\\画像\\img\\"; // folder path for pasting images
        //String query = "INSERT INTO image_table (image_data) VALUES (?)"; // prepared statement for inserting image data
        String query = "SELECT image_data FROM image_table where image_id = (?)"; // prepared statement for selecting image data

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

            // // File input stream to read the image
            // FileInputStream fis = new FileInputStream(imgPath);
            // byte[] imgData = new byte[fis.available()];
            // fis.read(imgData);

            // PreparedStatement pstmt = con.prepareStatement(query);
            // pstmt.setBytes(1, imgData); // Set the image data in the prepared statement

            // int rowsAffected = pstmt.executeUpdate(); // Execute the update
            // if (rowsAffected > 0) {
            //     System.out.println("Image inserted successfully!");
            // }
            // else {
            //     System.out.println("Failed to insert image.");
            // }

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 1); // Assuming you want to select the image with image_id = 1

            ResultSet rs = pstmt.executeQuery(); // Execute the query to retrieve the image data
            if(rs.next()) {
                byte[] imgData = rs.getBytes("image_data"); // Get the image data from the result set
                if (imgData != null) {
                    // Save the image to a file
                    String outputPath = folderPath + "output_image.png"; // Specify the output path for the image
                    FileOutputStream fos = new FileOutputStream(outputPath);
                    fos.write(imgData);
                    System.out.println("Image retrieved and saved successfully at: " + outputPath);
                    
                } 
                else {
                    System.out.println("No image found for the specified ID.");
                }
            } 
            else {
                System.out.println("No record found with the specified ID.");
            }

            // Close the resources
            rs.close();
            pstmt.close();
            //fis.close(); // Close the FileInputStream if it was used
            con.close();
            
        } 
        catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
        }
        catch (FileNotFoundException e) {
            System.out.println("Image file not found: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error reading image file: " + e.getMessage());
        }
        
    }
}
