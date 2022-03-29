//Program 03 : Write a program to input username & password and check if that combination available in the table
//				Make sure you have user table in your database with username & password columns

package Assignement06;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginVerification {

	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");		//loading a driver i.e. type-4 driver for mysql
				System.out.println("Driver is loaded");
	
				// connect to the sql instance and database
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjobs", "root","password");
				System.out.println("Connection established");
			
				Scanner scan=new Scanner(System.in);
				System.out.print("Input username : ");
				String userName=scan.nextLine();
				System.out.print("Input password : ");
				String passWord=scan.nextLine();
			
				String userQuery="SELECT username,password from user WHERE username=? AND password=?";
			
				PreparedStatement statement = connection.prepareStatement(userQuery);
				statement.setString(1, userName);
				statement.setString(2, passWord); 
				ResultSet rs=statement.executeQuery();
				if(rs.next()==false)
					System.out.println("Invalid Login Credentials");
				else
					System.out.println("Login Successfully");
			}
		catch (ClassNotFoundException e) {
				System.err.println("Driver not configured");
		}
		catch (SQLException e) {
				System.err.println("You are not Registered user");
		}
	}
}
