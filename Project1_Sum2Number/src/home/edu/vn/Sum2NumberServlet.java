package home.edu.vn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sum2NumberServlet.php")
public class Sum2NumberServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
			req.setCharacterEncoding("utf-8");
			resp.setCharacterEncoding("utf-8");
			
			double a=Double.parseDouble(req.getParameter("numberA"));
			double b=Double.parseDouble(req.getParameter("numberB"));
			double sum=a+b;
			
			req.setAttribute("Sum2NumberParam", sum);
			req.getRequestDispatcher("Sum2NumberParam.jsp").forward(req, resp);
			
	}

}
