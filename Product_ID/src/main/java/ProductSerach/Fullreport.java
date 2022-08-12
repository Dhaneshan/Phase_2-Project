package ProductSerach;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Fullreport")
public class Fullreport extends HttpServlet 
{
  private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		    PrintWriter out=response.getWriter(); 
		    out.println("<table border=1>");
		    out.println("<tr>"+"<th>Productid</th>"+"<th>ProductName</th>"+"<th>ProductPrice</th>"+"</tr>");
		    try
			{  	
				Class.forName("com.mysql.cj.jdbc.Driver");  	 
			    Connection in=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaneshan","root","Dhaneshan@2001");
			    String Query="Select * from Products";
			    Statement  ans=in.createStatement();
			    ResultSet res =ans.executeQuery(Query);
			    while(res.next())
				{
					    out.println("<tr>");
					    out.print("<td>"+res.getInt("Productid")+"</td>");
						out.print("<td>"+res.getString("ProductName")+"</td>");
						out.print("<td>"+res.getInt("ProductPrice")+"</td>");
						out.println("</tr>");
				}
			    out.println("</table>");
			  }
			catch(Exception e) 
			{
				e.printStackTrace();
			}
}
}
