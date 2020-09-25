package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String pcode=req.getParameter("pcode");
		String pname=req.getParameter("pname");
		pw.println("======Display from second servlet=====<br>");
		pw.println("product code:"+pcode+"<br>");
		pw.println("product name:"+pname+"<br>");
	}
}
