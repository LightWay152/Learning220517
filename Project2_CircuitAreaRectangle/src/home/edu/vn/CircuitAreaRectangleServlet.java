package home.edu.vn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CircuitAreaRectangleServlet.php")
public class CircuitAreaRectangleServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		double length=Double.parseDouble(req.getParameter("length"));
		double width=Double.parseDouble(req.getParameter("width"));
		
		double circuit=(length+width)*2;
		double area=length*width;
		
		req.setAttribute("CircuitOfRectangle", circuit);		
		req.setAttribute("AreaOfRectangle", area);
		req.getRequestDispatcher("CircuitAreaRectangleParam.jsp").forward(req, resp);
		
		
	}
	
}
