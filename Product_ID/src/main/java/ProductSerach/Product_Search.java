package ProductSerach;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Product_Search")
public class Product_Search extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		   PrintWriter out=response.getWriter();
		   int input=Integer.parseInt(request.getParameter("ID"));
		try
		{  	
			Class.forName("com.mysql.cj.jdbc.Driver");  	 
		    Connection search=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaneshan","root","Dhaneshan@2001");
		    String Query="Select * from Products where Productid = "+input;
		    Statement  a=search.createStatement();
			ResultSet rs =a.executeQuery(Query);		  
			if(rs.next()){
				    out.println("<table border=1>");
				    out.println("<tr>"
				    		+ "<th>Productid</th>"
				    		+ "<th>ProductName</th>"
				    		+ "<th>ProductPrice</th>"
				    		+ "</tr>");
				    out.println("<tr>");
					out.print("<td>"+rs.getInt("Productid")+"</td>");
					out.print("<td>"+rs.getString("ProductName")+"</td>");
					out.print("<td>"+rs.getInt("ProductPrice")+"</td>");
					out.println("</tr>");
					out.println("</table>");
			}else
				out.print("You enter the wrong Product id please back to main page enter the correct product id");
		}catch(Exception e) 
		{
			e.printStackTrace();
		}}}
