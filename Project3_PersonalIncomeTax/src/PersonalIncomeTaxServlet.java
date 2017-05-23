import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonalIncomeTaxServlet.php")
public class PersonalIncomeTaxServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		double salary=Double.parseDouble(req.getParameter("salary"));
		double bonus=Double.parseDouble(req.getParameter("bonus"));
		double total_salary=salary+bonus;
		
		final double PERSONAL_INCOME_TAX_LEVEL_1=0.05*total_salary;//salary<5(trđ)
		final double PERSONAL_INCOME_TAX_LEVEL_2=0.1*total_salary-250;//5->10(trđ)
		final double PERSONAL_INCOME_TAX_LEVEL_3=0.15*total_salary-750;//10->18(trđ)
		final double PERSONAL_INCOME_TAX_LEVEL_4=0.2*total_salary-1650;//18->32(trđ)
		final double PERSONAL_INCOME_TAX_LEVEL_5=0.25*total_salary-3250;//32->52(trđ)
		final double PERSONAL_INCOME_TAX_LEVEL_6=0.3*total_salary-5850;//52->80(trđ)
		final double PERSONAL_INCOME_TAX_LEVEL_7=0.35*total_salary-9850;//salary>80(trđ)
		
		String personal_income_tax;
		DecimalFormat df = new DecimalFormat("#");
		
		if(salary<=0)
		{
			 PrintWriter out = resp.getWriter();
			 out.println("<script type=\"text/javascript\">");
			 out.println("alert('Input salary incorrect!');");
			 out.println("location='PersonalIncomeTaxForm.jsp';");
			 out.println("</script>");
		}
		else if(salary>0 && salary<5000)
		{
			personal_income_tax=String.valueOf(df.format(PERSONAL_INCOME_TAX_LEVEL_1));
			req.setAttribute("PersonalIncomeTaxResult", personal_income_tax);
			req.getRequestDispatcher("PersonalIncomeTaxParam.jsp").forward(req, resp);
		}
		else if(salary>=5000 && salary<10000)
		{
			personal_income_tax=String.valueOf(df.format(PERSONAL_INCOME_TAX_LEVEL_2));
			req.setAttribute("PersonalIncomeTaxResult", personal_income_tax);
			req.getRequestDispatcher("PersonalIncomeTaxParam.jsp").forward(req, resp);
		}
		else if(salary>=10000 && salary<18000)
		{
			personal_income_tax=String.valueOf(df.format(PERSONAL_INCOME_TAX_LEVEL_3));
			req.setAttribute("PersonalIncomeTaxResult", personal_income_tax);
			req.getRequestDispatcher("PersonalIncomeTaxParam.jsp").forward(req, resp);
		}
		else if(salary>=18000 && salary<32000)
		{
			personal_income_tax=String.valueOf(df.format(PERSONAL_INCOME_TAX_LEVEL_4));
			req.setAttribute("PersonalIncomeTaxResult", personal_income_tax);
			req.getRequestDispatcher("PersonalIncomeTaxParam.jsp").forward(req, resp);
		}
		else if(salary>=32000 && salary<52000)
		{
			personal_income_tax=String.valueOf(df.format(PERSONAL_INCOME_TAX_LEVEL_5));
			req.setAttribute("PersonalIncomeTaxResult", personal_income_tax);
			req.getRequestDispatcher("PersonalIncomeTaxParam.jsp").forward(req, resp);
		}
		else if(salary>=52000 && salary<80000)
		{
			personal_income_tax=String.valueOf(df.format(PERSONAL_INCOME_TAX_LEVEL_6));
			req.setAttribute("PersonalIncomeTaxResult", personal_income_tax);
			req.getRequestDispatcher("PersonalIncomeTaxParam.jsp").forward(req, resp);
		}
		else//>80000
		{
			personal_income_tax=String.valueOf(df.format(PERSONAL_INCOME_TAX_LEVEL_7));
			req.setAttribute("PersonalIncomeTaxResult", personal_income_tax);
			req.getRequestDispatcher("PersonalIncomeTaxParam.jsp").forward(req, resp);
		}
		
		
		
		
	}
	
}
