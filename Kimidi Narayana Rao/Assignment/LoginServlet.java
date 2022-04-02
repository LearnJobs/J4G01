import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//import DatabaseConnection;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

  
  /**Process the HTTP Get request*/
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException
  {
	 String name = request.getParameter("t1");

	 String password = request.getParameter("t2");
	  try
	  {
		  Connection con = DatabaseConnection.initializeDatabase();
		  String sql = "insert into login values (?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  
		  ps.setNString (1,name);
		  ps.setNString (2,password);
		  
		  ps.executeUpdate();
		  ps.close();
		  con.close();
		  
		  PrintWriter pw= response.getWriter();
		  System.out.println("<html><body><b>Successfully Inserted" + "<b></body></html>");
		  
	  }
	  
	  catch (Exception e)
	  {
		 e.printStackTrace();
	  }
	  
  }
}
  
  
/*  
  res.setContentType("text/html");
  PrintWriter out = res.getWriter();
  //get the variables entered in the form
  //String uname = req.getParameter("t1");
  String paswd = req.getParameter("t2");
  
  
  try {
  // Load the database driver
  
  Statement st = con.createStatement();
  
  ResultSet rs;
  
 (sql);
  pst.setString(1, uname);
  pst.setString(2, paswd);
 
  int roc = pst.executeUpdate();
  // show that the new account has been created
  out.println(" Hello : ");
  out.println(" '"+uname+"'");
  pst.close();
  
  con.close();
  }
  
  catch(ClassNotFoundException e)
  {
	  System.out.println("Couldn't load database driver: " + e.getMessage());
  }
  catch(SQLException e)
  {
	  System.out.println("SQLException caught: " + e.getMessage());
  }
  catch (Exception e)
  {
	  System.out.println(e);
  }
  
  // Always close the database connection.
  
	 // if (connection != null) connection.close();
  
 
  }
  }*/
