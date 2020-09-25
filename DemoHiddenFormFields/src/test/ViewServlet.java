package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class ViewServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fName=req.getParameter("name");
		pw.println("welcome user :"+fName+"<br>");
		pw.println("<a href='logout'>Logout</a>");
	}
}
