

//import java.sql.ResultSet;
import java.sql.*;

public class JDBC_QUESTION_01 {

	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/learnJobs?useSSL=false";
		String username = "root";
		String password = "knr443";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			Statement st = con.createStatement();
			//System.out.println("Connected to Database");

			
			// System.out.println("Table Created");

			 /*st.executeUpdate("insert into product values(101,'Book',500,'Stationary')");
			 st.executeUpdate("insert into product values(154,'Shorts',250,'Garments')");
			 st.executeUpdate("insert into product values(187,'Cricket Kit',20000,'Sports')");
			 
			 st.executeUpdate("insert into product values(789,'Rocket',10000,'Space')");
			 st.executeUpdate("insert into product values(443,'Shirt',400,'Garments')");
			 st.executeUpdate("insert into product values(879,'Formal Dress',2000,'Garments')");
			*/ 
			 //System.out.println("Data added Successfully");
			
			String sql="select *from product";
			PreparedStatement p = con.prepareStatement(sql);
			ResultSet rs=p.executeQuery();



			 System.out.println("Values of Product Table");
			
			  while(rs.next())
			  {
				  int pId=rs.getInt("productId");

				  String pName=rs.getString("productName");

				  int pPrice=rs.getInt("productPrice");
				  String pCategory=rs.getString("productCategory");
				  
				
				System.out.println(pId + "\t\t" + pName + " \t" + pPrice+ "\t" + pCategory);
				}
			 
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not configured!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
