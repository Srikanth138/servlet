package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		String pcode=req.getParameter("pcode");
		String pname=req.getParameter("pname");
		res.sendRedirect("http://localhost:3036/TestApp2/second?pcode="+pcode+"&pname="+pname);
	}
}
