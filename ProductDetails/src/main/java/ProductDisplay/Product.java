package ProductDisplay;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Product() {
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	      String name=request.getParameter("Product_name");
	      int id=Integer.parseInt(request.getParameter("Product_id"));
	      double price=Double.parseDouble(request.getParameter("Product_price"));
	      HttpSession session= request.getSession();
	      session.setAttribute("Product_name", name);
	      session.setAttribute("Product_id", id);
	      session.setAttribute("Product_price", price);
	      response.sendRedirect("Display.jsp");
	}
}
