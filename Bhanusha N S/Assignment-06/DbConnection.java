package jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
Connection con = null;
public DbConnection(){
}
public Connection myconnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
			System.out.println(con);
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return con;
}
}
