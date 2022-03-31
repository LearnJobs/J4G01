import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "dimple");
			System.out.println("Connected to database");
			
			String username = "deepa";
			String password = "deepu";
         
			String query = "Select Username , Password from logintable where Username= ? AND Password = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				System.out.println("Valid Credentials");
			}else
				System.out.println("Invalid Credentials");
			

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


