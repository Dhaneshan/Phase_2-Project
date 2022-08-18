package Insert;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@WebServlet("/product")
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public product() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	double price=Double.parseDouble (request.getParameter("price"));
	String name=request.getParameter("name");
	Ecommerce_product Dhaneshan=new Ecommerce_product();
	Dhaneshan.setName(name);
	Dhaneshan.setPrice(price);
	Configuration con =new Configuration().configure().addAnnotatedClass(Ecommerce_product.class);
	SessionFactory ses=con.buildSessionFactory();
	Session ses1=ses.openSession();
	Transaction tran=ses1.beginTransaction();
	ses1.save(Dhaneshan);
	tran.commit();
	}
}
