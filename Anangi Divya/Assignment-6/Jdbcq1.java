package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","root","sysadmin");
		
			System.out.println("Connected to database");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select *from product1");
			
			while (rs.next()) {
				System.out.println("prodid: " +  rs.getInt(1) + "   " +"prodname: " + rs.getString(2)+"  "+ "prodaddress " + rs.getString(3));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not configured");
			// e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	}


