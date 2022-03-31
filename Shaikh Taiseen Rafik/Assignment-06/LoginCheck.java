package Assignment6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginCheck {
	
	public static void main(String[] args) {
		try {
				Connection con=MyConnection.getConnection();
				System.out.println("Connected to database ");
			
				Scanner scan=new Scanner(System.in);
				System.out.print("Input username : ");
				String userName=scan.nextLine();
				System.out.print("Input password : ");
				String passWord=scan.nextLine();
			
				String userQuery="SELECT username,password from user WHERE userName=? AND password=?";
			
				PreparedStatement statement = con.prepareStatement(userQuery);
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
