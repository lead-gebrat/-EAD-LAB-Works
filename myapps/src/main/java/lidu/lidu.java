package lidu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class lidu {

	public static void main(String[] args) {
		 // Database credentials
        String url = "jdbc:mysql://localhost:3306/students"; // Replace with your DB URL
        String user = "root"; 
        String password = "#1304102829Kl"; // Replace with your DB password

        try {
            // Establishing connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");
            connection.close(); // Close the connection when done
        } catch (SQLException e) {
            e.printStackTrace(); // Print the error stack trace
        }

	}

}
