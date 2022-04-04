import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

   public class Jdbcq2
      {
      public static void main(String[] args)
	   {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = ("jdbc:mysql://localhost:3306/value1");
		String username="root";
		String password="sysadmin";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);

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

		} 
		catch (ClassNotFoundException e) {
			System.out.println("Driver not configured!!");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
//select productName from product where productCategory='Garments'package Connection;

