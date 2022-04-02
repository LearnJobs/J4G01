

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
			response.setContentType("text/html");
			
			String name=request.getParameter("entname");
			String email=request.getParameter("entmail");
			String password=request.getParameter("entpswd");
			
	//	HttpSession session=request.getSession();
		//	session.setAttribute("email",email);
			
			try
			{
				
				Connection con = DatabaseConnection.initializeDatabase();
				String sql ="insert into registration values(?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				
					ps.setString(1, name);
					ps.setString(2, email);
					ps.setString(3, password);
					
					PrintWriter out=response.getWriter();
					
					
				int i = ps.executeUpdate();
				if(i>0)
					System.out.println("You are successfully registered");
				//request.getRequestDispatcher("Welcome ").include(request,response);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.close();
	}
	
}
