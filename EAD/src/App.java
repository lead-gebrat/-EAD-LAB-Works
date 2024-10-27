import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;



public class App{
    static final String DB_URL= "jdbc:mysql://localhost:3306/students";
    static final String USERNAME= "root";
    static final String PASSCODE= "#1304102829Kl";

  public static void main(String [] args){
    try(Connection connection= DriverManager.getConnection(DB_URL, USERNAME, PASSCODE);
    Statement statement= connection.createStatement()){
        System.out.println("Connnected to the Database");

    }
    catch(SQLException e){
        e.printStackTrace();
    }
  }

}

