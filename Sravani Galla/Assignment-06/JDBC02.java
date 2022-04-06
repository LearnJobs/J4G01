package Assig06;
import java.sql.*;

public class JDBC02 {

	private static String username;
	private static String password;

	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = ("jdbc:mysql://localhost:3306/correct04","root","java");
	

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			Statement st = con.createStatement();
			//System.out.println("Connected to Database");

			
			String sql="select productName,productCategory from product where productCategory='Garments'";
			PreparedStatement p = con.prepareStatement(sql);
			ResultSet rs=p.executeQuery();



			 System.out.println("Values of Product Table where Category=Garments");
			
			  while(rs.next())
			  {

				  String pName=rs.getString("productName");

				  String pCategory=rs.getString("productCategory");
				  
				System.out.println(pName + "\t\t"+pCategory);
			  }
			 
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not configured!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

