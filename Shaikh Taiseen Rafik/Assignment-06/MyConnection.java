package Assignment6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded ");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/learnjob","root","mysql");
		return con;
		
	}

}
