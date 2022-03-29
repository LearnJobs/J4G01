// Program 01 : Write a program to display all records from product table, product table contains productid,productname,productprice & productcategory

package Assignement06;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DisplayAllProducts {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//loading a driver i.e. type-4 driver for mysql
			System.out.println("Driver is loaded");
	
			// connect to the sql instance and database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjobs", "root","password");
			System.out.println("Connection established");
			
			Statement statement = connection.createStatement();		//statement object is used to fire the queries
			ResultSet rs=statement.executeQuery("select * from product");
			System.out.println("ID    NAME    PRICE    CATEGORY");
			while(rs.next())
					System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getFloat(3)+"   "+rs.getString(4));
			}
		catch (ClassNotFoundException e) {
				System.err.println("Driver not configured");
		}
		catch (SQLException e) {
				System.err.println("Connection not established");
		}
	}
}
