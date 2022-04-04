package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc3 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver is loaded");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/value1", "root", "sysadmin");
				System.out.println("Connected to database");
				
				String username = "divya";
				String password = "sysadmin";
	         
				String query = "Select Username , Password from logintable where Username= ? AND Password = ?";
				
				PreparedStatement pst = con.prepareStatement(query);
				pst.setString(1, username);
				pst.setString(2, password);
				
				ResultSet rs = pst.executeQuery();
				
				if(rs.next()) {
					System.out.println("Valid Credentials");
				}else
					System.out.println("Invalid Credentials");
				

			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Driver not configured");
				// e.printStackTrace();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

