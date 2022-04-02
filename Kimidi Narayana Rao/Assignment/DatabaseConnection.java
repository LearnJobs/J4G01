import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException
	{
		
		 String driver = "com.mysql.cj.jdbc.Driver"; 
	      String url = "jdbc:mysql:// localhost:3306/learnJobs?useSSL=false"; 
	     
	      String username = "root"; 
	      String password = "knr443"; 
	      
	      Class.forName(driver);

	      Connection con = DriverManager.getConnection(url, username, password); 
	      return con;
		
	}

}
