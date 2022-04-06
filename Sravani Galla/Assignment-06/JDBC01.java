package Assig06;
import java.sql.*;

public class JDBC01 {

	private static String username;
	private static String password;
	private static String productid;
	private static String productname;
	private static String productprice;
	private static String productcategory;

	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = ("jdbc:mysql://localhost:3306/correct04","root","java");
		
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url,username,password);

			Statement st = con.createStatement();
			
			
			String sql="select * from product";
			PreparedStatement p = con.prepareStatement(sql);
			ResultSet rs=p.executeQuery();



			 System.out.println("Values of Product Table");
			
			  while(rs.next())
			  {
				  int pId=rs.getInt("productid");

				  String pName=rs.getString("productname");

				  int pPrice=rs.getInt("productprice");
				  String pCategory=rs.getString("productcategory");
				  
				
		
				System.out.println(productid + "\t\t" + productname + " \t" + productprice+ "\t" + productcategory);
				}
			 
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not configured!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

	


